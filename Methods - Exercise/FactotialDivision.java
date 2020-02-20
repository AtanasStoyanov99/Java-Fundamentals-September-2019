package com.company;

import java.util.Scanner;

public class FactotialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        double result = factorialDivide(firstNum, secondNum);
        System.out.printf("%.2f", result);
    }
    static int firstNumFact(int n){
        int factorial = 1;
        for (int i = n; i >= 1 ; i--) {
            factorial *= i;
        }
        return factorial;
    }
    static int secondNumFact(int n){
        int factorial = 1;
        for (int i = n; i >= 1 ; i--) {
            factorial *= i;
        }
        return factorial;
    }
    static double factorialDivide(int n1, int n2){
        double firstFact =  firstNumFact(n1);
        double secondFact = secondNumFact(n2);
        return firstFact / secondFact;
    }
}
