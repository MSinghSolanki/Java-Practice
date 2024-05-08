package Practice;

import java.util.Scanner;

public class nextedtrycatch {

    public static void main(String[] args) {

        int[] marks = new int[3];
        marks[0]=3;
        marks[1]=7;
        marks[2]=8;

        boolean flag = true;
        while(flag){
        Scanner sc = new Scanner(System.in);
         int ind = sc.nextInt();

        try{
            System.out.println("Try 1");

            try{
                System.out.println(marks[ind]);
                 flag=false;

            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Sorry index does not exist");
                System.out.println("Expection lv2");
            }

        }
        catch(Exception e){
            System.out.println("Expection lv1");
            System.out.println(e);
        }

    }
    }
    
}
