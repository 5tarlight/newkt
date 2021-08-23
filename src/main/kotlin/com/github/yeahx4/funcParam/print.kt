package com.github.yeahx4.funcParam

fun printVar(value: String, func: (String) -> Unit) {
    func(value)
}
