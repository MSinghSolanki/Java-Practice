package Practice;

/**
 * @author Mohit(Mohit coding)
 * @version 0.1
 * @see <a href="https://docs.oracle.com/en/java/javase/21/docs/api/index.html" target="_blank">Java docs </a>
 */


import java.util.Scanner;


     class MyException extends Exception {
    
        @Override
        public String toString() {
            return super.toString() + " I am in toString() ";
        }

        @Override
        public String getMessage() {
            return super.getMessage() + " I am in getMessage() ";
        }
    }

    
public class Exceptionnn {
    
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        if(a < 9){
            try {

              throw new ArithmeticException("Divide byzep");

            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
