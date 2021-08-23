package com.github.yeahx4.`object`

class Companion (val name: String) {
    companion object {
        var total = 0
    }

    var count = 0

    fun vote() {
        total++
        count++
    }
}
