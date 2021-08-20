package com.github.yeahx4.scoop

class Book {
    lateinit var name: String
    var price: Int = 0

    fun discount() {
        price -= 2000
    }
}
