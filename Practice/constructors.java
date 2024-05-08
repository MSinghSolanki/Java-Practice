package Practice;



class MyMainEmployee {
    private int id;
    private String name;



    // public MyMainEmployee() {
    //     id = 45;
    //     name = "Name";
    // }

    public MyMainEmployee(String Myname,int ids) {
        id = ids;
        name = Myname;
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }
}

public class constructors {
    public static void main(String[] args) {
        MyMainEmployee emp = new MyMainEmployee("Mohit",45);
        System.out.println(emp.getId());
        System.out.println(emp.getName());
    }
}
