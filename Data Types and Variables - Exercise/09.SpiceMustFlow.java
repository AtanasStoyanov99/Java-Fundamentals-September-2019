package com.company;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int spice = Integer.parseInt(scanner.nextLine());
        int amountOfSpice = 0;
        int days = 0;
        while (spice >= 100){
            int spiceRemaining = spice - 26;
            amountOfSpice += spiceRemaining;
            spice -= 10;
            days++;
        }
        if (amountOfSpice >= 26) {
            amountOfSpice -= 26;
        }
        System.out.println(days);
        System.out.println(amountOfSpice);
    }
}
