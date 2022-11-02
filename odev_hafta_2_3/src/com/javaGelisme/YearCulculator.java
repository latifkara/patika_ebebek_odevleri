package com.javaGelisme;

import java.util.Scanner;

public class YearCulculator {
    Scanner in = new Scanner(System.in);
    int yil;
    public void input(){
        System.out.print("Yili giriniz: ");
        yil = in.nextInt();
    }

    public void printValue(){
        if(yil % 4 == 0){
            if(yil % 100 == 0) {
                if (yil % 400 == 0) {
                    System.out.println(yil + " bir artık yıldır !");
                }else {
                    System.out.println(yil + " bir artık yıldır değildir !");
                }
            }else {
                System.out.println(yil + " bir artık yıldır !");
            }
        }else {
            System.out.println(yil + " bir artık yıldır değildir !");
        }
    }
}
