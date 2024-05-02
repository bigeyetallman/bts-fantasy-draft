package com.bigeyetallman.btsfantasydraft2024.list

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.bigeyetallman.btsfantasydraft2024.databinding.UserChartListItemBinding.inflate
import com.bigeyetallman.btsfantasydraft2024.utils.Values


class MainUserChartListViewAdapter(
    private val context: Context,
    private val items: MutableList<UserChartItem>
) : BaseAdapter() {

    override fun getCount(): Int = items.size

    override fun getItem(position: Int): UserChartItem = items[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, view: View?, parent: ViewGroup?): View {
        val binding = inflate(LayoutInflater.from(context))

        if (position + 1 > items.size) {
            return binding.root
        }

        val item = items[position]

        binding.textViewRanking.text = (position + 1).toString()

        binding.textViewName.text = item.name

        binding.textViewTotalPoint.text = String.format("%.2f", item.totalPoint)
        binding.textViewTotalPoint.setTextColor(Color.parseColor(Values.userTeamTextColorMap[item.id]))

        if (position < 1) {
            binding.textViewScoreDifference.text = "-"
        } else {
            binding.textViewScoreDifference.text =
                String.format("%.2f", items[0].totalPoint - item.totalPoint)
        }

        return binding.root
    }
}