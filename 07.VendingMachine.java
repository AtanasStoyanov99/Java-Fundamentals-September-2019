import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double money;
        double moneySum = 0;
        double price = 0;
        double sumPrice = 0;
        int count = 0;

        while (!input.equals("Start")){
            money = Double.parseDouble(input);
            if (money == 0.1 || money == 0.2 || money == 0.5 || money == 1 || money == 2){
                moneySum += money;

            }
            else {
                System.out.printf("Cannot accept %.2f\n", money);
            }
            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!input.equals("End")) {
            switch (input) {
                case "Nuts":
                    price = 2;
                    break;
                case "Water":
                    price = 0.7;
                    break;
                case "Crisps":
                    price = 1.5;
                    break;
                case "Soda":
                    price = 0.8;
                    break;
                case "Coke":
                    price = 1;
                    break;
                    default:
                        System.out.println("Invalid product");
                        count++;
            }
            sumPrice += price;
            if (sumPrice > moneySum){
                System.out.println("Sorry, not enough money");
                sumPrice -= price;
            }
            else {
                if (count == 1){
                    input = scanner.nextLine();
                    continue;
                }
                System.out.printf("Purchased %s\n", input);
            }
            input = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", moneySum - sumPrice);
    }
}
