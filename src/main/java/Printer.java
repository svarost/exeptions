public class Printer {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("����� �� ������� �������");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("������� �� ����");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("������ �������������� ������ � �����");
        }
    }
}
