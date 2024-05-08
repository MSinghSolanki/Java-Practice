package Practice;

public class practicemethod {


    // static void Table(int num){
    //     // Tables method

    //     int count;
    //     for(int i=0;i<=10;i++){

    //         count =num*i;
    //    System.out.format("%d*%d=%d\n",num,i,count);

    //     }

    // }


    //  start printing method

    // static void Star(int n) {
    //     for (int i = 0; i < n; i++) {
    //         // Print stars in each row
    //         for (int j = 0; j < i+ 1; j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println(); // Move to the next line for the next row
    //     }
    // }

    //  start printing method reverse

    // static void Star(int n) {
    //     for (int i =n; i>0; i--) {
    //         // Print stars in each row
    //         for (int j = 0; j <i; j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println(); // Move to the next line for the next row
    //     }
    // }


   static int Sumrec(int n){

    if(n==1){
        return 1;
    }

      return n+Sumrec(n-1);

   }


    // Recursive function
    

     



    
    public static void main(String[] args) {



        // Table(3);
        // Star(4);
        // Star(4);
        int n = 5; // Example input
        int sum = Sumrec(n);
        System.out.println("Sum of integers from 1 to " + n + " is: " + sum);
        
    }

    
}
