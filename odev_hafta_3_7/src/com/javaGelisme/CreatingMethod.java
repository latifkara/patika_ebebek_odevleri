package com.javaGelisme;

import java.util.Scanner;

public class CreatingMethod {
    Scanner scan = new Scanner(System.in);
    int n, temp;

    // get number from user.
    public void input() {
        System.out.print("N Sayısı : ");
        n = scan.nextInt();
        temp = n;
    }

    // To increase or subtract 5 by the number entered with getValue and get the result.
    public void getValue() {
        System.out.print("Çıktısı : ");
        while (true) {
            System.out.print(n + " ");
            if (n <= 0) {
                for (int i = n + 5; i <= temp; i += 5) {
                    System.out.print(i + " ");
                }
                break;
            }
            n -= 5;
        }
    }
}
