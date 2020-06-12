package com.kevinjudd.fbsol

import org.amshove.kluent.shouldNotBeEqualTo
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun`test that fizzbuzz works`(){
        //given
        val solution = Solution()

        // when
        //then
        solution.shouldNotBeEqualTo( null)
        solution.ktSolution()
    }
}