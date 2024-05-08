package Practice;




// Threads use shared area
// Faster context switching
//thread lightweight process lightweight
// //two ways to implement thread-
// By extending thread class
// By implementing Runable interface


//By extending thread class

//  class MyThread1 extends Thread{

//     @Override

//     public void run(){
         
//         int i=0;

//         while(i<10){
//             System.out.println("My thread1 is running");
//             System.out.println("I am happy!");
//             i++;
//         }
//     }

// }

//  class MyThread2 extends Thread{

//     @Override

//     public void run(){

//         while(true){
//             System.out.println("My thread2 is running");
//             System.out.println("I am happy!");
//         }
//     }

//  }


// By implementing Runable interface


class MyThreadRunnable1 implements Runnable{


    public void run(){

        System.out.println("I am Thread 1 not a threat");


    }

}
class MyThreadRunnable2 implements Runnable{


    public void run(){

        System.out.println("I am Thread 2 not a threat");


    }

}



public class multithread {

    public static void main(String[] args) {

        //By extending thread class
        //   MyThread1 t1=new MyThread1();
        //   MyThread2 t2 = new MyThread2();
        //   t1.start();
        //   t2.start();



        //By implementing Runable interface

        MyThreadRunnable1 t1 =new MyThreadRunnable1();
        Thread t11 = new Thread(t1);

        MyThreadRunnable2 t2 = new MyThreadRunnable2();
        Thread t22 = new Thread(t2);
          
        t11.start();
        t22.start();
     

    }


                            
     
}
