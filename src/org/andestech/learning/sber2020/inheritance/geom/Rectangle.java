package org.andestech.learning.sber2020.inheritance.geom;

public class Rectangle extends Figure {

    private int a,b;

    public Rectangle(int a, int b, Color color1, Point p) {
        super(color1,p);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getSquare() {
        return a*b;
    }

    @Override
    public double getPerimeter() {
        return 2*(a+b);
    }

    @Override
    public void moveTo(Point p1) {
        //....
        System.out.printf("Rectangle move from %s to %s.\n", getPoint(),p1);
        // алгоритм по перемещению.
        setPoint(p1);
    }

    @Override
    public void rotateOn(int angle) {
        System.out.printf("Rectangle rotate on %d degree.\n", angle);
        // алгоритм вращения.
    }
}
