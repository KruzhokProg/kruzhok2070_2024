package org.example

import kotlin.math.abs
import kotlin.math.sqrt

fun main() {
//    val numbers = arrayOf(10, 21, -3, 84, 105, 6)
//    val size = numbers.size
//    val lastIndex = size - 1
//    println(numbers[lastIndex])
//    println(numbers.last())
//    for (i in 0..lastIndex) {
//        println(numbers[i])
//    }
//    for (i in numbers.indices) {
//        if (i % 2 == 0) {
//            println(numbers[i])
//        }
//    }
//    numbers.forEach { number ->
//        println(number)
//    }
//    numbers.forEachIndexed { index, number ->
//        if (index % 2 == 0) {
//            println(number)
//        }
//    }
//    numbers.forEachIndexed { index, number ->
//        if (number % 2 == 0) {
//            numbers[index] = number * 2
//        } else {
//            numbers[index] = number * 3
//        }
//    }
//    numbers.forEach { number ->
//        print("$number ")
//    }
//    val positiveNumbers = numbers.filter { number ->
//        number > 0
//    }
//    val newNumbers = positiveNumbers.map { number ->
//        if (number % 2 == 0) {
//            number * 2
//        } else {
//            number * 3
//        }
//    }
//    newNumbers.forEach { number ->
//        print("$number ")
//    }
//    val numbers = arrayOf(10, 21, -3, 84, 105, 6)
//    numbers.filter { it > 0 }.map {
//        if (it % 2 == 0) {
//            it * 2
//        } else {
//            it * 3
//        }
//    }.forEach {
//        print("$it ")
//    }
    // Исходный массив, заполненный произвольными числами
    // привести к виду согласно следующему алгоритму:
    // если число чётное и стоит на чётном месте,
    // то возвести его в квадрат
    // если число нечётное и стоит на нечётном месте, то возвести его
    // в куб
    // иначе взять корень из модуля этого числа
//    val numbers = arrayOf(10, 21, -3, 84, 105, 6)
//    numbers.mapIndexed { index, number ->
//        if (number % 2 == 0 && index % 2 == 0) {
//            number * number
//        } else if (number % 2 != 0 && index % 2 != 0) {
//            number * number * number
//        } else {
//            Math.sqrt(abs(number.toDouble()))
//        }
//    }.forEach {
//        print("$it ")
//    }
    // Исходный массив, заполненный произвольными числами
    // привести к виду согласно следующему алгоритму:
    // оставить в массиве только числа, которые являются квадратом числа
    // и вывести их корень
//    49 = 7^2 -> 7
//    val numbers2 = arrayOf(49, 21, -3, 84, 121, 6)
//    numbers2.filter { sqrt(it*1.0).toInt()*1.0 == sqrt(it*1.0) }
//        .map { sqrt(it*1.0).toInt() }
//        .forEach { print("$it ") }

    // Поменять местами максимальный и минимальный элементы
//    val numbers2 = arrayOf(-49, 21, -3, 84, 121, 600)
//    var imax: Int = 0
//    var imin: Int = 0
//    numbers2.forEachIndexed { index, number ->
//        if (number > numbers2[imax]) {
//            imax = index
//        }
//        if (number < numbers2[imin]) {
//            imin = index
//        }
//    }
//
//    val tmp = numbers2[imax]
//    numbers2[imax] = numbers2[imin]
//    numbers2[imin] = tmp
//    numbers2.forEach { print("$it ") }
//    val imax = numbers2.indexOf(numbers2.max())
//    val imin = numbers2.indexOf(numbers2.min())
//    val tmp = numbers2[imax]
//    numbers2[imax] = numbers2[imin]
//    numbers2[imin] = tmp
//    numbers2.forEach { print("$it ") }

    // посчитать сумму между минимальным и максимальными элементами
    val numbers2 = arrayOf(-49, 21, -3, 84, 121, 600)
    val imax = numbers2.indexOf(numbers2.max())
    val imin = numbers2.indexOf(numbers2.min())
//    var sum = 0
//    for (i in imin+1..imax-1) {
//        sum += numbers2[i]
//    }
//    println(sum)
    val res = numbers2.filterIndexed { index, number ->
        index in (imin + 1)..<imax
    }.sum()
    println(res)

//    ДЗ:
//    1. Есть ли в массиве одинаковые числа
//    2. Удалить повторяющиеся элементы из массива
//    3. Найти два максимальных элемента массива
}