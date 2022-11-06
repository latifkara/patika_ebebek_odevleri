package com.javaGelisme;

public class PrimerNumberClass {
    // It checks whether the number is the primary number with the check primer function.
    static boolean checkPrimerNumber(int number){
        for (int i = 2; i < number; i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
    // I got numbers between 4 and 100 with two for loops and printed those without divisors to the screen.
    public void setPrimerNumber(){
        for (int i = 4; i < 100; i++){
            if (checkPrimerNumber(i)){
                System.out.print(i + " ");
            }
        }
    }

}
