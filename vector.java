import java.util.Vector;
 
public class DarthVector {
 
    public static void main(String a[]){
        Vector<String> vct = new Vector<String>();
        vct.add("StarWars");
        vct.add("Jedi");
        vct.add("Sith");
        System.out.println(vct);
        vct.add(2,"Use The Force");
        System.out.println(vct);
        System.out.println("I sense index 2 is: "+vct.get(2));
        System.out.println("One of the best movie series is: "+vct.firstElement());
        System.out.println("The dark side of the force are the: "+vct.lastElement());
        System.out.println("Is this vector empty? "+vct.isEmpty());
    }
}