package org.andestech.learning.sber2020;

import org.andestech.learning.sber2020.inheritance.B;
import org.andestech.learning.sber2020.inheritance.geom.*;

public class Main {

    private static void moveToEdgeX(IMovable figure){
        //......
        figure.moveTo(Point.EDGE_X);
        figure.rotateOn(20);
        figure.moveTo(Point.EDGE_Y);





    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(345345,"Basil","The Wolf");
        B b1 = new B();
        E e1 = new E(111);

        // Геометрия

        Circle c1 = new Circle(1, Color.White, new Point(0,2));
        c1.moveTo(new Point(5,3));

        moveToEdgeX(c1);



    }
}
