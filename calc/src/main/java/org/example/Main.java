package org.example;

import java.util.Scanner;

public class Main {
    public static int inputB(){
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
    public static void main(String[] args) {
        int b;
        b = inputB();
        System.out.println(b);
    }
}