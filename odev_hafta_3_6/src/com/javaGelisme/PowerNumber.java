package com.javaGelisme;

import java.util.Scanner;

public class PowerNumber {
    Scanner scan = new Scanner(System.in);
    int firstNumber;
    int secondNumber;
    // I got the power of the number with the recursive method.
    static int getPowerNumber(int number, int powerNumber) {
        if (powerNumber == 0) {
            return 1;
        }
        return number * getPowerNumber(number, powerNumber - 1);
    }
    // get first and second number from user
    public void input(){
        System.out.print("Taban değeri giriniz : ");
        firstNumber = scan.nextInt();
        System.out.print("Üs değerini giriniz : ");
        secondNumber = scan.nextInt();
    }
    // print with this function after calculating the power number.
    public void print(){
        System.out.println("Sonuc : "+ getPowerNumber(firstNumber, secondNumber));
    }
}
