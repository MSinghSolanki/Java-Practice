

package Practice;

class library{

    int[] books = new int[100];
    int[] issuedBooks = new int[100];
    int issuedCount=0;
    
   public library(){


     books[0] =1;
     books[1] =2;
     books[2] =3;
     books[3] =4;
     books[4] =5;
     books[5] =6;
     books[6] =7;
     books[7] =8;
     books[8] =9;
     books[9] =10;
     books[10] =11;
     books[11] =12;
     }



    public void showBooks(){
        System.out.println("Available Books:");
        for(int i=0;i<books.length;i++){
            if(books[i]!=0){
            System.out.println(books[i]);
            }
        }
    }
    public void addbook(int bookId){
        for(int i=0;i<books.length;i++){
            if(books[i]==0){
                books[i]=bookId;
                break;
            }
        }
    }
    public void issueBook(int bookId) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == bookId) {
                issuedBooks[issuedCount++] = bookId;
                books[i] = 0;
                break;
            }
        }
    }
    public void showIssueBook(){

        for(int i=0;i<issuedBooks.length;i++){

            if(issuedBooks[i]!=0){
            System.out.println(issuedBooks[i]);
            }
        }
    }
    public void returnBook(int bookId){

        for(int i=0;i<issuedCount;i++){
            if(issuedBooks[i]==bookId){
                books[getEmptyIndex(books)] = bookId;
                removeIssuedBook(i);
                break;
            }
        }
    }


private void removeIssuedBook(int index) {
        for (int i = index; i < issuedCount - 1; i++) {
            issuedBooks[i] = issuedBooks[i + 1];
        }
        issuedBooks[--issuedCount] = 0;
    }

    private int getEmptyIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                return i;
            }
        }
        return -1;
    }
}


public class exercise4 {

    public static void main(String[] args) {

        //Implement Library Using Java class library
        //Methods: addbook,issueBook , returnBook ,showAvailableBooks , showIssuedbook
        //Properties : Array to store the available books
        //array to store issue book


        library lib = new library();
        System.out.println("Initial available books:");
        // lib.showBooks();
     
        lib.addbook(13);
        lib.addbook(14);
        System.out.println("\nAfter adding a book:");
        lib.showBooks();

        lib.issueBook(3);
        lib.issueBook(4);
        lib.issueBook(1);
        lib.issueBook(2);
        System.out.println("\nAfter issuing a book:");
        lib.showIssueBook();


        lib.returnBook(3);
        lib.returnBook(2);
        System.out.println("\nAfter returning a book:");
        lib.showIssueBook();
        lib.showBooks();


        
    }
    
}
