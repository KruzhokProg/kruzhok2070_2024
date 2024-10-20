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
//fun main() {
//    // 1
//    // 24
//    // 1
//    // 36
//    // 5 72
//    // a/b + c/d = (a*nok/b + c*nok/d)/nok
//    var a = readln().toInt()
//    var b = readln().toInt()
//    var c = readln().toInt()
//    var d = readln().toInt()
//    var b1 = b
//    var d1 = d
//    val nod: Int
//    val nok: Int
//    while (d != b) {
//        if (d > b) {
//            d = d - b
//        } else if (d < b) {
//            b = b - d
//        }
//    }
//    nod = b
//    nok = b1 * d1 / nod
//    var res = (a * nok / b1 + c * nok / d1) * 1.0 / nok
//    println(res)
//}
// ДЗ
// postmin
// a/b + c/d = (a*nok/b + c*nok/d)/nok
// (a*nok/b)/nok + (c*nok/d)/nok + (e*nok/f)/nok =
// ((a*nok/b) + (c*nok/d) + (e*nok/f)) / nok(b, d, f)

//Поиск минимального и постминимального значений
//fun main() {
//    var x = readln().toInt()
//    var y = readln().toInt()
//    var z = readln().toInt()
//    var w = readln().toInt()
//    var min: Int
//    var postmin: Int
//    if (x < y) {
//        min = x
//        postmin = y
//    } else {
//        min = y
//        postmin = x
//    }
//    if (z < min) {
//        postmin = min
//        min = z
//    } else if (z < postmin) {
//        postmin = z
//    }
//    if (w < min) {
//        postmin = min
//        min = w
//    } else if (w < postmin) {
//        postmin = w
//    }
//    println(postmin)
//}
// x! = x*(x-1)*(x-2)*...*1
// x!! = (x-0)*(x-2)*(x-4)*...*1
// Фактораил числа
//fun main() {
//    var x = 7 // 6*4*2
//    var f = 1
//    for (i in x downTo (x%2 + 1) step 2) { // i=1
//        f = f * i
//    }
//    println(f)
//}
//a, b -> sqrt(a^2+b^2)
//fun main() {
////    Math.sqrt()
//    for (i in 1..10){
//        for (j in 1..10) {
//            val res = Math.sqrt((i*i + j*j)*1.0)
//            if (res > 9) {
//                print( String.format("%.2f ", res) )
//            } else {
//                print( String.format(" %.2f ", res) )
//            }
//        }
//        println()
//    }
//}
//      *
//     ***
//    *****
//   *******
//  *********
// ***********
//*************
fun main() {
    val height = readln().toInt()//7, 8, 9
    val base = 2*height - 1 //13, 15, 17
    val whiteSpaces = (base - 1) / 2
    for (l in 0..height-1) {
        for (i in 1..whiteSpaces - l) {
            print(" ")
        }
        for (j in 1..2*l+1) {
            print("*")
        }
        println()
    }
}