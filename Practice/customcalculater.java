package Practice;

import java.util.Scanner;

//Create a custom calculator with:
        //+,-,*,/,%
        // which throws following exception:
        //Invalid Input exception
        //cannot divide by zero
        //Max Input Exception
        //Max Multiplier Reached Expection - not greater than 7000

        class InvalidException extends Exception{
            @Override

            public String toString(){
                return "Invalid Input received";
            }
        }
        class DivideByZeroException extends Exception {
            @Override
            public String toString() {
                return "Cannot divide by zero";
            }
        }
        
        class MaxInputException extends Exception {
            @Override
            public String toString() {
                return "Max Input Exception - Input should be less than or equal to 10000";
            }
        }
        class MaxMultiplierReachedException extends Exception {
            @Override
            public String toString() {
                return "Max Multiplier Reached Exception - not greater than 7000";
            }
        }
        

      class operations{

        public static int add(int[] adds) throws MaxInputException{

            int n =adds.length;
            int sum=0;

            for(int i=0;i<n;i++){
                if(adds[i]>1000){
                    throw new MaxInputException();
                }
                sum=sum+adds[i];
            }

            return sum;
        }

        public static int sub(int[] subs) throws MaxInputException{

            int n =subs.length;
            int sum=0;
            for(int i=0;i<=n;i++){
                if (subs[i] > 10000) {
                    throw new MaxInputException();
                }
                sum=sum-subs[i];
            }

            return sum;
        }
        public static int mul(int[] muls) throws InvalidException,MaxMultiplierReachedException{

            int n =muls.length;
            int product=0;
            for(int i=0;i<=n;i++){
                if (muls[i] > 7000) {
                    throw new MaxMultiplierReachedException();
                }
                product=product*i;
            }

            if (product > Integer.MAX_VALUE || product < Integer.MIN_VALUE) {
                throw new InvalidException();
            }

            return (int) product;
        }
        public int div(int[] divs) throws MaxInputException, DivideByZeroException {
            int n = divs.length;
            int quotient = divs[0];
            for (int i = 1; i < n; i++) {
                if (divs[i] == 0) {
                    throw new DivideByZeroException();
                }
                if (divs[i] > 10000) {
                    throw new MaxInputException();
                }
                quotient /= divs[i];
            }
            return quotient;
        }
    }
    


public class customcalculater{
    public static void main(String[] args) {

        operations cal = new operations();
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the operation you want to perform");
        String operation = getInput.next();
        System.out.println(operation);
        System.out.println("enter the number of operants");
        int n =getInput.nextInt();
        int[] operands = new int[n];
        System.out.println("Enter the operands:");
for (int i = 0; i < n; i++) {
    operands[i] = getInput.nextInt();
}


try {
    switch (operation) {
        case "+":
            System.out.println("Result: " + cal.add(operands));
            break;
        case "-":
            System.out.println("Result: " + cal.sub(operands));
            break;
        case "*":
            System.out.println("Result: " + cal.mul(operands));
            break;
        case "/":
            System.out.println("Result: " + cal.div(operands));
            break;
        default:
            System.out.println("Invalid operation");
    }

}
 catch (Exception e) {
    System.out.println(e.toString());
}





        
    }
}