package Practice;

// abstract class Pen {

//     abstract void write();

//     abstract void refil();

// }

// class FountainPen extends Pen {

//     @Override
//     void write() {
//         System.out.println("Writing");
//     }

//     void refil() {
//         System.out.println("Refilling");
//     }

//     void changeNib(){
//         System.out.println("Changing the nib");
//     }
// }



 class Monkey{

    void jump(){
        System.out.println("jump");
    }
    void bite(){
        System.out.println("bite");
    }

 }

  
 class Human extends Monkey implements BasicAnimal{

  
    void speak(){
        System.out.println("Hello");
    }

    public void eat(){
        System.out.println("Eating");
    }
    public void sleep(){
        System.out.println("Sleeping");
    }


 }

   interface BasicAnimal{

    void eat();
    void sleep();

   }



public class absIntpractice {

    public static void main(String[] args) {

        // FountainPen pen = new FountainPen();
        // pen.changeNib();

        // Human h1 = new Human();
        // h1.sleep();
        // h1.speak();

        //poly

        Monkey h2 = new Human();
        

    }

}
