package Hibernate2;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

/**
 * Created by Spencer on 7/14/2017. This is a stripped down version of the example in the doing more with java github. It will insert objects into the MySQL Database.
 */
public class HibernateRunner2 {
    public HibernateConfig2 HibernateUtil;
    public List<fish> fishies;


    public HibernateRunner2(){
        HibernateUtil = new HibernateConfig2();

    }

    public static void main(String[] args) {
        HibernateRunner2 fishyRunner = new HibernateRunner2();
        fishyRunner.addNewFish();
    }


    private void addNewFish() {
        Session session1 = HibernateUtil.getCurrentSession();
        Transaction transaction = session1.beginTransaction();

        /*
         * create some User instances. //--------------------------->Create instances of Object
         */
        fish fish1 = new fish();
        fish1.setname("Frontosa");
        fish1.setType("Tankinikan");

        fish fish2 = new fish();
        fish2.setname("Electric Yellow");
        fish2.setType("Victorian");

        session1.save(fish1);
        session1.save(fish2);



        System.out.println("fish1 generated ID is: " + fish1.getId()+" and is "+fish2.getType());
        System.out.println("fish2 generated ID is: " + fish2.getId()+ " and is "+fish2.getType());
        System.out.println(fish1.toString());
        System.out.println(fish2.toString());

        //Select statements

        String toDo ="SELECT fish_id, fish_name from Hibernate2.fish where fish_id =1";
        Query query = session1.createQuery(toDo);
        List list  = query.list();
        System.out.println("Result for fish1 "+toDo+" is: \n"+query.list());

        String toDo2 ="SELECT fish_id, fish_name from Hibernate2.fish where fish_id =2";
        Query query2 = session1.createQuery(toDo2);
        List list2  = query.list();
        System.out.println("Result for fish2, "+toDo2+" is: \n"+query2.list());












    }
}
