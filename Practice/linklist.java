package Practice;


import java.util.*;;



public class linklist {

    public static void main(String[] args) {
        
        LinkedList<Integer> linklist = new LinkedList<>();
        linklist.add(5);
        linklist.add(3);
        linklist.add(4);
        linklist.add(7);
        linklist.add(6);
        linklist.addFirst(1);
        linklist.addLast(9);

        System.out.println("linklist:");
        for (int i = 0; i < linklist.size(); i++) {
            System.out.println(linklist.get(i));
        }


    }
    
}
