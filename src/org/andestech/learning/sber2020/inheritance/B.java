package org.andestech.learning.sber2020.inheritance;

public class B extends A {
    public int bData;

    public void test(){
        aData = 23123;
    }

    public B(){
        super(1234);
        System.out.println("+++ ctor (B): " + this);
    }

    @Override
    public String getInfo() {
        return "bdata:"+bData;
    }
}
