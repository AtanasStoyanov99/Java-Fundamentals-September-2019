package com.company;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int elementsCount = Integer.parseInt(scanner.nextLine());
        int[] numArr = new int[elementsCount];
        int sum = 0;
        for (int i = 0; i < elementsCount; i++) {
            String number = scanner.nextLine();
            numArr[i] = Integer.parseInt(number);
            sum += numArr[i];
        }
        for (int numbers : numArr){
            System.out.print(numbers + " ");
        }
        System.out.printf("\n%d", sum);
    }
}
