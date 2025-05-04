package com.bigeyetallman.btsfantasydraft2024.utils

class Urls {

    companion object {
        fun getPitcherUrl(page: Int): String {
            val pitcherUrl =
                "http://www.welcometopranking.com/baseball/?p=chart&searchType=MONTHLY&searchDate=&position=1&team=&page=1&orderBy=&orderSort="
            return "$pitcherUrl&page=$page"
        }

        fun getHitterUrl(page: Int): String {
            val hitterUrl =
                "https://www.welcometopranking.com/baseball/?p=chart&searchType=MONTHLY&searchDate=Y2025M05&position=T&team=&page=1&orderBy=&orderSort="
            return "$hitterUrl&page=$page"
        }
    }
}