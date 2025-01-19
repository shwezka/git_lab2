package org.example;

import static org.example.Minus.minus;
import static org.example.InputA.inputA;
import static org.example.InputB.inputB;
import static org.example.Plus.plus;
import static org.example.Mult.mult;

import static org.example.Div.div;

public class Main {
    public static void main(String[] args) {
        System.out.println("Выберите опцию:");
        System.out.println("1 -> Ввести А");
        System.out.println("2 -> Ввести В:");
        System.out.println("3 -> выполнить операцию +");
        System.out.println("4 -> выполнить операцию -");
        System.out.println("5 -> выполнить операцию *");
        System.out.println("6 -> выполнить операцию /");
        int a;
        a = inputA();
        System.out.println(a);
        int b;
        b = inputB();
        System.out.println(b);
        System.out.println(plus(1,3));
        System.out.println(mult(2,5));
        System.out.println(minus(1, 5));
        System.out.println(div(6,2));
    }
}