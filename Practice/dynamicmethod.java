
package Practice;
    class One{

        public void name(){
            System.out.println("My name is mohit");
        }

        public void greet(){
            System.out.println("Radhe Radhe");
        }
    }   
    class Two extends One{
   @Override
        public void name(){
            System.out.println("My name is java in class two");
        }

        public void greet(){
            System.out.println("Jai shree ram");
        }
        public void on(){
            System.out.println("Turn on ");
        }
    }   

   




public class dynamicmethod {

    public static void main(String[] args) {

        // One obj = new One();
        // Two tobj = new Two();

        // obj.name();
        // obj.greet();

    //    dyamic method dispatch - Object is decided at runtime which should be running

    
        One obj = new Two();  // reference of super class and object of subclass but not vice-versa
        // Two sobj = new One(); //Not allowed
        obj.greet(); //jiska object uska method run hoga
        //obj.on(); 
        // only those method can run which are in super class
        

        
    }
    
}
