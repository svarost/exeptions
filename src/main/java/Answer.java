public class Answer {
    public static void arrayOutOfBoundsException() {
        // �������� ���� ������� ����
        int[] arr = new int[2];
        int temp = arr[8];

    }

    public static void divisionByZero() {
        // �������� ���� ������� ����
        int divRez = 15/0;
    }

    public static void numberFormatException() {
        // �������� ���� ������� ����
        String str = "Some string...";
        int value = Integer.parseInt(str);
    }
}
