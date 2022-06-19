package me.whiteship.java8to11.ch01.lecture4;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Foo {

    public static void main(String[] args) {
        Function<Integer, String > intToString = (i) -> "number";

        UnaryOperator<String> hi = Greeting::hi;

        Greeting greeting = new Greeting();
        UnaryOperator<String> hello = greeting::hello;

        Supplier<Greeting> newGreeting = Greeting::new;
        // 이때 아직 newGreeting이 생성된 것이 아님. 그냥 서플라이어임.
        newGreeting.get();
        // 이렇게 get()을 해야 생성됨.

        Function<String , Greeting> newGreeting2 = Greeting::new;
        //이건 생성자의 인자로 String을 받고, 리턴으로 Greeting을 반환하는 것임.
        //위의 newGreeting과 같은 Greeting::new를 사용하지만 참조하는 생성자가 다르다.

        Greeting hyunjin = newGreeting2.apply("현진이 짱");
        System.out.println("hyunjin.getName() = " + hyunjin.getName());

        String[] name = {"hyunjin", "ComSun", "Hi"};
        Arrays.sort(name, String::compareToIgnoreCase);
        for (String s : name) {
            System.out.println(s);
        }
    }
}
