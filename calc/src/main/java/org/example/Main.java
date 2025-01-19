package org.example;

import java.util.Scanner;

public class Main {
    public static int inputA(){
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
    public static void main(String[] args) {
        int a = 0;
        a = inputA();
        System.out.println(a);
    }
}