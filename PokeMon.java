package com.company;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double originalN = n * 0.5;
        int m = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        int targetCount = 0;
        while (n >= m){
            if (n == originalN){
                n /= y;
            }
            else{
                n -= m;
                targetCount++;
            }
        }
        System.out.println(n);
        System.out.println(targetCount);
    }
}