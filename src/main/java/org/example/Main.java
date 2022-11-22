package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrLen = scanner.nextInt();
        int[] array = new int[arrLen];
        int minInd = 0;
        int maxInd = 0;
        for (int i = 0; i < array.length; i++)
            array[i] = scanner.nextInt();
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minInd])
                minInd = i;
            if (array[i] > array[maxInd])
                maxInd = i;
        }
        System.out.println("Input array: " + Arrays.toString(array));
        System.out.printf("Minimum is located at index: %d, and equals: %d%n", minInd, array[minInd]);
        System.out.printf("Maximum is located at index: %d, and equals: %d%n", maxInd, array[maxInd]);
    }
}