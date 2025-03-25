package ss19.Bai3;

public class MathOperations {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static double div(int a, int b) {

        if (b == 0) {
            System.out.println("không thể chia cho 0");
            return 0;

        }
        return (double) a / b;
    }

}
