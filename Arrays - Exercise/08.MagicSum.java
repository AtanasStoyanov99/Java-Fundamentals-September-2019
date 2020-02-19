package com.company;

        import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int number = Integer.parseInt(scanner.nextLine());
        int[] intArr = new int[input.length];
        for (int i = 0; i < input.length ; i++) {
            intArr[i] = Integer.parseInt(input[i]);
        }
        for (int i = 0; i < intArr.length - 1; i++) {
            for (int j = i+1; j < intArr.length; j++) {
                if(intArr[i] + intArr[j] == number){
                    System.out.printf("%d %d \n", intArr[i], intArr[j]);
                }
            }
        }
    }
}
