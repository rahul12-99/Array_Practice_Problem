package com.arraypracticeproblem;

import java.util.Scanner;

public class OddIndexElement {
    // printing the array element which are at odd index;
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
            if (i % 2 != 0) {
                System.out.println("Odd index element is : " + array[i] + " which is on " + i + " index");
            }
        }
    }
}
