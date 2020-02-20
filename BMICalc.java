package com.company;

import java.util.Scanner;

public class BMICalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printInteroduction();
        double result = getBMI(scanner);
        getStatus(result);
        System.out.println("Enter resultNumber:");
        int resultNumber = Integer.parseInt(scanner.nextLine());
        reportResults(resultNumber, result, getStatus(result));

    }
    public static void printInteroduction(){
        System.out.println("Program calculates your`body mass index.");
    }
    public static double getBMI(Scanner scanner){
        System.out.println("Enter your weight:");
        double weight = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter your height:");
        double height = Double.parseDouble(scanner.nextLine());
        height /= 0.3937;
        weight /= 2.2046;
        return bmiFor(weight, height);
    }
    public static double bmiFor(double weight, double height){
        Scanner scanner = new Scanner(System.in);
        double bodyMassIndex = weight * 703 / (Math.pow(height, 2));
        return bodyMassIndex;
    }
    public  static String getStatus(double bodyMassIndex){
        String status;
        if (bodyMassIndex <= 18.5){
            status = "undetweight";
        }
        else if (bodyMassIndex > 18.5 && bodyMassIndex <= 25){
            status = "normal";
        }
        else if (bodyMassIndex > 25 && bodyMassIndex <= 30){
            status = "overweight";
        }
        else {
            status = "obese";
        }
        return status;
    }
    public static void reportResults(int resultNum, double BMI, String status){
        System.out.printf("Person with number %d has %.2f BMI.", resultNum, BMI);
    }

}
