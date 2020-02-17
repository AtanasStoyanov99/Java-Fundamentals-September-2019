import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int newNum = 0;

        if (num % 10 == 0){
            newNum = 10;
            System.out.printf("The number is divisible by %d", newNum);
        }
        else if (num % 7 == 0){
            newNum = 7;
            System.out.printf("The number is divisible by %d", newNum);
        }
        else if (num % 6 == 0){
            newNum = 6;
            System.out.printf("The number is divisible by %d", newNum);
        }
        else if (num % 3 == 0){
            newNum = 3;
            System.out.printf("The number is divisible by %d", newNum);
        }
        else if (num % 2 == 0){
            newNum = 2;
            System.out.printf("The number is divisible by %d", newNum);
        }
        else {
            System.out.println("Not divisible");
        }
    }
}
