package com.kevinjudd.fbsol

class Solution {
    fun ktSolution() {
        (1..100).forEach { i ->
            when {
                i.rem(15) == 0 -> println("FizzBuzz")
                i.rem(3) == 0 -> println("Fizz")
                i.rem(5) == 0 -> println("Buzz")
                else -> println(i)
            }
        }
    }
}