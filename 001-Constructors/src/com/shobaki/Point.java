package com.shobaki;

public class Point {
    private int x;
    private int y;

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        return Math.sqrt((0 - x) * (0- x) + (0 - y) * (0 - y));
    }
    public double distance(int xVal, int yVal){
        return Math.sqrt((xVal - x) * (xVal- x) + (yVal - y) * (yVal - y));
    }
    public double distance(Point p){
        return Math.sqrt((p.getX() - x) * (p.getX()- x) + (p.getY() - y) * (p.getY() - y));
    }
}
