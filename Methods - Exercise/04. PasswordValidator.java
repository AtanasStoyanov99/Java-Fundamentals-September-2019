package com.company;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        passwordValidate(scanner.nextLine());
    }
    static boolean inRange(String n){
        boolean condition = false;
        if (n.length() >= 6 && n.length() <= 10){
            condition = true;
        }
        return condition;
    }
    static boolean onlyLettersAndDigits(String n){
        boolean condition = false;
        int digitCount = 0;
        int letterCount = 0;
        for (int index = 0; index < n.length(); index++) {
            char ch = n.charAt(index);
            if (ch >= 48 && ch <= 57){
                digitCount++;
            }
            else if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)){
                letterCount++;
            }
        }
        if ((digitCount + letterCount) == n.length()){
            condition = true;
        }
        return condition;
    }
    static boolean twoDigits(String n){
        int digitCount = 0;
        boolean condition = false;
        for (int index = 0; index < n.length(); index++) {
            char ch = n.charAt(index);
            if (ch >= 48 && ch <= 57){
                digitCount++;
            }
        }
        if (digitCount >= 2){
            condition = true;
        }
        return condition;
    }
    static void passwordValidate(String n){
        if (!inRange(n)){
             System.out.println("Password must be between 6 and 10 characters");
        }
        if (!onlyLettersAndDigits(n)){
            System.out.println("Password must consist only of letters and digits");
        }
        if (!twoDigits(n)){
            System.out.println("Password must have at least 2 digits");
        }
        if (inRange(n) && onlyLettersAndDigits(n) && twoDigits(n)){
            System.out.println("Password is valid");
        }
    }
}
