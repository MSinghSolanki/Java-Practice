
package Practice;
/**
 * @author Mohit(Mohit coding)
 * @version 0.1
 * @see <a href="https://docs.oracle.com/en/java/javase/21/docs/api/index.html" target="_blank">Java docs </a>
 */


import java.util.Scanner;

public class cbse {

    public static void main(String[] args) {
        
        Scanner marks = new Scanner(System.in);
        
        System.out.println("Enter the number of subjects:");
        int numSubjects = marks.nextInt();

        int[] subjects = new int[numSubjects];

        System.out.println("Enter the Subject Marks:");

        for(int i = 0; i < numSubjects; i++) {
            subjects[i] = marks.nextInt();
        }
       
        // Printing the marks for each subject
        System.out.println("Marks for each subject:");
        for(int i = 0; i < numSubjects; i++) {
            System.out.println("Subject " + (i+1) + ": " + subjects[i]);
        }
       
        int sum = 0;

        for(int i = 0; i < numSubjects; i++) {
            sum += subjects[i];
        }

        double totalMarks = numSubjects * 100; // Assuming each subject is out of 100

        double percentage = (sum / totalMarks) * 100;

        System.out.println("Total marks obtained: " + sum);
        System.out.println("Percentage: " + percentage + "%");
    }
}
