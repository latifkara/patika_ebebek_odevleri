package com.javaGelisme;
import java.util.Scanner;

public class SortArray {
    Scanner scan = new Scanner(System.in);
    int[] numberList;
    int temp;
    int size;
    // set numbers entered from the user.
    public void input(){
        System.out.print("Dizinin boyutu n : ");
        size = scan.nextInt();
        System.out.println("Dizinin elemanlarını giriniz : ");
        numberList = new int[size];
        for (int i = 0; i < size; i++){
            System.out.print((i+1) + " Elemanı : ");
            numberList[i] = scan.nextInt();
        }
    }
    // With two for loops, each number is compared to the next number and replaces it,
    // and returns it to the array after the operation is finished.
    public int[] arraySorted(){

        for (int i = 0; i < size; i++){
            for (int j = i+1; j < size; j++){
                if (numberList[i] > numberList[j]){
                    temp = numberList[i];
                    numberList[i] = numberList[j];
                    numberList[j] = temp;
                }

            }
        }
        return numberList;
    }
    // prints the array to the screen.
    public void printArray(){
        System.out.print("Sıralama : ");
        for (int number:arraySorted()) {
            System.out.print(number + " ");
        }
    }
}
