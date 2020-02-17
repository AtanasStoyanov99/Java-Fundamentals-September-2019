import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lostGameCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboarPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int headsetTrash = 0;
        int mouseTrash = 0;
        int keyboardTrash = 0;
        int displayTrash = 0;

        for (int currGame = 1; currGame <= lostGameCount ; currGame++) {
            if (currGame % 2 == 0){
                headsetTrash++;
            }
            if (currGame % 3 == 0){
                mouseTrash++;
            }
            if (currGame % 6 == 0){
                keyboardTrash++;
            }
            if (currGame % 12 == 0){
                displayTrash++;
            }
        }

        double rageSum = (headsetPrice * headsetTrash) + (mousePrice * mouseTrash) + (keyboarPrice * keyboardTrash) +
                (displayPrice * displayTrash);
        System.out.printf("Rage expenses: %.2f lv.", rageSum);
    }
}
