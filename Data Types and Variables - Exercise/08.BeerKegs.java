package com.company;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        double volume;
        double previousVolume = 0;
        String winnerBeer = "";
        for (int count = 1; count <= input; count++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            volume = Math.PI * Math.pow(radius, 2) * height;
            if (previousVolume < volume) {
                winnerBeer = model;
            }
            if (count == 1){
                winnerBeer = model;
            }
            previousVolume = volume;
        }
        System.out.println(winnerBeer);
    }
}
