package Practice;


class NegativeRadiusException extends Exception {
    
    @Override
    public String toString() {
        return  " Radius cannot be negative ";
    }

    @Override
    public String getMessage() {return "Radius cannot be negative";}

}


public class thowandthrows {

    //throws - An indication your function/custom function is being used
    //throw - to throw an exception

    public static double area(int r) throws NegativeRadiusException{
        if(r<0){

            throw new NegativeRadiusException();
        }

        double result = Math.PI*r*r;
        return result; 

    }

    public static int divide(int a, int b) throws ArithmeticException {
        int result = a / b;
        return result;
    }

    public static void main(String[] args) {

        try {
            int c = divide(12, 6);
            System.out.println(c);
        }

        catch (Exception e) {
            System.out.println("Exception");
            System.out.println(e);
        }

        try{
            double d = area(6);
            System.out.println(d);

        }
      catch(Exception e){
        System.out.println(e);

}
    }

}
