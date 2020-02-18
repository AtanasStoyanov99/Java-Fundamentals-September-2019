package com.company;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleNum = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());
        int course = peopleNum / capacity;
        if (peopleNum % capacity != 0){
            course++;
        }
        System.out.println(course);
    }
}
