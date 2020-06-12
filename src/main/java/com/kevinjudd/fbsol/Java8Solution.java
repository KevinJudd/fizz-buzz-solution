package com.kevinjudd.fbsol;

import java.util.stream.IntStream;

public class Java8Solution {

    private String message(int fb){
        if (fb % 15 == 0) {
            return "FizzBuzz";
        }
        if (fb % 3 == 0){
            return "Fizz";
        }
        if (fb % 5 == 0) {
            return "Buzz";
        }
        return Integer.toString(fb);
    }
    public void java8Solution(){
        IntStream.range(1, 101).forEach(
                nbr -> System.out.println(message(nbr))
        );
    }
}
