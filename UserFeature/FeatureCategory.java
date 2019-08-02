import java.util.HashMap;

public class FeatureCategory {
    public static final String[] CATEGORY = {"sport", "home", "cosmetics", "dress", "foodie", "coffee"};

    public static HashMap<String, Double> featureMap() {
        HashMap<String, Double> result = new HashMap<>();
        for (String feature : CATEGORY) {
            result.put(feature, 0.0);
        }
        return result;
    }
}
