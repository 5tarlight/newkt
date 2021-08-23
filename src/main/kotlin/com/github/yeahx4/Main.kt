package com.github.yeahx4

import com.github.yeahx4.`object`.Companion
import com.github.yeahx4.`object`.Counter
import com.github.yeahx4.funcParam.printVar
import com.github.yeahx4.generic.GenA
import com.github.yeahx4.generic.GenB
import com.github.yeahx4.generic.GenC
import com.github.yeahx4.generic.UseGeneric
import com.github.yeahx4.observer.AnonymousEventPrinter
import com.github.yeahx4.observer.EventPrinter
import com.github.yeahx4.scoop.scope

fun main(args: Array<String>) {
    scope()
    printVar("hi") { str -> println(str) }

    println()
    println(Counter.count)
    Counter.countUp()
    println(Counter.count)
    Counter.countDown()
    println(Counter.count)
    println()

    val jjs = arrayOf(Companion("짜장"), Companion("짬봉"))

    for (j in jjs)
        j.vote()

    for (j in jjs)
        println("${j.count}, ${Companion.total}")

    println()
    EventPrinter().start()
    println()
    AnonymousEventPrinter().start()
    println()

    println()
    UseGeneric(GenA()).doShout()
    UseGeneric(GenB()).doShout()
    UseGeneric(GenC()).doShout()
}
