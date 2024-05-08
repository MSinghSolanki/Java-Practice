package Practice;


 class MyNewThread1 extends Thread{
    public void run(){
         
        int i=0;

        while(i<2){
            System.out.println("My thread1 is running");
            System.out.println("I am happy!");
            i++;
        }
    }

}
 class MyNewThread2 extends Thread{
    public void run(){
         
        int i=0;

        while(i<2){
            System.out.println("My thread2 is running");
            System.out.println("I am happy!");
            i++;
        }
    }

}



 



public class ThreadMethod {

    public static void main(String[] args) {

        MyNewThread1 t1 = new MyNewThread1();
        // MyNewThread1 t3 = new MyNewThread1();
        MyNewThread2 t2 = new MyNewThread2();
        // t3.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        try{
            t1.join();
            System.out.println("Continue");
        }
        catch(Exception e){
            System.out.println(e);
        }
        // t3.start();
        t2.start();

        


    }
    
}
