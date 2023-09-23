package com.example.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FizzBuzzApplicationTests {

    @Test
    void contextLoads() {
    }
    @Test
    void test1(){
        Assertions.assertArrayEquals(FizzBuz.print(30), "FizzBuzz".getBytes());
    }
    @Test
    void test2(){
        Assertions.assertArrayEquals(FizzBuz.print(6), "Fizz".getBytes());
    }
    @Test
    void test3(){
        Assertions.assertArrayEquals(FizzBuz.print(10), "Buzz".getBytes());
    }
    @Test
    void test4(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> FizzBuz.print(1) );
    }
}
