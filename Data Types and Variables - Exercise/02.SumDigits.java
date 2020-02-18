package com.company;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int length = input.length();
        int sum = 0;
        for (int i = 0; i <= length - 1; i++) {
            char index = input.charAt(i);
            int number = index - 48;
            sum += number;
        }
        System.out.println(sum);
    }
}
