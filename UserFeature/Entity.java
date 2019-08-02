import java.util.HashMap;

public interface Entity {
    HashMap<String, Double> featureMap = FeatureCategory.featureMap(); //contains value between 0 and 1
    int id = 0;

    default void updateFeature(String feature, double score) {
        featureMap.put(feature, score);
    }

    default HashMap<String, Double> getFeatureMap() {
        return featureMap;
    }

    default  int getId() {
        return id;
    }
}
