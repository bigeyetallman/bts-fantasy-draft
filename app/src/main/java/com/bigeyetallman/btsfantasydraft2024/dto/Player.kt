package com.bigeyetallman.btsfantasydraft2024.dto

data class Player(
    var id:Int = -1,
    var name: String = "",
    var type:Int = -1,
    var team: String = "",
    var userTeam: Int = -1,
    var point: Double = 0.0,
)

