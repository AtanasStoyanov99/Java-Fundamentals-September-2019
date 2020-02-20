package com.company;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        matrix(num);
    }
    static void matrix(int n){
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
