package com.company;

        import java.util.Scanner;

public class PrintPartOfAsciiTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startIndex = Integer.parseInt(scanner.nextLine());
        int endIndex = Integer.parseInt(scanner.nextLine());
        for (int currIndex = startIndex; currIndex <= endIndex; currIndex++){
            char indexChar = (char) currIndex;
            System.out.print(indexChar + " ");
        }
    }
}
