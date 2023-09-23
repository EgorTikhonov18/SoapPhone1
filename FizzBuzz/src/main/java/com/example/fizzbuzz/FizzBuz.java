package com.example.fizzbuzz;

/*Напишите программу, которая выводит на экран массив байтов.
        При этом вместо чисел, кратных трем, программа должна выводить слово Fizz,
        а вместо чисел, кратных пяти — слово Buzz. Если число кратно пятнадцати,
        то программа должна выводить слово FizzBuzz. */
public class FizzBuz {
    public static byte[] print(int num){
        if (num % 3==0 && num % 5==0)
            return "FizzBuzz".getBytes();
            if (num % 3==0)
                return "Fizz".getBytes();
            if (num%5==0)
                return "Buzz".getBytes();
            throw new IllegalArgumentException("Not implemented yet");
    }
}
