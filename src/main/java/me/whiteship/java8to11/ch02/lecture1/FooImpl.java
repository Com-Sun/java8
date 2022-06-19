package me.whiteship.java8to11.ch02.lecture1;

public class FooImpl implements Foo {

    private String name;

    public FooImpl(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println(this.name);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
