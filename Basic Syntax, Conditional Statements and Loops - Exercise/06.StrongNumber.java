import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        String numString = String.valueOf(number);
        int stringLength = numString.length();
        int factorial = 1;
        int sum = 0;


        for (int index = 0; index <= stringLength - 1; index++){
            char currDigit = numString.charAt(index);
            int newNum = (int)currDigit - 48;
            for (int factNum = newNum; factNum >= 1 ; factNum--) {
                factorial *= factNum;
            }
            sum += factorial;
            factorial = 1;
        }
        if (sum == number){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
