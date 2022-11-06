package com.javaGelisme;

import java.util.Scanner;

public class PrimerNumber {
    Scanner scan = new Scanner(System.in);
    int num = 0;
    // Returning the result by dividing the number with the recursive method.
    static int getPrimeNumber(int number) {
        if (number == 1) {
            return 1;
        }

        return number / getPrimeNumber(number - 1);
    }
    // By processing the number entered by the user within the recursive method, if the result is greater than 1,
    // printing the prime number screen, if not, printing the output of prime value to the screen.
    public void getResultValue(){
        do {
            System.out.print("Sayı Giriniz : ");
            num = scan.nextInt();
            if (num == 0) {
                System.out.println(num + " sayısına bölünmez");
                continue;
            }
            if (getPrimeNumber(num) > 1) {
                System.out.println(num + " sayısı ASALDIR !");
            }else {
                System.out.println(num + " sayısı ASAL değildir !");
            }
        }while (num != 0);
    }
}
