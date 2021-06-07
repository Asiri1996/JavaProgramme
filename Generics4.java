import java.util.ArrayList;
import java.util.List;

/**
 * Wildcard in Java Generics
 */

abstract class Shape {
    abstract void draw();
} 

/**
 * Rectangle
 */
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

/**
 * Circle
 */
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    } 
}

public class Generics4 {

    /** creating a method that accepts only the child class of Shape */
    private static void drawShapes(List <? extends Shape> lists) {
        for (Shape shape : lists) {
            shape.draw();
        }
    }

    public static void main(String[] args) {
        List<Rectangle> list1 = new ArrayList<>();
        list1.add(new Rectangle());

        drawShapes(list1);

        List<Circle> list2 = new ArrayList<>();
        list2.add(new Circle());
        list2.add(new Circle());

        drawShapes(list2);
    }
}