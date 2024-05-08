package Practice;

public class finallyblock {

    // Finally block contains code which is always excecuted whether
    // their is exception handled or not

    // public static int greet(){
    //     try {
    //         int a = 5;
    //         int b = 5;
    //         int c = a / b;
    //         return c;

    //     } catch (Exception e) {
    //         System.out.println(e);

    //     } finally {
    //         System.out.println("This is the end of this program");
    //     }

    //     return -1;
        
    // }


    public static int looop(){
        for(int i=0;i<10;i++){
            try{
                if(i>5){
                    return i;
                }
              
            }
            catch(Exception e){
                    System.out.println(e);
            }
            finally{
                System.out.println("I am Running ");
            }
        }
            return -1;
    }

    public static void main(String[] args) {

        // int k =greet();
        // System.out.println(k);
        int k=looop();
        System.out.println(k);

       

    }
}
