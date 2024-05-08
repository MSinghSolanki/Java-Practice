package Practice;



// class ThreadMorning extends Thread{

//     public void run(){
//         while(true){
//             System.out.println("good morning");
//             System.out.println("Welcome");
        
//         try {
//             Thread.sleep(2000); // Sleep for 1 second
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }
//     }
// }
// }
class ThreadMorning extends Thread{

    public void run(){
        while(true){
            System.out.println("good morning");
            System.out.println("Welcome");
        
        try {
            Thread.sleep(2000); // Sleep for 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
}
public class ThreadPractice {

    public static void main(String[] args) {
        

        ThreadMorning t1 = new ThreadMorning();
        ThreadMorning t2 = new ThreadMorning();
        t1.start();

        System.out.println(Thread.currentThread().getState());
    }
    
}

