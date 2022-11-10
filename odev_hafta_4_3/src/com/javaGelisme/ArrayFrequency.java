package com.javaGelisme;

public class ArrayFrequency {
    int[] repeatList;
    int[] counterRepeatList;
    int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
    int index = 0;
    int counter = 0;
    // The constructor function creates two arrays.
    public ArrayFrequency(){
        repeatList = new int[list.length];
        counterRepeatList = new int[list.length];
    }
    // The isfind method was used to get one from each number in the sequence of repeated numbers.
    static boolean isFind(int[] arr, int value){
        for (int item: arr){
            if (item == value){
                return true;
            }
        }
        return false;
    }
    // A method that finds repeated numbers.
    public void getRepeatList(){
        for (int i = 0; i < list.length; i++){
            for (int j = 0; j < list.length; j++){
                if ((list[i] == list[j])){
                    if (!isFind(repeatList, list[i])){
                        repeatList[index++] = list[i];
                    }
                    break;
                }
            }
        }
    }
    // A method that finds how many times the repeated numbers will repeat in the array.
    public void findDuplicated(){
        for (int i = 0; i < repeatList.length; i++){
            counter = 0;
            for (int j = 0; j < list.length; j++) {
                    if (repeatList[i] == list[j]){
                        counter++;
                    }
                }
            counterRepeatList[i] = counter;
            }
    }
    // method that prints values to the screen.
    public void print(){
        getRepeatList();
        findDuplicated();
        System.out.println("Tekrar Sayıları");
        for (int i = 0; i < repeatList.length; i++){
            if (repeatList[i] != 0) {
                System.out.println(repeatList[i] + " sayısı " + counterRepeatList[i] + " kere tekrar edildi");
            }
        }
    }
}
