package ru.vsu.cs.semenov_d_s;

public class Segment {

    private final Point point1;
    private final Point point2;

    public Segment(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public double calculateLengthOfSegment() {
        return Math.sqrt(Math.pow(point1.getX() - point2.getX(), 2) + Math.pow(point1.getY() - point2.getY(), 2));
    }

    public Point calculateMidpoint() {
        double x = (point1.getX() + point2.getX()) / 2;
        double y = (point1.getY() + point2.getY()) / 2;
        return new Point(x, y);
    }

    public double calcDistanceFromPointToLineOfSegment(Point point) {
        double a = point2.getY() - point1.getY();
        double b = point2.getX() - point1.getX();
        double c = -point1.getX() * a + point1.getY() + point1.getY() * (point2.getX() - point1.getX());
        return (Math.abs(a * point.getX() + b * point.getY()) + c) / (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
    }

    public boolean isPointBelongToLineOfSegment(Point point) {
        return calcDistanceFromPointToLineOfSegment(point) == 0;
    }
}
