package com.company;

import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int charCount = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int count = 1; count <= charCount ; count++) {
            char character = scanner.nextLine().charAt(0);
            sum += character;
        }
        System.out.printf("The sum equals: %d", sum);
    }
}
