import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner choiceButton = new Scanner(System.in);
        int userChoice = -1;

        while (userChoice != -0) {

            System.out.println("=== Kopeyka ===");
            System.out.println("1. Добавить расход");
            System.out.println("2. Показать расходы");
            System.out.println("0. Выход");
            System.out.print("Ваш выбор: ");

            userChoice = choiceButton.nextInt();

            if (userChoice == 1) {
                System.out.println("Добавление расходов пока не готово");
            } else if (userChoice == 2) {
                System.out.println("Список расходов пока не готов");
            } else if (userChoice == 0) {
                System.out.println("До встречи");
            } else {
                System.out.println("Неверное значение");
            }
        }
    }
}
