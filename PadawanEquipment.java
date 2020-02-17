import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double sabre = Double.parseDouble(scanner.nextLine());
        double robe = Double.parseDouble(scanner.nextLine());
        double belt = Double.parseDouble(scanner.nextLine());

        double allSabres = sabre * countOfStudents;
        double allRobes = robe * countOfStudents;
        double allBelts = belt * countOfStudents;

        int freeBelts = countOfStudents / 6;
        allBelts -= freeBelts * belt;

        double extraSabresCount = countOfStudents * 0.1;

        if (extraSabresCount % 1 > 0){
            extraSabresCount = (int)extraSabresCount;
            extraSabresCount++;
        }
        double extraSabres = extraSabresCount * sabre;

        double calculatedPrice = allSabres + allRobes + allBelts + extraSabres;

        if (calculatedPrice > amountOfMoney){
            double neededMoney = calculatedPrice - amountOfMoney;
            System.out.printf("Ivan Cho will need %.2flv more.", neededMoney);
        }
        else {
            System.out.printf("The money is enough - it would cost %.2flv.", calculatedPrice);
        }
    }
}
