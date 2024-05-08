package Practice;



  class oneClass{

    int a;

    oneClass(){
        System.out.println("I am a default");
    }

    oneClass(int v){
        // a=v;
        this.a=v; // this is a reference
        // this.a =a; cam be used if variable name same

    }

    public int getA() {
        return a;
    }
  
    public int returnOne(){
      return 1;
    }
  }

  class twoClass extends oneClass{

    twoClass(){
        System.out.println("I am a default twoclass constructor");
    }

    twoClass(int c){
        // super(c); // calling contructor of class one with a argument
        System.out.println("I am a constructor");

    }
  }


public class thissuper {

public static void main(String[] args) {

    oneClass c = new oneClass(5);
    System.out.println(c.getA());
    twoClass t = new twoClass();
    
}

    
}
