package com.company;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch1 = scanner.nextLine().charAt(0);
        char ch2 = scanner.nextLine().charAt(0);
        printSymbols(ch1, ch2);
    }
    static void printSymbols(char ch1, char ch2){
        char extraCh = ch1;
        if (ch1 > ch2){
            ch1 = ch2;
            ch2 = extraCh;

        }
        for (int ch = ch1 + 1; ch < ch2; ch++) {
            char character = (char)ch;
            System.out.print(character + " ");
        }
    }
}
