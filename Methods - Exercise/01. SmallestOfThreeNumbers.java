package com.company;

import java.util.Scanner;

public class SmallestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());
        System.out.println(compareInts(n1, n2, n3));
    }
    static int compareInts(int n1, int n2, int n3){
        int smallest = n1;
        if (smallest > n2){
            smallest = n2;
        }
        if (smallest > n3){
            smallest = n3;
        }
        return smallest;
    }
}
