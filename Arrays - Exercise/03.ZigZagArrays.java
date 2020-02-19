package com.company;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        int[] firstArr = new int[input];
        int[] secondArr = new int[input];
        for (int i = 0; i < input; i++) {
            for (int k = 0; k < 1; k++) {
                String numbers = scanner.nextLine();
                String[] strArr = numbers.split(" ");
                if (i % 2 == 0){
                    firstArr[i] = Integer.parseInt(strArr[k]);
                    secondArr[i] = Integer.parseInt(strArr[strArr.length - 1]);
                }
                else{
                    firstArr[i] = Integer.parseInt(strArr[strArr.length - 1]);
                    secondArr[i] = Integer.parseInt(strArr[k]);
                }
            }
        }
        for (int firstNums : firstArr){
            System.out.print(firstNums + " ");
        }
        System.out.println();
        for (int secondNums : secondArr){
            System.out.print(secondNums + " ");
        }
    }
}
