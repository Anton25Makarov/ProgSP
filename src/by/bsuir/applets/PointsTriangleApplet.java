package by.bsuir.applets;

import by.bsuir.entities.Point2D;
import by.bsuir.entities.Triangle;
import by.bsuir.generation.RandomGenerator;
import by.bsuir.logic.Drawer;

import java.awt.*;
import java.applet.*;

public class PointsTriangleApplet extends Applet {
    @Override
    public void init() {
        super.init();
        this.setSize(550, 500);
    }

    @Override
    public void paint(Graphics graphics) {
        Drawer drawer = new Drawer();

        Point2D point1 = new Point2D(300, 50);
        Point2D point2 = new Point2D(100, 250);
        Point2D point3 = new Point2D(450, 300);

        Triangle triangle = new Triangle(point1, point2, point3, Color.green);

        drawer.drawTriangle(triangle, graphics);

        Point2D[] masPoints = new Point2D[10000];

        RandomGenerator generator = new RandomGenerator();
        for (Point2D point : masPoints) {
            point = generator.generatePoint2D(0, 500);
            drawer.drawPoint(point, triangle, graphics);
        }
    }
}
