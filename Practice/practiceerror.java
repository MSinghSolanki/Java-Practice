package Practice;

import java.util.Scanner;



class MycustomException extends Exception{

    @Override
    public String toString() {
        return "You have exceed the limit";
    }

    @Override
    public String getMessage() {
        return " You have reached the limit";
    }

}

    

public class practiceerror {

//     public static int greet(){

  
//     try{

//      int a =666/a;

//     }
//     catch(IllegalArgumentException e){
//         System.out.println("hehe");

//     }
//     catch(ArithmeticException e){
//         System.out.println("haha");

//     }

// return -1;
//     }

    public static void main(String[] args) {

        boolean flag =true;
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner Sc = new Scanner(System.in);
    
        int index;
        int i=0;
       
        while(flag && i<5){
            try {
                System.out.println("Enter the value of index");
                index = Sc.nextInt();
                System.out.println("The value of marks[index] is " + marks[index]);
                break;
            }
            catch (Exception e) {
                System.out.println("Invalid Index");
                i++;
            }
        }
        if(i>=5){
            try {
                throw new MycustomException();
            } catch (MycustomException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
