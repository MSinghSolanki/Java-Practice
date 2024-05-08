package Practice;


  class Employee{
    int id;
    String name;
    int salary;


    public void printdetails(){
        System.out.println("My id is"+" " +id);
        System.out.println("My name is"+" "+name);
    }
   
}

public class oops {



    public static void main(String[] args) {
        
        Employee mohit = new Employee();
        Employee sunil = new Employee();
        mohit.id=1;
        sunil.id=2;
        mohit.name="Mohit";
        sunil.name="Sunil";
       


        // Printing Attributes
        mohit.printdetails();
        sunil.printdetails();
        // System.out.println(mohit.id +"\n"+mohit.name);


    }
}
