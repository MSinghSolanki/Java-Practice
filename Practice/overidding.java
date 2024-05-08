package Practice;

// method overidding same method names in different classes
//argument should be same also
//return type should be same 
//access level should not be restricted like public cannot be convert to private
// static cannot be overrided

class A {

    int a;

    public void meth1() {
        System.out.println("I am method one");
    }

    public int meth2(int v) {
        return v;
    }
}

class B extends A {
    @Override // annotations to debug properly
    public void meth1() {
        System.out.println("I am meth1 of class b");
    }

    public void meth3() {
        System.out.println("I am method 3 ");
    }
}

public class overidding {

    public static void main(String[] args) {

        A me = new A();

        me.meth1();
        B you = new B();
        you.meth1();

    }

}
