package me.whiteship.java8to11.ch03.lecture1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Foo {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("hyunjin");
        names.add("foo");
        names.add("bar");

        List<String> collect1 = names.parallelStream().map((s) -> {
            System.out.println(s + " " + Thread.currentThread().getName());
            return s.toUpperCase();
        }).collect(Collectors.toList());
        List<String> collect = collect1;
    }
}
