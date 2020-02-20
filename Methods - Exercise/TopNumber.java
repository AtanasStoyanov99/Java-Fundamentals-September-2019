package com.company;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        printTopNumber(number);
    }
    static boolean divisibleByEight(int n){
        int extraNum;
        int sum = 0;
        boolean isDivisableByEight = false;
        while (n > 0){
            extraNum = n % 10;
            sum += extraNum;
            n /= 10;
        }
        if (sum % 8 == 0){
            isDivisableByEight =true;
        }
        return isDivisableByEight;
    }
    static boolean leastOneOddDigit(int n){
        int extraNum;
        boolean moreThanOneOdd = false;
        while (n > 0){
            extraNum = n % 10;
            if (extraNum % 2 != 0){
                moreThanOneOdd = true;
            }
            n /= 10;
        }
        return moreThanOneOdd;
    }
    static void printTopNumber(int n){
        for (int i = 1; i <= n; i++) {
            if (divisibleByEight(i) && leastOneOddDigit(i)){
                System.out.println(i);
            }
        }
    }
}
