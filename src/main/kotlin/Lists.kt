package org.example

import kotlin.math.*

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
//    val numbers2 = arrayOf(-49, 21, -3, 84, 121, 600)
//    val imax = numbers2.indexOf(numbers2.max())
//    val imin = numbers2.indexOf(numbers2.min())
//    var sum = 0
//    for (i in imin+1..imax-1) {
//        sum += numbers2[i]
//    }
//    println(sum)
//    val res = numbers2.filterIndexed { index, number ->
//        index in (imin + 1)..<imax
//    }.sum()
//    println(res)

//    ДЗ:
//    1. Есть ли в массиве одинаковые числа
//    2. Удалить повторяющиеся элементы из массива
//    3. Найти два максимальных элемента массива

//    1. Первый способ (полный перебор)
//    val numbers2 = arrayOf(-49, 21, -3, 84, 121, 600, 84)
//    val count = numbers2.size
//    for (i in 0 until count) {
//        val elementToCheck = numbers2[i]
//        for (j in i+1 until count) {
//            if (elementToCheck == numbers2[j]) {
//                println("Есть одинаковое число $elementToCheck")
//                return
//            }
//        }
//    }
//    println("Нет одинаковых элементов")

//    2. Через сортировку
//    val numbers2 = arrayOf(-49, 21, -3, 84, 121, 600, 84)
//    val count = numbers2.size
//    numbers2.sort()
//    println(numbers2.joinToString(separator = " "))
//    for (i in 0 until count) {
//        if (numbers2[i] == numbers2[i+1]) {
//            println("Есть одинаковое число ${numbers2[i]}")
//            return
//        }
//    }

//    3.
//    val numbers2 = arrayOf(600, 600, 600, 600, 600, 600, 600)
//    val max = numbers2.max()
//    val predmax = numbers2.filter { it != max }.lastOrNull()
//    println("max: $max\npredmax: $predmax")

//    2. Первый способ (в лоб - примитивный подход)
//    val numbers2 = arrayOf(-49, 21, -3, 84, 21, 600, 84)
//    val listWithoutDuplicates: MutableList<Int> = mutableListOf()
//    val count = numbers2.size
//    numbers2.sort()
//    for (i in 0 until count - 1) {
//        if (numbers2[i] == numbers2[i + 1]) {
//            listWithoutDuplicates.add(numbers2[i])
//        }
//    }
//    println(listWithoutDuplicates)
//    val res = numbers2.filter { it !in listWithoutDuplicates }
//    println(res)

//    2. Через множество
//    val numbers2 = arrayOf(-49, 21, -3, 84, 21, 600, 84)
//    val res = numbers2.toSet()
//    println(res)


//    1. Найти в списке самую длинную возрастающую подпоследовательность
//    val num = arrayOf(-49, 21, 84, 21, 60, 84, 100, 200, 300, 1, 2, 3, 4, 5)
//    val count = num.size
//    val lastIndex = count - 1
//    var i: Int = 0
//    var countMax = 1
//    while (i < lastIndex) {
//        var cur = i
//        while (cur < lastIndex && num[cur] < num[++cur]) { }
//        if (cur == lastIndex) cur++
//        countMax = max(countMax, cur - i)
//        i = cur
//    }
//    println(countMax)

    // 2. Найти индексы элементов, которые дают нужную сумму
//    val num = arrayOf(-49, 21, -3, 84, 21, 600, 84)
//    val target = 551
//    // ответ: [1, 6]
//    num.sort()
//    var i = 0
//    var j = num.size - 1
//    while (i < j) {
//        val sum = num[i] + num[j]
//        if (sum > target) {
//            j--
//        } else if (sum < target) {
//            i++
//        } else {
//            println("${num[i]} ${num[j]}")
//            return
//        }
//    }

//    ДЗ Найти три числа в массиве = target

//    1. Plus One
//    You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
//    The digits are ordered from most significant to least significant in left-to-right order.
//    The large integer does not contain any leading 0's.
//    Increment the large integer by one and return the resulting array of digits.

//    Input: digits = [1,2,3]
//    Output: [1,2,4]
//    Explanation: The array represents the integer 123.
//    Incrementing by one gives 123 + 1 = 124.
//    Thus, the result should be [1,2,4].
//     --------------------------------------
//      byte - 1 байт -> 8 бит [-2^7...2^7-1] = [-128...127]
//      int - n = 4 байта = 32 бита -> [-2^(n-1)...2^(n-1)-1]
//      [-2^31...2^31-1]
//      long - 8 байт = 64 бита -> [-2^63...2^63-1]
//      N = 1000 -> long -> 8000 байт = 7.8 Кб
//      N = 1000_000 -> long -> 8_000_000 байт = 7.6 Мб
//      123456789 -> [1,2,3,4,5,6,7,8,9] -> 9 байт
//      12 -> [1,2] -> 2 байт
//      [1,2] + 7 -> [1, 9]
//      [1,2] + 9 -> [2,1]
//    --------------------------------------
//    Input: digits = [9]
//    Output: [1,0]
//    Explanation: The array represents the integer 9.
//    Incrementing by one gives 9 + 1 = 10.
//    Thus, the result should be [1,0].

    val input1 = arrayOf(1, 9, 9)
    val input2 = arrayOf(9, 9, 9, 9)
    val maxArraySize = max(input1.size, input2.size)
    val minArraySize = min(input1.size, input2.size)
    val output = Array(maxArraySize + 1) { 0 }
    val lastMaxIndex = maxArraySize - 1
    val lastMinIndex = minArraySize - 1
    var carry = 0
    var sum = 0
    var i = lastMaxIndex
    var j = lastMinIndex
    while (j >= 0 || (i >= 0 && carry != 0)) {
        if (j < 0 && carry != 0) {
            sum = input2[i] + carry
        } else {
            sum = input1[j] + input2[i] + carry
        }
        output[i + 1] = sum % 10
        carry = sum / 10
        i--
        j--
    }
    output[i + 1] = carry
    println(output.joinToString(separator = " "))
    //  ДЗ: Учесть случай одинаковых размеров массивов
//    2. Search Insert Position
//    Given a sorted array of distinct integers and a target value, return the index if the target is found.
//    If not, return the index where it would be if it were inserted in order.
//    You must write an algorithm with O(log n) runtime complexity.
//    Example 1:
//
//    Input: nums = [1,3,5,6], target = 5
//    Output: 2
//    Example 2:
//
//    Input: nums = [1,3,5,6], target = 2
//    Output: 1
//    Example 3:
//
//    Input: nums = [1,3,5,6], target = 7
//    Output: 4
}