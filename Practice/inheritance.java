package Practice;

//    class Base{
//     private int x;

//     public int getX() {
//         return x;
//     }

//     public void setX(int x) {
//         System.out.println("I am in base setting x now");
//         this.x = x;
//     }

//     public void printMe(){
//         System.out.println("I am a constructor");
//     }
//    } 

//    class Derived extends Base{

//     int y;

//     public int getY() {
//         return y;
//     }

//     public void setY(int y) {
//         System.out.println("I am in derived class");
//         this.y = y;
//     }

//    }



// Inheritance with constructor

class Base1 {

    Base1() {
        System.out.println("I am a base class constructor");
    }
    Base1(int a) {
        System.out.println("I am a overloaded base class constructor");
    }

}

class Derived1 extends Base1 {
    // firsly base class constructor will run
    Derived1() {
        super(0); // for calling the overloaded constructer else defualt will be called
        System.out.println("I am a Derived class constructor");
    }

    Derived1(int a){
        System.out.println("I am a overloaded derived class constructor");
    }
}

public class inheritance {

    public static void main(String[] args) {

        // Base Class
        // Base b = new Base();
        // b.setX(4);

        // System.out.println(b.getX());

        // // Derived class
        // Derived d = new Derived();
        // d.setX(5);
        // System.out.println(d.getX());
        // d.setY(6);
        // System.out.println(d.getY());

        Base1 b1 = new Base1();
        // Derived1 d1 = new Derived1(); //default constructor
        Derived1 d1 = new Derived1(3); //overloaded constructor
        

    }

}
