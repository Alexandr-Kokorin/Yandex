package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	    int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(binaryMax(array));
    }

    public static int binaryMax(int[] array) {
        int first = 0;
        int last = array.length - 1;
        int position = (first + last) / 2;
        if (array[first] < array[last]) return array[last];
        while (last - first > 1) {
            if (array[first] > array[position]) {
                last = position;
            } else {
                first = position;
            }
            position = (first + last) / 2;
        }
        return array[first];
    }
}
