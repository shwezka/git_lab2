package org.example;


import static org.example.InputA.inputA;
import static org.example.InputB.inputB;

import static org.example.Plus.plus;

public class Main {

    public static void main(String[] args) {
        int a;
        a = inputA();
        System.out.println(a);
        int b;
        b = inputB();
        System.out.println(b);
        System.out.println(plus(1,3));
    }
}