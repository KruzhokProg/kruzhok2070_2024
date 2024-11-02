package org.example

import kotlin.math.abs

fun min2(a: Int, b: Int): Int {
    val min: Int
    if (a < b) {
        min = a
    } else {
        min = b
    }
    return min
}

fun predmax(a: Int, b: Int, c: Int): Int {
    var max: Int
    var predmax: Int
    if (a > b) {
        max = a
        predmax = b
    } else {
        max = b
        predmax = a
    }
    if (c > max) {
        max = c
        predmax = max
    } else if (c > predmax) {
        predmax = c
    }
    return predmax
}

fun distance(x1: Double, y1: Double, x2: Double, y2: Double): Double {
    val res = Math.sqrt(((x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2)).toDouble())
    return res
}

fun checkBelongToCircle(x: Double, y: Double, r: Double = 1): Boolean {
    var res: Boolean
    if (distance(x, y, 0.0, 0.0) <= r) {
        res = true
    } else {
        res = false
    }
    return res
}

fun checkBelongToRhomb(x: Double, y: Double): Boolean {
//    if (y <= -x + 1 && y <= x + 1 && y >= -x - 1 && y >= x - 1) {
    if (abs(x) + abs(y) <= 1) {
        return true
    } else {
        return false
    }
}

fun checkBelongToArea(x: Double, y: Double): Boolean {
    if (checkBelongToCircle(x, y) && !checkBelongToRhomb(x, y)) {
        return true
    } else {
        return false
    }
}

fun main() {
    println(checkBelongToRhomb(0.1, 1.1))
//    println(checkBelongToCircle(1, 1, 3, 13, 5))
//    println(distance(1, 3, 6, 1))
//    println(distance(2, 4, 5, 7))
//    var x = readln().toInt()
//    var y = readln().toInt()
//    var z = readln().toInt()
//    var w = readln().toInt()
//    var v = readln().toInt()
//    val res2 = min2(x, y)
//    val res3 = min2(res2, z)
//    val res31 = min2(min2(min2(x, y), z), w)
//    println(res31)
//    val res = predmax(predmax(x, y), z)
//    val res = predmax(predmax(x, y, z), w, v)
//    println(res)
}