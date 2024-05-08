package Practice;

// import java.util.ArrayList;
// import java.util.Set;
// import java.util.TreeSet;
import java.util.*;
//Advance Java - 1
/* why we need collection

Insert an element 
resize an array
insert an element between

types of collection
arrayList - for variable size collection
set - for distinct collections
stack -lifo ds
hashMap - storing key value pairs
*/

public class frame {
    public static void main(String[] args) {

        // ArrayList
        // Set
        // TreeSet

        Scanner inp = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        // arrayList2.add(15);
        // arrayList2.add(32);
        // arrayList2.add(35);
        // arrayList.add(5);
        // arrayList.add(3);
        // arrayList.add(4);
        // arrayList.add(7);
        // arrayList.add(6);
        // arrayList.addAll(arrayList2);

        System.out.println("Enter the number of elements for the list:");
        int n = inp.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the Number for List");
            int newList = inp.nextInt();
            arrayList.add(newList);

        }
        System.out.println(arrayList);

        // System.out.println("ArrayList:");
        // for (int i = 0; i < arrayList.size(); i++) {
        // System.out.print(arrayList.get(i));
        // System.out.print(", ");
        // }

    }

}
