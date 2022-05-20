package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] array = scanner.nextLine().toCharArray();
        int[] temp = new int[128];
        for (int i = 0; i < array.length; i++) {
            temp[array[i]]++;
        }
        int index = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != 0) {
                for (int j = 0; j < temp[i]; j++) {
                    array[index] = (char) i;
                    index++;
                }
            }
        }
        System.out.println(array);
    }
}
