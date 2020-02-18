package com.company;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int capacity = 255;
        for (int count = 0; count < input; count++) {
            int water = Integer.parseInt(scanner.nextLine());
            sum += water;
            if (sum > capacity){
                System.out.println("Insufficient capacity!");
                sum -= water;
            }
        }
        System.out.println(sum);
    }
}
