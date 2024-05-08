package Practice;

class circle {

    public int radius;

    circle() {
        System.out.println("I am contrcutor of cirlce");
    }

    circle(int r) {

        System.out.println("I am circle parmeterized const");
        this.radius = r;

    }

    public double area() {
        return Math.PI * this.radius*this.radius;
    }

}



class cylinder extends circle {

    public int height;

    cylinder(int h,int r) {
        super(r);
        System.out.println("I am cylinder parmeterized const");
        this.height = h;

    }

    public double area() {
        return 2 * Math.PI * this.radius * this.height;
    }
}

public class inheritancepractice {

    public static void main(String[] args) {

        circle c = new circle(30);
        cylinder cy =new cylinder(32, 32);
        System.out.println(cy.area());
        System.out.println(c.area());
        


    }

}
