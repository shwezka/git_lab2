package org.example;

import java.util.Scanner;

public class Main {
    public static int div(int a, int b){
        if(b!=0){
            return a/b;
        }
        else{
            System.out.println("Нельзя делить на 0!");
            return 0;
        }
    }
    public static void main(String[] args) {
        System.out.println(div(6,2));
    }
}