package com.github.yeahx4.observer

class Counter(private val listener: EventListener) {
    fun count() {
        for (i in 1..100) {
            if (i % 5 == 0) {
                listener.onEvent(i)
            }
        }
    }
}
