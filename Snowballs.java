package com.company;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n  = Integer.parseInt(scanner.nextLine());
        int snowballSnow;
        int snowballTime;
        int snowballQuality;
        int snowballValue;
        int highestValue = 0;
        int snow = 0;
        int time = 0;
        int quality = 0;
        int value = 0;
        for (int i = 0; i < n; i++) {
            snowballSnow = Integer.parseInt(scanner.nextLine());
            snowballTime = Integer.parseInt(scanner.nextLine());
            snowballQuality = Integer.parseInt(scanner.nextLine());
            snowballValue = (int) Math.pow((snowballSnow / snowballTime), snowballQuality);
            if (snowballValue > highestValue) {
                highestValue = snowballValue;
                snow = snowballSnow;
                time = snowballTime;
                quality = snowballQuality;
                value = snowballValue;

            }
        }
        System.out.printf("%d : %d = %d (%d)", snow, time, value, quality);
    }
}
