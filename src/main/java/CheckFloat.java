import java.util.Scanner;

public class CheckFloat {
    public static void main(String[] args) {
        System.out.print("Введите дробное число: ");
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextFloat()) {
            System.out.println("Вы ввели некорректное значение. Поробуйте еще раз.");
            sc.next();
        }
        System.out.println(sc.nextFloat());
    }
}
