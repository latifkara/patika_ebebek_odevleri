package com.javaGelisme;

import java.util.Scanner;

public class Cashiers {
    double pear, apple, tomatoes, banana, eggplant;
    double result = 0;

    Cashiers(){
        this.pear = 2.14;
        this.apple = 3.67;
        this.tomatoes = 1.11;
        this.banana = 0.95;
        this.eggplant = 5.00;
    }
    public double getValue(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? :");
        this.result += scan.nextInt() * this.pear;
        System.out.print("Elma Kaç Kilo ? :");
        this.result += scan.nextInt() * this.apple;
        System.out.print("Domates Kaç Kilo ? :");
        this.result += scan.nextInt() * this.tomatoes;
        System.out.print("Muz Kaç Kilo ? :");
        this.result += scan.nextInt() * this.banana;
        System.out.print("Patılcan Kaç Kilo ? :");
        this.result += scan.nextInt() * this.eggplant;
        return this.result;
    }

    public void print(){
        System.out.println("Toplam Tutar : "+ getValue() + " TL");
    }


}
