package ss19;

import java.util.function.Function;

public class Bai2{
    public static void main(String[] args) {
        Function<Integer,Integer> function= new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return (x*x)+(3*x)+2;
            }
        };
        System.out.println(function.apply(1));
        System.out.println(function.apply(2));
        System.out.println(function.apply(3));
    }
}