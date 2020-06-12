package com.kevinjudd.fbsol;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Java8SolutionTest {

    @Test
    public void testJava8Solution(){
        //given
        Java8Solution solution = new Java8Solution();

        //when, then
        assertNotNull(solution);
        solution.java8Solution();
    }
}
