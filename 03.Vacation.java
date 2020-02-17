import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groupCount = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0;
        double overallPrice = 0;

        switch (groupType) {
            case "Students":
                switch (day) {
                    case "Friday":
                        price = 8.45;
                        break;
                    case "Saturday":
                        price = 9.80;
                        break;
                    case "Sunday":
                        price = 10.46;
                        break;
                }
                break;
            case "Business":
                switch (day) {
                    case "Friday":
                        price = 10.90;
                        break;
                    case "Saturday":
                        price = 15.60;
                        break;
                    case "Sunday":
                        price = 16;
                        break;
                }
                break;
            case "Regular":
                switch (day) {
                    case "Friday":
                        price = 15;
                        break;
                    case "Saturday":
                        price = 20;
                        break;
                    case "Sunday":
                        price = 22.50;
                        break;
                }
        }
        overallPrice = price * groupCount;
        switch (groupType){
            case "Students":
                if (groupCount >= 30){
                    overallPrice -= overallPrice* 0.15;
                }
                break;
            case "Business":
                if (groupCount >= 100){
                    overallPrice -= price * 10;
                }
                break;
            case "Regular":
                if (groupCount >= 10 && groupCount <= 20){
                    overallPrice -= overallPrice * 0.05;
                }
                break;
        }
        System.out.printf("Total price: %.2f", overallPrice);
    }
}
