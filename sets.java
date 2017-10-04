import java.util.*;

public class Set {

    public static void main(String args[]) {

        Set<String> mySet1 = new HashSet();
        mySet1.add("Red");
        mySet1.add("White");
        mySet1.add("Red");
        mySet1.add("Blue");
        System.out.println("mySet1: " + mySet1);

        List<String> list = new ArrayList<>();
        list.add("Red");
        list.add("White");
        list.add("Red");
        list.add("Red");
        list.add("Blue");
        list.add("White");
        
        Set<String> mySet2 = new HashSet(list);
        System.out.println("list: " + list);
        System.out.println("mySet2: " + mySet2);

        System.out.println("mySet1 matches mySet2: " + mySet1.equals(mySet2));

        mySet2.remove("Red");
        System.out.println("mySet2: " + mySet2);
        System.out.println("MySet1 matches mySet2: " + mySet1.equals(mySet2));

        System.out.println("MySet1 contains all the elements: " + mySet1.containsAll(list));
        System.out.println("MySet2 contains all the elements: " + mySet2.containsAll(list));

        mySet1.clear();
        System.out.println("mySet1 is Empty: " + mySet1.isEmpty());

        System.out.println("mySet1 has: " + mySet1.size() + " Elements");
        System.out.println("mySet2 has: " + mySet2.size() + " Elements");

    }
}