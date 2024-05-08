package Practice;





class RunThr implements Runnable{

    String name;

  public RunThr(Runnable r, String name){
 this.name =name;

  }

  public void run(){
    System.out.println(name    +    "\n I am running");
  }

}



public class constructorthread {

    public static void main(String[] args) {

        RunThr r = new RunThr(() -> {
            System.out.println("I am running");
        }, "Mohit");
        
        Thread t1 = new Thread(r);
        t1.start(); 

        // Mythr t = new Mythr("Mohit");
        // t.start();
        // System.out.println("The id of thread" + t.getId());
        // System.out.println("The id of thread" + t.getName());

    }
    
}
