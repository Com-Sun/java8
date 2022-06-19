package me.whiteship.java8to11.ch02.lecture2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Spliterator;

public class Foo {

    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("hyunjin");
        name.add("asdf");
        name.add("spring ");
        name.add("master");

        name.forEach(System.out::println);
        Spliterator<String> spliterator = name.spliterator();
        while (spliterator.tryAdvance(System.out::println));

        Comparator<String> comparator = String::compareToIgnoreCase;

    }
}
