package org.example;

public class Div {
    public static int div(int a, int b){
        if(b!=0){
            return a/b;
        }
        else{
            System.out.println("Нельзя делить на 0!");
            return 0;
        }
    }
}
