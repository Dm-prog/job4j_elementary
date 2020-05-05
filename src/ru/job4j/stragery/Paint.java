package ru.job4j.stragery;

public class Paint {

    public static void main(String[] args) {
        Paint paint = new Paint();
        Triangle triangle = new Triangle();
        Square square = new Square();
        paint.draw(triangle);
        paint.draw(square);
    }

    public void draw(Shape shape) {
        System.out.println(shape.draw());
    }
}
