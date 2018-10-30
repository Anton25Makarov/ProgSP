package by.bsuir.entities;

import java.awt.*;

public class Triangle {
    private Point2D firstPoint;
    private Point2D secondPoint;
    private Point2D thirdPoint;
    private Color color;

    public Triangle(Point2D firstPoint, Point2D secondPoint, Point2D thirdPoint, Color color) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
        this.thirdPoint = thirdPoint;
        this.color = color;
    }

    public Triangle(Point2D firstPoint, Point2D secondPoint, Point2D thirdPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
        this.thirdPoint = thirdPoint;
        this.color = Color.black;
    }

    public Point2D getFirstPoint() {
        return firstPoint;
    }

    public void setFirstPoint(Point2D firstPoint) {
        this.firstPoint = firstPoint;
    }

    public Point2D getSecondPoint() {
        return secondPoint;
    }

    public void setSecondPoint(Point2D secondPoint) {
        this.secondPoint = secondPoint;
    }

    public Point2D getThirdPoint() {
        return thirdPoint;
    }

    public void setThirdPoint(Point2D thirdPoint) {
        this.thirdPoint = thirdPoint;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
