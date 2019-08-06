import java.util.HashMap;

public class FeatureCategory {
    public static final String[] CATEGORY = {"sport", "home", "cosmetics", "dress", "foodie", "coffee", "computer"};
    public static final String[] FEATURES = {"location", "device", "social media", "favorite web", "time spent"};
    public static final String[] technicalIndex = {"web browser", "dimension", "device", "internet"};
    public static final String[] BEHAVIORS = {"browsing category", "9k9", "searching", "keywords"};


    public static HashMap<String, Double> featureMap() {
        HashMap<String, Double> result = new HashMap<>();
        for (String feature : CATEGORY) {
            result.put(feature, 0.0);
        }
        return result;
    }

    public static double matchScore(User user, Ad ad) {
        return matchFeatures(user.getFeatureMap(), ad.getFeatureMap());
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
