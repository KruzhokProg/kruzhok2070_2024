package org.example

fun main() {
//    +, -, *, /, %
//    var x: Int = readln().toInt()
//    var a1 = x / 1000
//    var a2 = (x % 1000) / 100
////    var a2 = (x / 100) % 10
//    var a3 = (x % 100) / 10
//    var a4 = x % 10
//    var res = a4 * 1000 + a3 * 100 + a2 * 10 + a1
//    println(res)
//    println("$a1 $a2 $a3 $a4")
//    -----------------
//    var x: Int = readln().toInt()
//    var a1 = (x / 8) % 2
//    var a2 = (x / 4) % 2
//    var a3 = (x / 2) % 2
//    var a4 = x % 2
//    println("$a1 $a2 $a3 $a4")

//    var x = 10
//    while (x != 0) {
////        println("красавчик")
//        print(x % 2)
//        x = x / 2
//    }
//    x /= 2
//    x += 1
//    x ++
//    x = x / 10
//    println(x)

//    -----------------
    var x = 'a'
    println(x.toInt())
    var y = 98
    println(y.toChar())
    var z = "zzzz"
    var s = 3
//    var l = z.length
//    println(l)
    for (item in z) {
        print(((item.toInt() - 97 + s + 26) % 26 + 97).toChar())
    }
//    println(-3%26)
    // ДЗ: Дописать программу шифра Цезаря для отрицательных шагов
    // когда s = -1,-2,... a -> z, y
}
