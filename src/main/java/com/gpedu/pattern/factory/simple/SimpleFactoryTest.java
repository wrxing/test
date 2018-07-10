package com.gpedu.pattern.factory.simple;

public class SimpleFactoryTest {

    public static void main(String[] args) {

        //System.out.println(new Telunsu().getName());
        SimpleFactory factory = new SimpleFactory();
        System.out.println(factory.getMilk("特仑苏"));
    }
}
