package org.andestech.learning.sber2020.inheritance.geom;

public class Point {
    private int x,y;
    public static final Point EDGE_X = new Point(200,0);
    public static final Point EDGE_Y = new Point(0,300);

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return String.format("(%d,%d)",x,y);
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
