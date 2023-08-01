package com.example.java3hw6

data class Music(
    val number:Int,
    val songTitle:String? = "неизвестная музыка",
    val singer:String? = "неизвестный певец",
    val time:String
):java.io.Serializable
