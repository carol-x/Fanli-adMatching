import java.util.HashMap;

public class User implements Entity{
    // properties for the user
    // features and bestowed values
    private int id;
    private int gender, age, priceRange;
        // gender: 0 is unknown, 1 is female, 2 is male
        // age, priceRange: 0 is unknown
    private Feature[] features;
    private Behavior[] behaviors;

    public User(int id) {
        this.id = id;
    }

    public void basicInfo(int gender, int age, int priceRange) {
        this.gender = gender;
        this.age = age;
        this.priceRange = priceRange;
    }

}