package Practice;

public class moremethods {

    static int sum(int a, int b) {
        return a + b;
    }

    // Recursion

    static int factorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        else {

            return n * factorial(n - 1);
        }

    }

    // static int sum1(int a, int b, int c) {
    // return a + b + c;
    // }
    // varargs
    // static int sum3(int... arr) {
    // // int[] arr;
    // int result = 0;
    // for (int a : arr) {
    // result += a;
    // }
    // return result;
    // }

    public static void main(String[] args) {

        // System.out.println("Welcome to varargs Tutorial");
        // System.out.println("The sum of 4and 5 is" + sum(4, 5));
        // System.out.println("The sum of 4and 5 is" + sum1(4, 5, 5));
        // varargs
        // System.out.println("The sum of 4and 5 is" + sum3(4, 5, 5, 10, 11, 3));

        // Recursion
        int n = 4;
        System.out.println("Value of factorial" + factorial(n));

    }

}
