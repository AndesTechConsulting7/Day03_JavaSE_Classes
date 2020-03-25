package org.andestech.learning.sber2020.inheritance.geom;

public abstract class Figure {

    protected Color color;
    protected Point point;
    public Figure(Color color, Point point){this.color = color; this.point = point;}

    public abstract double getSquare();
    public abstract double getPerimeter();

    public abstract void moveTo(Point p1);
    // rotate

    public Color getColor() { return color;   }
    public void setColor(Color color) {this.color = color;}

}
