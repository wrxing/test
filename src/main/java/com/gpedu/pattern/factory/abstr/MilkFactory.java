package com.gpedu.pattern.factory.abstr;

import com.gpedu.pattern.factory.MengNiu;
import com.gpedu.pattern.factory.Milk;
import com.gpedu.pattern.factory.Telunsu;

public class MilkFactory extends AbstractFactory {
    @Override
    public Milk getTelunsu() {
        return new Telunsu();
    }

    @Override
    public Milk getMengNiu() {
        return new MengNiu();
    }


}
