import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secNum = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int currNum = firstNum; currNum <= secNum ; currNum++) {
            sum += currNum;
            System.out.print(currNum + " ");
        }
        System.out.printf("\nSum: %d", sum);
    }
}
