
package Practice;


  interface Bicycle{
    int a=45;
    void applyBrake(int decremnet);
    void speedUp(int increment);
  }

  /**
   * HornBicycle
   */
   interface HornBicycle {

    void blowHornking();
    void blowhornhmn();
  
    
  }


  class AvonCycle implements Bicycle,HornBicycle{
    void blowHorn(){
        System.out.println("jaat yamla pagla diwana");
    }
    
    public void applyBrake(int decremnet){
        System.out.println("Applying brake");
    }
   public void speedUp(int increment){
        System.out.println("Accelerating");
    }

    public void blowHornking(){
        System.out.println("jdfjdfsf");
    }
    public void blowhornhmn(){

        System.out.println("main hoon");

    }
  }

 public class interfacess {

    public static void main(String[] args) {
        
        AvonCycle cycleHarry = new AvonCycle();
        cycleHarry.applyBrake(1);
        // You can create properties in Interfaces
        System.out.println(cycleHarry.a);
        // You cannot modify the properties 
        // cycleHarry.a=45;
        // sout(cycleHarry.a)






      

    }



    
    
}
