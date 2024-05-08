package Practice;

import javax.sound.midi.Soundbank;


// prblem1
// class Employeee{

//     int salary;
//     String name;
  
//     public int getSalary(){
//         return salary;
//     }
     
//     public String getName(){
//         return name;
//     }

//     public void setName(String n){
//          name=n;
//     }
//  }



// problem2

//  class cellphone{


//     public void ringing(){
//         System.out.println("Ringing.....");
//     }
//     public void vibrating(){
//         System.out.println("vibrating.....");
//     }

//  }



//problen 3

class square{


    int side;
    public int area(){
        return side*side;

    }

    public int premiter(){
        return 4*side;

    }



}




 public class oopspractice {
    public static void main(String[] args) {


    //problem1
        // Employeee harry = new Employeee();
        // harry.setName("Mohit");
        // System.out.println(harry.getName());
        // harry.salary=2344;
        // System.out.println(harry.getSalary());

// problem2

    // cellphone phone=new cellphone();
    // phone.ringing();
    // phone.vibrating();

// problem3

   square sq=new square();
   sq.side =45;
   System.out.println(sq.area());
   System.out.println(sq.premiter());






    }
}