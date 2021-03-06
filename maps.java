import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Maps {

    public static void main(String[] args) {

        Map cars = new HashMap();

        cars.put("Skyline", 34);

        cars.put("Camaro", 17);

        cars.put("TransAm", 4);

        cars.put("Charger", 23); 

        System.out.println("Total cars: " + cars.size());
       
        for (Iterator it = cars.keySet().iterator(); it.hasNext();) {
            Object key = it.next();
            System.out.println(key + " - " + cars.get(key));
        }

        System.out.println();

        String searchKey = "Skyline";

        if(cars.containsKey(searchKey))

            System.out.println("Total " + cars.get(searchKey) + " "

                    + searchKey + " cars!\n");

        cars.clear();

        System.out.println("After clear operation, size: " + cars.size());

    }

}