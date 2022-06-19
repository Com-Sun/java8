package me.whiteship.java8to11.ch01.lecture3;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.Supplier;

public class Foo {

    public static void main(String[] args) {
        Supplier<Integer> get10 = () -> 10;
        BinaryOperator<Integer> sum = (a, b) -> a + b;

        Foo foo = new Foo();
        foo.run();
    }
    private void run() {
        final int baseNumber = 10;

        // 로컬 클래스
        class LocalClass {
            void printBaseNum() {
                int baseNumber = 11;
                System.out.println(baseNumber); // 11 쉐도윙. 가려버림
            }
        }

        // 익명 클래스
        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer baseNumber) {
                System.out.println(baseNumber); // 변수가 다른 변수를 가림
            }
        };

        // 람다
        IntConsumer printInt = (i) -> System.out.println(i + baseNumber);

        printInt.accept(10);
    }
}
