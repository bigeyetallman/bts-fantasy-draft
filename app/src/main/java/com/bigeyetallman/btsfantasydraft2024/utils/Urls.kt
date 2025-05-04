package com.bigeyetallman.btsfantasydraft2024.utils

class Urls {

    companion object {
        fun getPitcherUrl(page: Int): String {
            val pitcherUrl =
                "https://www.welcometopranking.com/baseball/?p=chart&searchType=MONTHLY&searchDate=Y2025M05&position=1&team=&orderBy=&orderSort="
            return "$pitcherUrl&page=$page"
        }

        fun getHitterUrl(page: Int): String {
            val hitterUrl =
                "https://www.welcometopranking.com/baseball/?p=chart&searchType=MONTHLY&searchDate=Y2025M05&position=T&team=&orderBy=&orderSort="
            return "$hitterUrl&page=$page"
        }
    }
}
