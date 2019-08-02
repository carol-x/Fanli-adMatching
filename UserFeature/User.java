import java.util.HashMap;

public class User extends Entity{
    // properties for the user
    // features and bestowed values

    private Behavior[] behaviors;

    public User(int id, BasicFeature info) {
        super(id, info);
    }
}