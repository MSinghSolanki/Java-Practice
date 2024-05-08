package Practice;


    
    // private
    //Default
    //Protected
    // public

    class MyEmployee{

        private int id;
        private String name;

        // Getters and Setters

        public String getName(){
            return name;
        }

        public void setName(String n){
            // this.name=n
            name =n;
        }


        public void setId(int i){
             id =i;
        }
        public int getId(){
            return id;
        }

    }


    public class mofifiers {
    public static void main(String[] args) {
      
        MyEmployee harry = new MyEmployee();
        // harry.id=45;
        // harry.name = "Mohit";  --> Throws an error due to private access modifier
        harry.setName("Mohit");
        harry.setId(2);
        System.out.println(harry.getName());
        System.out.println(harry.getId());



    }
}
