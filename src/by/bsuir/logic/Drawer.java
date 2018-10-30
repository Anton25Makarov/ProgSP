package by.bsuir.logic;

import by.bsuir.entities.Point2D;
import by.bsuir.entities.Triangle;

import java.awt.*;

public class Drawer {

    public void drawTriangle(Triangle triangle, Graphics graphics) {
        int x1 = triangle.getFirstPoint().getX();
        int y1 = triangle.getFirstPoint().getY();
        int x2 = triangle.getSecondPoint().getX();
        int y2 = triangle.getSecondPoint().getY();
        int x3 = triangle.getThirdPoint().getX();
        int y3 = triangle.getThirdPoint().getY();
        Color color = triangle.getColor();
        graphics.setColor(color);
        graphics.drawLine(x1, y1, x2, y2);
        graphics.drawLine(x2, y2, x3, y3);
        graphics.drawLine(x3, y3, x1, y1);
    }

    public void drawPoint(Point2D point, Graphics graphics) {
        int x = point.getX();
        int y = point.getY();

        graphics.drawLine(x, y, x, y);
    }

    public void drawPoint(Point2D point, Triangle triangle, Graphics graphics) {
        int x = point.getX();
        int y = point.getY();

        Calculator calculator = new Calculator();

        if (calculator.isPointInsideTriangle(triangle, point)) {
            graphics.setColor(Color.green);
        } else {
            graphics.setColor(Color.red);
        }

        graphics.drawLine(x, y, x, y);
    }

}
