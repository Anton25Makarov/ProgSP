package by.bsuir.logic;

import by.bsuir.entities.Point2D;
import by.bsuir.entities.Triangle;

public class Calculator {

    private double calculateSquare(Triangle triangle) {
        Point2D firstPoint = triangle.getFirstPoint();
        Point2D secondPoint = triangle.getSecondPoint();
        Point2D thirdPoint = triangle.getThirdPoint();

        double firstSide = calculateDistanceBetweenPoints(firstPoint, secondPoint);
        double secondSide = calculateDistanceBetweenPoints(secondPoint, thirdPoint);
        double thirdSide = calculateDistanceBetweenPoints(thirdPoint, firstPoint);

        double halfPerimeter = (firstSide + secondSide + thirdSide) / 2;

        return Math.sqrt(halfPerimeter *
                (halfPerimeter - firstSide) *
                (halfPerimeter - secondSide) *
                (halfPerimeter - thirdSide));
    }

    public boolean isPointInsideTriangle(Triangle triangle, Point2D point) {
        Point2D firstTrianglePoint = triangle.getFirstPoint();
        Point2D secondTrianglePoint = triangle.getSecondPoint();
        Point2D thirdTrianglePoint = triangle.getThirdPoint();

        Triangle firstTriangle = new Triangle(firstTrianglePoint, point, secondTrianglePoint);
        Triangle secondTriangle = new Triangle(secondTrianglePoint, point, thirdTrianglePoint);
        Triangle thirdTriangle = new Triangle(thirdTrianglePoint, point, firstTrianglePoint);

        double mainTriangle = calculateSquare(triangle);
        double firstTriangleSquare = calculateSquare(firstTriangle);
        double secondTriangleSquare = calculateSquare(secondTriangle);
        double thirdTriangleSquare = calculateSquare(thirdTriangle);

        return mainTriangle ==
                Math.round(firstTriangleSquare + secondTriangleSquare + thirdTriangleSquare);
    }

    private double calculateDistanceBetweenPoints(Point2D firstPoint, Point2D secondPoint) {
        int x1 = firstPoint.getX();
        int y1 = firstPoint.getY();
        int x2 = secondPoint.getX();
        int y2 = secondPoint.getY();

        double distanceX = Math.pow(x1 - x2, 2);
        double distanceY = Math.pow(y1 - y2, 2);

        return Math.sqrt(distanceX + distanceY);
    }

}
