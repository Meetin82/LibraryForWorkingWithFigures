package test;

import org.junit.Assert;
import org.junit.Test;
import ru.vsu.cs.semenov_d_s.Point;
import ru.vsu.cs.semenov_d_s.Rectangle;
import ru.vsu.cs.semenov_d_s.Segment;

public class TestLibraryWithFigures {

    @Test
    public void testDistanceBetweenPoints() {
        Point point1 = new Point(0, 2);
        Point point2 = new Point(0, 0);
        double expectedResult = 2;
        double actualResult = point1.distanceBetweenPoints(point2);

        Assert.assertEquals(expectedResult, actualResult, 2);
    }

    @Test
    public void testMakeSymmetricalXPoint() {
        Point point = new Point(1, 2);
        Point expectedResult = new Point(-1, 2);
        point.makeSymmetricalXPoint();

        Assert.assertEquals(expectedResult.getX(),  point.getX(), 2);
        Assert.assertEquals(expectedResult.getY(),  point.getY(), 2);
    }

    @Test
    public void testMakeSymmetricalYPoint() {
        Point point = new Point(1, 2);
        Point expectedResult = new Point(1, -2);
        point.makeSymmetricalYPoint();

        Assert.assertEquals(expectedResult.getX(),  point.getX(), 2);
        Assert.assertEquals(expectedResult.getY(),  point.getY(), 2);
    }

    @Test
    public void testMakeSymmetricalXAndYPoint() {
        Point point = new Point(1, 2);
        Point expectedResult = new Point(-1, -2);
        point.makeSymmetricalXAndYPoint();

        Assert.assertEquals(expectedResult.getX(),  point.getX(), 2);
        Assert.assertEquals(expectedResult.getY(),  point.getY(), 2);
    }

    @Test
    public void testCalculateLengthOfSegment() {
        Point point1 = new Point(2, 5);
        Point point2 = new Point(6, 0);
        Segment segment = new Segment(point1, point2);

        double expectedResult = 6.40;
        double actualResult = segment.calculateLengthOfSegment();

        Assert.assertEquals(expectedResult, actualResult, 2);
    }

    @Test
    public void testCalculateMidpoint() {
        Point point1 = new Point(2, 5);
        Point point2 = new Point(6, 0);
        Segment segment = new Segment(point1, point2);

        Point expectedResult = new Point(4, 2.5);
        Point actualResult = segment.calculateMidpoint();

        Assert.assertEquals(expectedResult.getX(), actualResult.getX(), 2);
        Assert.assertEquals(expectedResult.getY(), actualResult.getY(), 2);
    }

    @Test
    public void testCalcDistanceFromPointToLineOfSegment() {
        Point point1 = new Point(2, 5);
        Point point2 = new Point(6, 0);
        Point point3 = new Point(1, 1);

        Segment segment = new Segment(point1, point2);

        double expectedResult = 5.62;
        double actualResult = segment.calcDistanceFromPointToLineOfSegment(point3);

        Assert.assertEquals(expectedResult, actualResult, 2);
    }

    @Test
    public void testIsPointBelongToLineOfSegment() {
        Point point1 = new Point(2, 5);
        Point point2 = new Point(6, 0);
        Point point3 = new Point(1, 1);

        Segment segment = new Segment(point1, point2);

        boolean expectedResult = false;
        boolean actualResult = segment.isPointBelongToLineOfSegment(point3);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testGetHeightInRectangle() {
        Point point1 = new Point(2, 5);
        Point point2 = new Point(6, 0);

        Rectangle rectangle = new Rectangle(point1, point2);

        double expectedResult = 5;
        double actualResult = rectangle.getHeight();

        Assert.assertEquals(expectedResult, actualResult, 2);
    }

    @Test
    public void testGetWeightInRectangle() {
        Point point1 = new Point(2, 5);
        Point point2 = new Point(6, 0);

        Rectangle rectangle = new Rectangle(point1, point2);

        double expectedResult = 4;
        double actualResult = rectangle.getWeight();

        Assert.assertEquals(expectedResult, actualResult, 2);
    }

    @Test
    public void testIsPointBelongToRectangle() {
        Point point1 = new Point(2, 5);
        Point point2 = new Point(6, 0);
        Point point3 = new Point(3, 3);

        Rectangle rectangle = new Rectangle(point1, point2);

        boolean expectedResult = true;
        boolean actualResult = rectangle.isPointBelongToRectangle(point3);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFindCoordinatesOfCenterOfRectangle() {
        Point point1 = new Point(2, 5);
        Point point2 = new Point(6, 0);

        Rectangle rectangle = new Rectangle(point1, point2);

        Point expectedResult = new Point(2, 2.5);
        Point actualResult = rectangle.findCoordinatesOfCenterOfRectangle();

        Assert.assertEquals(expectedResult.getX(), actualResult.getX(), 2);
        Assert.assertEquals(expectedResult.getY(), actualResult.getY(), 2);
    }

    @Test
    public void testCalcAreaOfRectangle() {
        Point point1 = new Point(2, 5);
        Point point2 = new Point(6, 0);

        Rectangle rectangle = new Rectangle(point1, point2);

        double expectedResult = 20;
        double actualResult = rectangle.calcAreaOfRectangle();

        Assert.assertEquals(expectedResult, actualResult, 2);
    }

    @Test
    public void testCalcPerimeterOfRectangle() {
        Point point1 = new Point(2, 5);
        Point point2 = new Point(6, 0);

        Rectangle rectangle = new Rectangle(point1, point2);

        double expectedResult = 18;
        double actualResult = rectangle.calcPerimeterOfRectangle();

        Assert.assertEquals(expectedResult, actualResult, 2);
    }
}
