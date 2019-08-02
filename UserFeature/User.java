import java.util.HashMap;

public class User{
    // properties for the user
    // features and bestowed values
    private int id;
    private Feature[] features;
    private Behavior[] behaviors;
    private HashMap<String, Double> featureMap;

    public User(int id) {
        this.id = id;
        this.featureMap = FeatureCategory.featureMap();
    }

    public void updateFeature(String feature, double score) {
        featureMap.put(feature, score);
    }
}