package me.whiteship.java8to11.ch02.lecture1;

public class Main  {

    public static void main(String[] args) {

        Foo foo = new FooImpl("hyunjin");
        foo.printName();
        foo.printNameUpperCase();
    }
}
