package org.example

// 1234567
// 7654321
//fun main() {
//    var x = readln().toInt() // 123
//    var y = x
//    var count = 0
//    while (x != 0) {
//        x = x / 10
//        count++
//    } // count = 3
//    var res = 0
//    for (i in (count - 1) downTo 0) { // i = 2, 1, 0
//        val last = y % 10 // 1
//        y = y / 10 // 0
//        res += last * Math.pow(10.0, i*1.0).toInt() // 321
//    }
//    println(res)
//}

// Вариант без подсчёта числа цифр
//fun main() {
//    var x = readln().toInt() // 123
//    var res = 0
//    while (x != 0) {
//        val last = x % 10 // 1
//        x = x / 10 // 0
//        res = res * 10 + last // 32*10 + 1=321
//    }
//    println(res)
//}

// разложение в ряд
//fun main() {
//    var x = readln().toDouble()
//    val n = 100
//    var s = 0.0
//    for (i in 0..n-1) { // i=0..9
//        s += Math.pow(x, i*1.0)
//    }
//    println(s)
//    println(1/(1-x))
//}

fun main() {
    var x = readln().toDouble()
    val n = 100
    var s = 0.0
    for (i in 0..n-1) { // i=0..9
        s += (i+1)*Math.pow(x, i*1.0)
    }
    println(s)
    println(1/Math.pow(1-x, 2.0))
}