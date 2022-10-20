package ru.vsu.cs.semenov_d_s;

public class Rectangle {

    private final Point point1; //левая верхняя точка
    private final Point point2; //правая нижняя точка

    public Rectangle(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public double getWeight() {
        return point2.getX() - point1.getX();
    }

    public double getHeight() {
        return point1.getY() - point2.getY();
    }

    public boolean isPointBelongToRectangle(Point point) {
        return point.getX() > point1.getX() && point.getX() < point2.getX() && point.getY() < point1.getY() && point.getY() > point2.getY();
    }

    public Point findCoordinatesOfCenterOfRectangle() {
        double x = (point2.getX() - point1.getX()) / 2;
        double y = (point1.getY() - point2.getY()) / 2;
        return new Point(x, y);
    }

    public double calcAreaOfRectangle() {
        return getWeight() * getHeight();
    }

    public double calcPerimeterOfRectangle() {
        return (getWeight() + getHeight()) * 2;
    }
}
