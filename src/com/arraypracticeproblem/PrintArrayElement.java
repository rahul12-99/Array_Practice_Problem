package com.arraypracticeproblem;

import java.util.*;

public class PrintArrayElement {
    // program to print the array element;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the element");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Printing the array");
        for (int i = 0; i < array.length; i++) {
            System.out.println("your entered element is : " + array[i]);
        }
    }
}
