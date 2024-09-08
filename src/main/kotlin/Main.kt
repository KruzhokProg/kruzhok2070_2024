package org.example

fun main() {
    var x: Int = 2
    var y: Int = 5
    println("x=$x")
    println("y=$y")
    x = x + y
    y = x - y
    x = x - y
    println()
    println("x=$x")
    println("y=$y")
}