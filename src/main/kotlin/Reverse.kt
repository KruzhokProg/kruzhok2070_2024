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
// 1/(1-x)
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

// 1/(1-x)^2
//fun main() {
//    var x = readln().toDouble()
//    val n = 100
//    var s = 0.0
//    for (i in 0..n-1) { // i=0..9
//        s += (i+1)*Math.pow(x, i*1.0)
//    }
//    println(s)
//    println(1/Math.pow(1-x, 2.0))
//}

// 1/(1-x)^3
//fun main() {
//    var x = readln().toDouble()
//    val n = 100
//    var s = 0.0
//    var koef = 1
//    for (i in 0..n-1) { // i=0, 1, 2
//        s += koef*Math.pow(x, i*1.0)
//        koef = koef + (i+2) // 6 + 4 = 10
//    }
//    println(s)
//    println(1/Math.pow(1-x, 3.0))
//}
// ДЗ*
// (1+x)^0.5
//fun main() {
//    var x = readln().toDouble()
//    val n = 10
//    var s = 1.0 + 0.5*x - 1/8*Math.pow(x, 2.0)
//    var chis = 3
//    var znam = 2*4*6
//    var sign = 1
//    for (i in 3..n-1) { // i=0..n-1
//        s += sign*(chis/znam)*Math.pow(x, i*1.0)
//        var chisCur = chis + 2 // 7
//        chis = chis*chisCur // 3*5*7
//        var znamCur = znam + 2
//        znam = znam*znamCur
//        sign = -sign
//    }
//    println(Math.pow(1+x, 0.5))
//    println(s)
//}

// Палиндром
// 12321
//fun main() {
//    var x = readln().toInt() // 123
//    var y = x
//    var res = 0
//    while (x != 0) {
//        val last = x % 10 // 1
//        x = x / 10 // 0
//        res = res * 10 + last // 32*10 + 1=321
//    }
//    println(res == y)
//}

// 123321
// брать каждый раз первую и последнюю цифру и проверять на равенство
fun main() {
    var x = readln().toInt() // 123
    var y = x
    var count = 0.0
    while (x != 0) {
        x = x / 10
        count++
    }
    // 123 % 100
    while (y != 0) {
        val first = (y / Math.pow(10.0, count - 1)).toInt()
        val last = y % 10
        y = y % Math.pow(10.0, count - 1).toInt()
        count = count - 2
        if (first != last) {
            println("Не палиндром")
            return
        }
        y = y / 10
    }
    println("Палиндром")
}