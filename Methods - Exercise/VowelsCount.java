package com.company;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(vowelCount(scanner.nextLine().toLowerCase()));
    }
    static int vowelCount(String n){
        int vowelsCount = 0;
        for (int index = 0; index < n.length(); index++) {
            char letter = n.charAt(index);
            /*switch (letter){
                case 'a':
                case 'o':
                case 'u':
                case 'e':
                case 'i':
                    vowelsCount++;
                    break;
            }*/
            if (letter == 'a' || letter == 'o' || letter == 'u' || letter == 'e' || letter == 'i'){
                vowelsCount++;
            }
        }
        return vowelsCount;
    }
}
