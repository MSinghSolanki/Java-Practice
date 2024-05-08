package Practice;

public class methods {


    // Method with return


    // static int logic(int x,int y){
    //     int z;
    //     if(x>y){
    //         z=x+y;
    //     }
    //     else{
    //         z=(x+y)*5;
    //     }

    //     return z;
    // }


    // Using Void

    // static void NewMethod(String x){
         
    //     System.out.println(x);

    // }

    
    static void foo(){
        System.out.println("Hello birather");
    }
    static void foo(int a){
       System.out.println("Hello" + a + "Birather");
    }

    static void Change(int a){
        a=98;
    }

    static void Change2(int[] arr){
        
        arr[0]=98;
    }

    public static void main(String[] args) {

        //  int a=8;
        //  int b=7;
        //  int c;
        //  c=logic(a,b);
    //    Method invocation using object creation
    // methods obj = new methods();
    //c=obj.logic(a,b)
    //     int a1=4;
    //     int b1=7;
    //     int c1;
    //   c1=logic(a1,b1);
    //    System.out.println(a+" "+b);
    //     System.out.println(c);
    //     System.out.println(c1);



    // NewMethod("Hello World");

    //Case 1 :Changing the Integer
    // int x=45;
    // Change(x);
    // System.out.println("value of x:" + x);

    //Case 2:Changing the array
    // int[] marks ={52,34,33,54,23,23};
    // Change2(marks);
    // System.out.println("Value of changed array"  +  marks[0]);



    // Method overloading

    foo();
    foo(300);
    //argument are actual!
    // Return type cannot be changed for method overloading



    }
    
}
