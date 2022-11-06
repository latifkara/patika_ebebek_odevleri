package com.javaGelisme;

import java.util.Scanner;

public class PrefectNumberClass {
    Scanner input = new Scanner(System.in);
    int number;
    // The function takes the number entered from the user.
    public void input(){
        System.out.print("bir sayi giriniz: ");
        number = input.nextInt();
    }
    // If the number we get from the user is divided by the index with the function,
    // it will assign it to the variable.
    public int getResult() {
        int result = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                result += i;
            }
        }
        return result;
    }
    // After the calculations are finished, it will print to the screen in the print function.
    public void print() {
        if (getResult() == number) {
            System.out.println(number + " Mükkemmel sayidir.");
        } else {
            System.out.println(number + " Mükkemmel sayi değildir.");
        }
    }
}
