package org.andestech.learning.sber2020.inheritance;

public class A {

//    public A(){
//        System.out.println("+++ ctor (A): " + this);
//    }

    public A(int aData){
        this.aData = aData;
        System.out.println("+++ ctor (A): " + this);
    }

    protected int aData;
    //...

    public String getInfo(){
        return "adata:"+aData;
    }
}

