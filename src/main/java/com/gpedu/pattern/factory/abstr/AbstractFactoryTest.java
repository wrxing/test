package com.gpedu.pattern.factory.abstr;

import com.gpedu.pattern.factory.Milk;

public class AbstractFactoryTest {

    public static void main(String[] args) {

        MilkFactory factory = new MilkFactory();

        System.out.println(factory.getMengNiu().getName());
    }
}
