package org.andestech.learning.sber2020.inheritance;

public class D extends A {

    Object o;

    public D(int data){
        super(data);
        System.out.println("+++ ctor (D): " + this);

        //super.aData =1111;
    }
}
