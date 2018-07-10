package com.gpedu.pattern.factory.simple;

import com.gpedu.pattern.factory.MengNiu;
import com.gpedu.pattern.factory.Milk;
import com.gpedu.pattern.factory.Telunsu;

public class SimpleFactory {

     public Milk getMilk(String name){
        if("特仑苏".equals(name)){
            new Telunsu();
        }else if("蒙牛".equals(name)){
            new MengNiu();
        }
        return null;
    }
}
