import java.util.Scanner;

public class CheckEmptyLine {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Введите что-то: ");
                String userInput = scanner.nextLine();

                if (userInput.isEmpty()) {
                    throw new Exception("Пустые строки вводить нельзя");
                } else {
                    System.out.println("Вы ввели: " + userInput);
                    break;
                }
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
        scanner.close();
    }
}
