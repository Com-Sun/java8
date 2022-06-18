package me.whiteship.java8to11.ch01.lecture2;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Foo {

    public static void main(String[] args) {

        Function<Integer, Integer> plus10 = (i) -> i+10;
        System.out.println(plus10.apply(1));

        Function<Integer, Integer> multiply2 = (i) -> i *2;
        System.out.println(multiply2.apply(30));

        Function<Integer, Integer> multiply2AndPlus10 = plus10.compose(multiply2);

        System.out.println(multiply2AndPlus10.apply(3));

        Function<Integer, Integer> plus10AndMultiply2 = plus10.andThen(multiply2);

        System.out.println("plus10AndMultiply2.apply(10) = " + plus10AndMultiply2.apply(10));

        Consumer<Integer> printT = (i) -> System.out.println(i);
        printT.accept(10);

        Supplier<Integer> get10 = () -> 10;

        Predicate<String> startsWithHyunjin = (s) -> s.startsWith("hyunjin");
        Predicate<Integer> isOdd = (i) -> i%2 == 1;

        UnaryOperator<Integer> plus20 = (i) -> i + 10;
    }
}
