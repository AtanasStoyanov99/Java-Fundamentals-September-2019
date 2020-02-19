package com.company;

import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int[] intArr = new int[input.length];
        for (int count = 0; count < intArr.length; count++) {
            intArr[count] = Integer.parseInt(input[count]);
        }
        int leftSum = 0, rightSum = 0;
        boolean hasSum = false;
        int index = 0;
        for (int i = 0; i < intArr.length - 1; i++) {
            for (int j = 0; j < i ; j++) {
                leftSum += intArr[j];
            }
            for (int k = i + 1; k < intArr.length ; k++) {
                rightSum += intArr[k];
            }
            if (leftSum == rightSum){
                hasSum = true;
                index = i;
                break;
            }
            leftSum = 0;
            rightSum = 0;
        }
        if (hasSum){
            System.out.println(index);
        }
        else if (intArr.length == 1){
            System.out.println(0);
        }
        else{
            System.out.println("no");
        }
    }
}
