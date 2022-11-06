package com.javaGelisme;

import java.util.Scanner;

public class FibonacciSeriesclass {
    Scanner scan = new Scanner(System.in);
    int fibbonaciNumber;
    // To find the Fibonacci equivalent of the sent number using the formula f(x-1) + f(x-2) with the recursive method.
    public static int getFibonnaciNumber(int data){
        if(data == 1 || data == 2){
            return 1;
        }
        if (data == 0){
            return 0;
        }
        return getFibonnaciNumber(data - 1) + getFibonnaciNumber(data - 2);
    }
    // get number by user.
    public void input(){
        System.out.print("fibonnacı sayısını giriniz: ");
        fibbonaciNumber = scan.nextInt();
    }
    // With the for loop, it will print the Fibonacci series from 0 to the number entered by the user.
    public void print(){
        System.out.print("9 Elemanlı Fibonacci Serisi : ");
        for (int i = 0; i <= fibbonaciNumber; i++){
            System.out.print(getFibonnaciNumber(i) + " ");
        }
    }

}
