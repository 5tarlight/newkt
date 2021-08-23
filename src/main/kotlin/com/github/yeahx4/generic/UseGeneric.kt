package com.github.yeahx4.generic

class UseGeneric<T: GenSuper>(val t: T) {
    fun doShout() {
        t.shout()
    }
}
