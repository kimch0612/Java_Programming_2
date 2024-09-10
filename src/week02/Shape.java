package week02;

public abstract class Shape {
    private String name;
    public Shape(String name){
        this.name = name;
    }
    public abstract double calcArea();
}

class Circle extends Shape{
    private int radius;
    public Circle(String name, int radius) {
        super(name);
        this.radius = radius;
    }
    public double calcArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

class Rectangle extends Shape {
    private int width, height;
    public Rectangle(String name, int width, int height) {
        super(name);
        this.width = width;
        this.height = height;
    }
    public double calcArea() {
        return width * height;
    }
}