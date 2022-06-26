package me.whiteship.java8to11.ch04.lecture2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import me.whiteship.java8to11.ch04.lecture1.OnlineClass;
import me.whiteship.java8to11.ch04.lecture1.Progress;

public class App {

    public static void main(String[] args) {
        List<OnlineClass> springClasses = new ArrayList<>();
        springClasses.add(new OnlineClass(1, "spring boot", true));
        springClasses.add(new OnlineClass(2, "spring data jpa", true));
        springClasses.add(new OnlineClass(3, "spring mvc", false));
        springClasses.add(new OnlineClass(4, "spring core", false));
        springClasses.add(new OnlineClass(5, "rest api development", false));

        Optional<OnlineClass> optionalSpring = springClasses.stream()
            .filter(oc -> oc.getTitle().startsWith("spring"))
            .findFirst();

        optionalSpring.ifPresent(oc -> System.out.println(oc.getTitle()));

        boolean present = optionalSpring.isEmpty();
        System.out.println("present = " + present);

        OnlineClass onlineClass = optionalSpring.orElseThrow(IllegalArgumentException::new);

        Optional<OnlineClass> onlineClass2 = optionalSpring.filter(oc -> !oc.isClosed());
        System.out.println(onlineClass2.isEmpty());

        Optional<Progress> progress = optionalSpring.flatMap(OnlineClass::getProgress);


    }

}
