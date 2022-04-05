package com.company.designpatterns.singletonpattern;

public class Test {
    public static void main(String[] args) {
        Singleton singleton = Singleton.UNIQUE_INSTANCE;
        singleton.print();
    }
}
