package com.company.designpatterns.singletonpattern;

public enum Singleton {
    UNIQUE_INSTANCE;

    public void print(){
        System.out.println("Hi I am singleton");
    }
}
