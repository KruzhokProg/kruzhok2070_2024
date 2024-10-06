package org.example

// Проверка на простоту числа
// 5, 11, 13, 17
// 4, 6
//fun main() {
//    var x = readln().toInt() // 23
//    // i=2..22
//    // 5 % i == 0
//    val bound = Math.sqrt(x.toDouble()).toInt() + 1 // i=2..5
//    for (i in 2..bound) { // i=2..1
//        if (x % i == 0){
//            println("Число составное")
//            println("Есть как минимум один делитель $i")
//            return // мгновенное завершение программы
//        }
//    }
//    println("Число простое")
//}

//if
//Поиск максимального значения
//fun main() {
//    var x = readln().toInt()
//    var y = readln().toInt()
//    var z = readln().toInt()
//    var w = readln().toInt()
//    var max: Int
//    var predmax: Int
//    if (x > y) {
//        max = x
//        predmax = y
//    } else {
//        max = y
//        predmax = x
//    }
//    if (z > max) {
//        predmax = max
//        max = z
//    } else if (z > predmax) {
//        predmax = z
//    }
//    if (w > max) {
//        predmax = max
//        max = w
//    } else if (w > predmax) {
//        predmax = w
//    }
//    println(predmax)
//}

//НОД и НОК
//НОД(24, 9) = 3
//НОК(5, 6) = 30
// Алгоритм Эвклида
//
//fun main() {
//    var a = readln().toInt()
//    var b = readln().toInt()
//    val ac = a
//    val bc = b
//    val nod: Int
//    val nok: Int
//    while (a != b) {
//        if (a > b) {
//            a = a - b
//        } else if (a < b) {
//            b = b - a
//        }
//    }
//    nod = a
//    // a * b = nod(a, b) * nok(a, b)
//    // nok(a, b) = a * b / nod(a, b)
//    nok = ac * bc / nod
//    println(nok)
//    println(nod)
//}

//Сложение дробей
fun main() {
    // 1
    // 24
    // 1
    // 36
    // 5 72
    // a/b + c/d = (a*nok/b + c*nok/d)/nok
    var a = readln().toInt()
    var b = readln().toInt()
    var c = readln().toInt()
    var d = readln().toInt()
    var b1 = b
    var d1 = d
    val nod: Int
    val nok: Int
    while (d != b) {
        if (d > b) {
            d = d - b
        } else if (d < b) {
            b = b - d
        }
    }
    nod = b
    nok = b1 * d1 / nod
    var res = (a * nok / b1 + c * nok / d1) * 1.0 / nok
    println(res)
}
// ДЗ
// postmin
// a/b + c/d + e/f
