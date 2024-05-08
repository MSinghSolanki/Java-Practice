package Practice;


class Mythr extends Thread{


 public Mythr(String name){
    super(name);
 }

 public void run(){

    System.out.println("Thank You"+ this.getName());
   
 }
}





public class threadprio {

    public static void main(String[] args) {

        Mythr t1 = new Mythr("mohit 1");
        Mythr t2 = new Mythr("mohit 2");
        Mythr t3 = new Mythr("mohit 3");
        Mythr t4 = new Mythr("mohit 4 Most Important");

        t4.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
    }
    
}
