package ss19.Bai3;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số b: ");
        int b = scanner.nextInt();

        System.out.println("Tổng: " + MathOperations.add(a, b));
        System.out.println("Hiệu: " + MathOperations.sub(a, b));
        System.out.println("Tích: " + MathOperations.mul(a, b));
        System.out.println("Thương: " + MathOperations.div(a, b));

        scanner.close();
    }
}
