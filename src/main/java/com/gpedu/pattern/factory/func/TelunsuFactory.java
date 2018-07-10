package com.gpedu.pattern.factory.func;

import com.gpedu.pattern.factory.Milk;
import com.gpedu.pattern.factory.Telunsu;

public class TelunsuFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new Telunsu();
    }
}
