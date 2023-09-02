import java.util.Arrays;

class Answer {
    public int[] divArrays(int[] a, int[] b) {
        // ??????? ???? ??????? ????
        for (int item : b) {
            if (item == 0)
                throw new RuntimeException("Ошибка деления на ноль.");
        }

         if (a.length != b.length || a == null || b == null)
            return new int[]{0};
        else {
            int[] c = new int[a.length];
            for (int i = 0; i < a.length; i++)
                c[i] = a[i] / b[i];
            return c;
        }
    }
}