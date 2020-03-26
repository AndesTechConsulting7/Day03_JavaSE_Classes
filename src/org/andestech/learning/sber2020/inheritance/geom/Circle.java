package org.andestech.learning.sber2020.inheritance.geom;

public final class Circle extends Figure {

    private double r;

    public Circle(double r, Color color, Point point){
        super(color,point);
        this.r = r;
    }

    @Override
    public double getSquare() {
        return Math.PI*r*r;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*r;
    }

    @Override
    public void moveTo(Point p1) {
          //....
        System.out.printf("Circle move from %s to %s.\n", getPoint(),p1);
         // алгоритм по перемещению.
        setPoint(p1);

    }

    @Override
    public void rotateOn(int angle) {
        System.out.printf("Circle rotate on %d degree.\n", angle);
    }
}
