package com.company;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        double result = factorialDivide(firstNum, secondNum);
        System.out.printf("%.2f", result);
    }
    static int factorial(int n){
        int fact = 1;
        for (int i = n; i >= 1 ; i--) {
            fact *= i;
        }
        return fact;
    }
    static double factorialDivide(int n1, int n2){
        double firstFact =  factorial(n1);
        double secondFact = factorial(n2);
        return firstFact / secondFact;
    }
}
