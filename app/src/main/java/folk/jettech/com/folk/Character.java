package folk.jettech.com.folk;

/**
 * Created by eduardo.willian on 14/02/2018.
 */

public class Character {

    private String name, description, city;

    public Character(String name, String descrption, String city) {
        this.name = name;
        this.description = descrption;
        this.city = city;
    }

    public Character(String name, String descrption) {
        this.name = name;
        this.description = descrption;
    }

    public Character() {


    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getDescritpion() {
        return this.description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
