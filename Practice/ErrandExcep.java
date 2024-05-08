package Practice;





public class ErrandExcep {

    public static void main(String[] args) {
        int a =33;
        int b =0;
      
        
     
        // System.out.println(a);

        try{
          
            int c =a/b;
         System.out.println(c);
            
        }
        catch(ArithmeticException e){
            System.out.println("Cannot be divided");
            System.out.println(e);
        }
        
    }
    
}
