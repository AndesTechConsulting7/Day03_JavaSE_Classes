package org.andestech.learning.sber2020;

import org.andestech.learning.sber2020.inheritance.B;
import org.andestech.learning.sber2020.inheritance.geom.*;

//class SuperCircle extends Circle{   }

public class Main {

    private static void drawStar(IMovable figure){
        //......
        figure.moveTo(new Point(Point.EDGE_X.getX()/2, Point.EDGE_Y.getY()/2));
        figure.rotateOn(20);
        figure.moveTo(Point.EDGE_Y);
        //....

    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(345345,"Basil","The Wolf");
        B b1 = new B();
        E e1 = new E(111);

        // Геометрия

        Circle c1 = new Circle(1, Color.White, new Point(0,2));
        Rectangle r1 = new Rectangle(2,4,Color.Grey, new Point(2, 5));

        c1.moveTo(new Point(5,3));

        drawStar(c1);
        drawStar(r1);

        Object o3 = b1;

        Object o2 = new Circle(1, Color.Green, new Point(10,20));
        System.out.printf("\nS=%f, P=%f.", ((Circle)o2).getSquare(), ((Circle)o2).getPerimeter());



    }
}
