package Practice;

/**
 * @author Mohit(Mohit coding)
 * @version 0.1
 * @since 2002
 * 
 * 
 */


class Rectangle {
    int length;
    int breadth;



    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int area(){
        return length*breadth;

    }
}
class Square {
    int side;

    public int getSide() {
        return side;
    }


    public void setSide(int side) {
        this.side = side;
    }

    public int area(){
        return side*side;
    }
}

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }
}

 class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double volume() {
        return super.area() * height;
    }

    public double surfaceArea() {
        return 2 * super.area() + super.circumference() * height;
    }
}

 class Sphere {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }
}




public class Exercisefive {

    public static void main(String[] args) {
        // YOu have to create a package name com.codewithharry.shape
        // This package shoould have indiviudal classes for Rectangle ,Square,Circle,Cylinder,Sphere
        // These classes should use inheritance to properly mangae code!
        // Include Methods like volumne,surface area and getters/setters for di


    }
    
}
