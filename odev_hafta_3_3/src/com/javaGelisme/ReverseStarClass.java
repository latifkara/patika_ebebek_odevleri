package com.javaGelisme;

import java.util.Scanner;
    public class ReverseStarClass {

        Scanner input = new Scanner(System.in);
        int number;
        // number of digits will be taken from user.
        public void input() {
            System.out.print("Basamak Sayısı: ");
            number = input.nextInt();
        }
        // With the for loop, I first added the spaces and then added 2*index asterisks.
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
