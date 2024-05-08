package Practice;

import java.util.Base64;

/*Abstract -existing thought or as an idea but not having
contrete existence*/

  abstract class Base2{

    public Base2(){
        System.out.println("Constructor of Base2");
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    abstract public void greet();
  }

  class Derived extends Base2{

    @Override

    public void greet(){
        System.out.println("Radhe Radhe");
    }

  }

public class abstractin {


    public static void main(String[] args) {

        // Base2 b = new Base2();  cannot be done for abstract class
        
      Derived d = new Derived();
      



    }
    
}
