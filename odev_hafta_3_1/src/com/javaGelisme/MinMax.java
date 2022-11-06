package com.javaGelisme;

import java.util.Scanner;

public class MinMax {
    Scanner input = new Scanner(System.in);
    int number, num1;
    int max = 0, min = 0;
    boolean control = false;

    public void input() {
        System.out.print("Kaç tane sayı gireceksiniz: ");
        number = input.nextInt();
    }

    public void culculateMinMax() {
        for (int i = 1; i <= number; i++) {
            System.out.print(i + ".Sayıyı giriniz: ");
            num1 = input.nextInt();

            if (!control) {
                max = num1;
                min = num1;
                control = true;
            }
            min = getMinValue();
            max = getMaxValue();
        }
    }
    public int getMinValue() {
        if (num1 < min && control) {
            min = num1;
        }
        return min;
    }
    public int getMaxValue() {
        if (num1 > max && control) {
            max = num1;
        }
        return max;
    }

    public void printValue(){
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }

    }

