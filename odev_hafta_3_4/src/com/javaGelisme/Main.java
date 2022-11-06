package com.javaGelisme;

public class Main {

    public static void main(String[] args) {
        // I got numbers between 1 and 100 with two for loops and printed those without divisors to the screen.
        for (int i = 2 ; i <= 100 ; i++){
            boolean control =  false;
            for (int j = 2 ; j < i ; j++){
                if(i % j == 0){
                    control = true;
                    break;
                }
            }
            if(!control){
                System.out.print(i + " ");
            }
        }
    }
}
