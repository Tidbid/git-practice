package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrLen = scanner.nextInt();
        int[] array = new int[arrLen];
        for (int i = 0; i < array.length; i++)
            array[i] = scanner.nextInt();
        Arrays.sort(array);
        System.out.println("Sorted input array: " + Arrays.toString(array));
        System.out.printf("Minimum is located at index: %d, and equals: %d%n", 0, array[0]);
        System.out.printf("Maximum is located at index: %d, and equals: %d%n", array.length - 1, array[array.length - 1]);
    }
}