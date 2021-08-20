package com.github.yeahx4.scoop

fun scope() {
    val book = Book().also {
        it.name = "YEAHx4's Book"
        it.price = 15000
    }

    book.let {
        println("${it.name} ₩${it.price}")
    }
}
