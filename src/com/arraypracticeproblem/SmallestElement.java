package com.arraypracticeproblem;

import java.util.Scanner;

public class SmallestElement {
    // print smallest element in the array;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int size = scanner.nextInt();
        int [] array = new int[size];
        for (int i = 0; i < array.length; i++){
            System.out.println("Enter the : " + i + " element");
            array[i] = scanner.nextInt();
        }
        int smallest = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] < smallest){
                smallest = array[i];
            }
        }
        System.out.println("Smallest element in the array is : " + smallest);
    }
}
