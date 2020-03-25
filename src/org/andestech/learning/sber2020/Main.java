package org.andestech.learning.sber2020;

import org.andestech.learning.sber2020.inheritance.B;
import org.andestech.learning.sber2020.inheritance.geom.Circle;
import org.andestech.learning.sber2020.inheritance.geom.Color;
import org.andestech.learning.sber2020.inheritance.geom.Point;

public class Main {

    public static void main(String[] args) {
        Employee emp1 = new Employee(345345,"Basil","The Wolf");
        B b1 = new B();
        E e1 = new E(111);

        // Геометрия

        Circle c1 = new Circle(1, Color.White, new Point(0,2));
        c1.moveTo(new Point(5,3));



    }
}
