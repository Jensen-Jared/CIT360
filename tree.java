import java.util.*;

public class Tree{
   public static void main(String[] args) {
      System.out.println("Tree Map!\n");
      TreeMap tMap = new TreeMap();
      tMap.put(1, "The Phantom Menace");
      tMap.put(2, "Attack of the Clones");
      tMap.put(3, "Revenge of the Sith");
      tMap.put(4, "A New Hope");
      tMap.put(5, "The Empire Strikes Back");
      tMap.put(6, "Return of the Jedi");
      System.out.println("The keys of the tree map: " + tMap.keySet());
      System.out.println("The values of the tree map: " + tMap.values());
      System.out.println("Key: 3 value: " + tMap.get(3)+ "\n");
      System.out.println("The first key: " + tMap.firstKey() + " Value: " + tMap.get(tMap.firstKey()) + "\n");
      System.out.println("The last key: " + tMap.lastKey() + " Value: "+ tMap.get(tMap.lastKey()) + "\n");
      System.out.println("Remove the first key: " + tMap.remove(tMap.firstKey()));
      System.out.println("The tree map Keys: " + tMap.keySet());
      System.out.println("The tree map contains: " + tMap.values() + "\n");
      System.out.println("Remove the last key: " + tMap.remove(tMap.lastKey()));
      
   }
}