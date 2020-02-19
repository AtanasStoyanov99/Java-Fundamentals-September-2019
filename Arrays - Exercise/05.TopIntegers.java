package com.company;

import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] intArr = new int[input.length];
        for (int count = 0; count < intArr.length; count++) {
            intArr[count] = Integer.parseInt(input[count]);
        }
        for (int i = 0; i < intArr.length - 1; i++) {
            boolean topInteger = true;
            int currentNumber = intArr[i];
            for (int k = i + 1; k < intArr.length ; k++) {
                int number = intArr[k];
                if (currentNumber <= number){
                    topInteger = false;
                }
            }
            if (topInteger){
                System.out.print(currentNumber + " ");
            }
        }
        System.out.print(intArr[intArr.length - 1]);
    }
}
