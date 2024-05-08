package Practice;

/**
 * @author Mohit(Mohit coding)
 * @version 0.1
 * @see <a href="https://docs.oracle.com/en/java/javase/21/docs/api/index.html" target="_blank">Java docs </a>
 */


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class exercise7 {

    public class Add {

        ArrayList<String> bookArrayList = new ArrayList<>();
        ArrayList<String> issueArrayList = new ArrayList<>();

        Scanner book = new Scanner(System.in);
        boolean AddBook = true;

        public void addBook() {

            System.out.println("If you want to enter book: Yes/No");
            String userin = book.next();

            if ("Yes".equalsIgnoreCase(userin)) {
                System.out.println("Enter the number of books to add:");
                int n = book.nextInt();

                for (int i = 0; i < n; i++) {

                    System.out.println("Enter the title:");
                    String title = book.next();

                    System.out.println("Enter Author Name:");
                    String author = book.next();

                    System.out.println("Issues to:");
                    String issueTo = book.next();

                    System.out.println("Issues on (dd-MM-yyyy):");
                    String issueOnStr = book.next();

                    Date addedon = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                    String formattedDate = sdf.format(addedon);

                    String bookDetails = "Title: " + title + ", Author: " + author + ", IssueTo: " + issueTo + ", Date: " + issueOnStr + ", Book Added on: " + formattedDate;
                    bookArrayList.add(bookDetails);
                }
            } 
            else {
                return;
            }
        }

        public void issueBook() {

            System.out.println("Enter your name:");
            String Username = book.next();
            System.out.println("Enter the book title to issue:");
            String titleToIssue = book.next();

            for (String bookItem : bookArrayList) {
                if (bookItem.contains("Title: " + titleToIssue)) {
                  System.out.println("Book issued successfully: " + titleToIssue + " to " + Username);
                    issueArrayList.add(bookItem +", Issued to:" +Username);
                    bookArrayList.remove(bookItem);
                    break;
                }
            }
        }

     public void ReturnBook(){
        
      System.out.println("Enter your name:");
            String username = book.next();

            System.out.println("Enter the book title to Return:");
            String titletoreturn = book.next();


            for(String bookItem :issueArrayList){
              if (bookItem.contains("Title: " + titletoreturn) && bookItem.contains("Issued to: " + username)) {
                issueArrayList.remove(bookItem);
                String originalBookItem = bookItem.replace(", Issued to: " + username, "");
  
                bookArrayList.add(originalBookItem);
                System.out.println("Book Returned successfully: " + titletoreturn + " from " + username);
                return; 
            }

          }
          System.out.println("Book not found in Data base");
     }


    }

    public static void main(String[] args) {

        exercise7 exercise = new exercise7();
        Add addBooks = exercise.new Add();
        

        // addBooks.addBook();
        // System.out.println("\nList of Books:");
        // for (String bookItem : addBooks.bookArrayList) {
        //     System.out.println(bookItem);
        // }

        // addBooks.issueBook();
        // System.out.println("\nUpdated List of Books:");
        // for (String bookItem : addBooks.bookArrayList) {
        //     System.out.println(bookItem);
        // }

        System.out.println("\nList of Issued Books:");
        for (String issuedBook : addBooks.issueArrayList) {
            System.out.println(issuedBook);
        }

        System.out.println("\n Return Book");

        addBooks.ReturnBook();    

    }
}
