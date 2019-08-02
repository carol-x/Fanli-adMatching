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

    public static double matchScore(User user, Ad ad) {
        double score = 0;
        double featureScore = matchFeatures(user.getFeatureMap(), ad.getFeatureMap());

        return score;
    }

    private static double matchFeatures(HashMap<String, Double> map1, HashMap<String, Double> map2) {
        double score = 0;
        for (String feature : map1.keySet()) {
            if (map2.containsKey(feature)) {
                score += map1.get(feature) * map2.get(feature);
            }
        }
        return score;
    }
}
