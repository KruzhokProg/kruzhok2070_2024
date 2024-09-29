package org.example

//5! = 1*2*3*4*5 = 120
//6! = 6*5*4*3*2*1 = 6 * 5! = 6 * 120 = 720
//(a+b)^2 = a^2 + 2ab + b^2
//(a+b)^3 = a^3 + 3a^2b + 3ab^2 + b^3
//(a+b)^10 =
// Бином Ньютона

// Фактораил числа
//fun main() {
//    var x = 7
//    var f = 1
//    for (i in 1..x) {
//        f = f * i
//    }
//    println(f)
//}

// Число сочетаний Cnm
//fun main() {
//    print("Введите число n: ")
//    var n = readln().toInt()
//    print("Введите число m: ")
//    var m = readln().toInt()
//    var fn = 1
//    for (i in 1..n) {
//        fn = fn * i
//    }
//    var fm = 1
//    for (i in 1..m) {
//        fm = fm * i
//    }
//    var fnm = 1
//    for (i in 1..(n-m)) {
//        fnm = fnm * i
//    }
//    var res = fn / (fm * fnm)
//    println(res)
//}

// Перечисление степеней ФСУ
//fun main() {
//    print("Введите число n: ")
//    var n = readln().toInt() // 4
//    for (i in 0..n) { // i = 0, 1, 2
//        println("${n-i} $i") // 4 0, 3 1, 2 2,...
//    }
//}
//4 0
//3 1

// Последовательность фиббоначи
//  1 1 2 3 5 8 ...
fun main() {
    var v1 = 1
    var v2 = 1
    var v3 = 1
    var next = 3
    print("1 1 1 ")
    for (i in 1..10) {
        next = v1 + v2 + v3
        v1 = v2
        v2 = v3
        v3 = next
        print("$next ")
    }
}








