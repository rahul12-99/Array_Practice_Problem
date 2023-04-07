package com.arraypracticeproblem;

import java.util.Scanner;

public class SecondLargest {
    // print the second largest element;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int size = scanner.nextInt();
        int [] array = new int[size];
        for (int i = 0; i < array.length; i++){
            System.out.println("Enter the : " + i + " element");
            array[i] = scanner.nextInt();
        }
        int largest = array[0];
        int secondlargest = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] > largest){
                secondlargest = largest;
                largest = array[i];
            }
        }
        System.out.println("Largest element in the array is : " + largest);
        System.out.println("Second largest element in the array is : " + secondlargest);
    }
}
