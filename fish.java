package Hibernate2;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

/**
 * This is the fish class the tags are what allows it to have it's persistence and be stored in the database.
 */
@Entity
@Table(name = "fish")
public class fish {

    @Id
    @GeneratedValue
    private Integer fish_id;
    private String fish_name;
    private String fish_type;

    public String getFish_type() {
        return fish_type;
    }

    public void setFish_type(String fish_type) {
        this.fish_type = fish_type;
    }

    private String session;

    public String getFish_name() {
        return fish_name;
    }

    public void setFish_name(String fish_name) {
        this.fish_name = fish_name;
    }



    @Override
    public String toString() {
        return "FISH{" +
                "id=" + fish_id +
                ", fish_name='" + fish_name + '\'' +
                ", fish_type='" + fish_type + '\'' +
                ", session='" + session + '\'' +
                '}';
    }

    public Integer getId() {
        return fish_id;
    }

    public void setId(Integer id) {
        this.fish_id = id;
    }

    public String getname() {
        return fish_name;
    }

    public void setname(String name) {
        this.fish_name = name;
    }

    public String getType() {
        return fish_type;
    }

    public void setType(String type) {
        this.fish_type = type;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }
}

