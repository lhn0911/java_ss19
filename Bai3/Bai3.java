package ss19.Bai3;

import java.util.Scanner;
import java.util.function.BiFunction;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số b: ");
        int b = scanner.nextInt();

        BiFunction<Integer, Integer, Integer> add = MathOperations::add;
        BiFunction<Integer, Integer, Integer> sub = MathOperations::sub;
        BiFunction<Integer, Integer, Integer> mul = MathOperations::mul;
        BiFunction<Integer, Integer, Double> div = MathOperations::div;

        System.out.println("Tổng: " + add.apply(a, b));
        System.out.println("Hiệu: " + sub.apply(a, b));
        System.out.println("Tích: " + mul.apply(a, b));
        System.out.println("Thương: " + div.apply(a, b));


        scanner.close();

    }
}
