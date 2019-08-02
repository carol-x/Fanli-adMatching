import java.util.HashMap;

public class Entity {
    HashMap<String, Double> featureMap = FeatureCategory.featureMap(); //contains value between 0 and 1
    private int id;

    public Entity(int id) {
        this.id = id;
    }

    public void updateFeature(String feature, double score) {
        featureMap.put(feature, score);
    }

    public HashMap<String, Double> getFeatureMap() {
        return featureMap;
    }
    public int getId() {
        return id;
    }
}
