package com.example.lesson6test;

public class Math {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        if (b==0){
            return 0;
        }
        return a / b;
    }

    public String reverse(String words){
        String[] splitedWords = words.split(" ");
        return splitedWords[1]  + " " + splitedWords[0];
    }
}
