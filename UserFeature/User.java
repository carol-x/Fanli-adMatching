import java.util.HashMap;

public class User extends Entity{
    // properties for the user
    // features and bestowed values

    //record the last behavior to analyze relevance
    private Behavior lastBehavior;

    // generate a user based on features
    // adding-feature method is in the super class
    public User(int id, BasicFeature info) {
        super(id, info);
    }

    public void updateBehavior(Behavior behavior) {
        lastBehavior = behavior;
    }
}