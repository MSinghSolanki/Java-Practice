package Practice;

interface SampleInterface {
    void meth1();

    void meth2();
}

interface childSampleInterface extends SampleInterface {
    void meth3();

    void meth4();

}

class SampleClass implements childSampleInterface {
    public void meth3() {
        System.out.println("Meth3");
    }

    public void meth4() {
        System.out.println("Meth4");
    }

    public void meth1() {
        System.out.println("Meth1");
    }

    public void meth2() {
        System.out.println("Meth2");
    }
}

public class inheriInterface {

    public static void main(String[] args) {


        

    }

}
