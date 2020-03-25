package org.andestech.learning.sber2020.inheritance.geom;

public class Circle extends Figure {

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
        System.out.printf("Circle move from %s to %s.", getPoint(),p1);
         // алгоритм по перемещению.
        setPoint(p1);

    }
}
