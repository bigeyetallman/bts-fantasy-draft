package com.bigeyetallman.btsfantasydraft2024

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import android.view.View.OnClickListener
import androidx.annotation.RequiresApi
import com.bigeyetallman.btsfantasydraft2024.databinding.ActivityMainBinding
import com.bigeyetallman.btsfantasydraft2024.list.MainUserChartListViewAdapter
import com.bigeyetallman.btsfantasydraft2024.list.UserChartItem
import com.bigeyetallman.btsfantasydraft2024.utils.CustomProgressDialog
import com.bigeyetallman.btsfantasydraft2024.utils.Urls
import com.bigeyetallman.btsfantasydraft2024.utils.Utils
import com.bigeyetallman.btsfantasydraft2024.utils.Values
import org.jsoup.Jsoup
import java.time.LocalDate
import java.util.LinkedList

class MainActivity : AppCompatActivity(), OnClickListener{

    companion object {
        private var TAG = ""
    }

    private lateinit var binding: ActivityMainBinding

    var values = Values()

    private var isLoading = false;
    private lateinit var loadingDialog: CustomProgressDialog

    private val totalPitcherPage = 12
    private var currentPitcherPage = 0

    private val totalHitterPage = 12
    private var currentHitterPage = 0

    private val userChartListItems = mutableListOf<UserChartItem>()
    private var mainUserChartListViewAdapter: MainUserChartListViewAdapter? = null
    private lateinit var headerUserChartListView: View

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        TAG = getString(R.string.title_activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textViewDay.text = LocalDate.now().toString()

        loadingDialog =
            Utils.getCustomProgressDialog(this, getString(R.string.loading_progress_message))!!

        headerUserChartListView = layoutInflater.inflate(
            R.layout.header_user_chart_list,
            null,
            false
        )

        binding.listViewUserChart.addHeaderView(headerUserChartListView)

        mainUserChartListViewAdapter =
            MainUserChartListViewAdapter(this, userChartListItems)
        binding.listViewUserChart.adapter = mainUserChartListViewAdapter

        init()

        initToBindEventListener()
    }


    private fun setIsLoading(value:Boolean){
        isLoading = value
        if(isLoading){
            if (!isFinishing) {
                loadingDialog.show()
            }
        }else{
            loadingDialog.dismiss()
        }
    }

    override fun onDestroy() {
        loadingDialog.dismiss()
        super.onDestroy()
    }

    private fun init() {
        getPointData()
    }

    private fun initToBindEventListener() {
        binding.btnRefresh.setOnClickListener(this)
    }

    private fun getPointData() {
        setIsLoading(true)
        currentPitcherPage = 0
        currentHitterPage = 0
        values = Values()
        getPitcherData()
    }


    private fun getPitcherData() {
        currentPitcherPage += 1

        val targetUrl = Urls.getPitcherUrl(currentPitcherPage)

        Thread {
            val doc = Jsoup.connect(targetUrl).get()

            val pitcherTableElement = doc.select(".rank_filed")

            val tableString = pitcherTableElement.text()

            val tableWordList = tableString.split(" ")

            Log.e(TAG, tableString)

            var index = 0
            for (word in tableWordList) {
                if (values.pitcherPlayerMap.containsKey(word)) {
                    val currentPlayer = values.pitcherPlayerMap[word]
                    if(tableWordList[index + 1] == currentPlayer?.team){
                        val point = tableWordList[index + 2].toDouble()
                        values.pitcherPlayerMap[word]?.point = point
                        var currentPoint = values.userTotalPointMap[currentPlayer.userTeam]
                        currentPoint = currentPoint?.plus(point)
                        if (currentPoint != null) {
                            values.userTotalPointMap[currentPlayer.userTeam] = currentPoint
                        }
                    }
                }
                index += 1
            }

            if(currentPitcherPage < totalPitcherPage){
                getPitcherData()
            }else{
                getHitterData()
            }

        }.start()
    }

    private fun getHitterData() {
        currentHitterPage += 1

        val targetUrl = Urls.getHitterUrl(currentHitterPage)

        Thread {
            val doc = Jsoup.connect(targetUrl).get()

            val hitterTableElement = doc.select(".rank_filed")

            val tableString = hitterTableElement.text()

            val tableWordList = tableString.split(" ")

            Log.e(TAG, tableString)

            var index = 0
            for (word in tableWordList) {
                if (values.hitterPlayerMap.containsKey(word)) {
                    val currentPlayer = values.hitterPlayerMap[word]
                    if(tableWordList[index + 1] == currentPlayer?.team){
                        val point = tableWordList[index + 2].toDouble()
                        values.hitterPlayerMap[word]?.point = point
                        var currentPoint = values.userTotalPointMap[currentPlayer.userTeam]
                        currentPoint = currentPoint?.plus(point)
                        if (currentPoint != null) {
                            values.userTotalPointMap[currentPlayer.userTeam] = currentPoint
                        }
                    }
                }
                index += 1
            }

            if(currentHitterPage < totalHitterPage){
                getHitterData()
            }else{
                setUserChartList()
            }

        }.start()
    }

    private fun setUserChartList() {

        var displayPitcherText = ""

        values.pitcherPlayerMap.forEach{entry ->
            displayPitcherText += entry.value.name + ": " + entry.value.point
            displayPitcherText += "\n"
        }

        Log.e(TAG, displayPitcherText)

        var displayHitterText = ""

        values.hitterPlayerMap.forEach{entry ->
            displayHitterText += entry.value.name + "(" + entry.value.team + "):" + entry.value.point
            displayHitterText += "\n"
        }

        Log.e(TAG, displayHitterText)

        var userTotalPointText = ""

        values.userTotalPointMap.forEach{entry ->
            userTotalPointText += Values.userTeamNameMap[entry.key] + ":" + String.format("%.2f", entry.value)
            userTotalPointText += "\n"
        }

        Log.e(TAG, userTotalPointText)

        val entries = LinkedList(values.userTotalPointMap.entries)
        entries.sortByDescending { it.value }

        Log.e(TAG, entries.toString())

        // 이 순서대로 리스트에 추가
        userChartListItems.clear()

        for(user in entries){
            Values.userTeamNameMap[user.key]
                ?.let { UserChartItem(user.key, it, user.value) }?.let { userChartListItems.add(it) }
        }

        Handler(Looper.getMainLooper()).post {
            mainUserChartListViewAdapter?.notifyDataSetChanged()
        }

        setIsLoading(false)
    }

    override fun onClick(v: View?) {
        when(v){
            binding.btnRefresh -> {
                getPointData()
            }
        }
    }

}