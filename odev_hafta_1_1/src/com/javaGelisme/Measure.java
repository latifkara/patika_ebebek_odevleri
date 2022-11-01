package com.javaGelisme;

import java.util.Scanner;

public class Measure {
    double height;
    int kilo;
    double bodyMassIndex;
    public void input(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        this.height = scan.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        this.kilo = scan.nextInt();
    }

    public double getBodyMassIndex(){
        return this.kilo / (this.height * this.height);
    }

    public void printValue(){
        System.out.println("Vücut Kitle İndeksiniz : " + getBodyMassIndex());
    }
}
