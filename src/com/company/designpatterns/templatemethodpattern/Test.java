package com.company.designpatterns.templatemethodpattern;

public class Test {
    public static void main(String[] args) {
        CaffeineBeverage coffee = new Coffee();
        CaffeineBeverage tea = new Tea();

        coffee.prepare();
        tea.prepare();
    }
}
