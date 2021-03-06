import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String result = "";
        int count = 0;
        String loginTry = scanner.nextLine();
        for (int index = username.length()-1 ; index >= 0 ; index--) {
            result = result + username.charAt(index);
        }
        while (!loginTry.equals(result)){
            count++;
            if (count == 4){
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            loginTry = scanner.nextLine();
        }
        if (loginTry.equals(result)){
            System.out.printf("User %s logged in.", username);
        }
    }
}
