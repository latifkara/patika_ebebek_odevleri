package com.javaGelisme;

import java.util.Scanner;
    public class ReverseStarClass {

        Scanner input = new Scanner(System.in);
        int number;
        public void input() {
            System.out.print("Basamak Sayısı: ");
            number = input.nextInt();
        }
        public void getReverseStar() {
            for (int i = number; i >= 1; i--) {
                for (int k = -1; k < (number - i); k++) {
                    System.out.print(" ");
                }
                for (int n = 1; n <= (2 * i) - 1; n++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
}
