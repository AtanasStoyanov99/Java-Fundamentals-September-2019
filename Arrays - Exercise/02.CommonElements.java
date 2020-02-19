package com.company;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstInput = scanner.nextLine();
        String secondInput = scanner.nextLine();
        String[] firstArr = firstInput.split(" ");
        String[] secondArr = secondInput.split(" ");
        for (int secondI = 0; secondI < secondArr.length; secondI++) {
            for (int firstI = 0; firstI < firstArr.length; firstI++) {
                boolean condition = secondArr[secondI].equals(firstArr[firstI]);
                if (condition){
                    System.out.print(secondArr[secondI] + " ");
                }
            }
        }
    }
}
