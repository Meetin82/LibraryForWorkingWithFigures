package ru.vsu.cs.semenov_d_s;

public class Point {

    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void pointToString() {
        System.out.println("(" + x + ", " + y + ")");
    }

    public double distanceBetweenPoints(Point point2) {
        return Math.sqrt(Math.pow(x - point2.getX(), 2) + Math.pow(y - point2.getY(), 2));
    }

    public void makeSymmetricalXPoint() {
        setX(-getX());
        setY(getY());
    }

    public void makeSymmetricalYPoint() {
        setX(getX());
        setY(-getY());
    }

    public void makeSymmetricalXAndYPoint() {
        setX(-getX());
        setY(-getY());
    }
}
