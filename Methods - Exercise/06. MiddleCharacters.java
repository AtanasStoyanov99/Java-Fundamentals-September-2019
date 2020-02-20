package com.company;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(middleChars(scanner.nextLine()));
    }
    static String middleChars(String str){
        String middle;
            int halfLen = str.length() / 2;
            if (str.length() % 2 == 0){
                middle =  Character.toString(str.charAt(halfLen-1));
                middle = middle.concat(Character.toString(str.charAt(halfLen)));
            }
            else {
                middle = Character.toString(str.charAt(halfLen));
            }
            return middle;
    }
}
