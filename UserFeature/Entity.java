import java.util.HashMap;

public class Entity {
    HashMap<String, Double> featureMap = FeatureCategory.featureMap(); //contains value between 0 and 1
    private int id;
    private BasicFeature basicInfo;

    public Entity(int id, BasicFeature info) {
        this.id = id;
        basicInfo = info;
    }

    public void updateBasicInfo(double price, int gender, int age) {
        basicInfo = new BasicFeature(price, gender, age);
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

    public BasicFeature getBasicInfo() {
        return basicInfo;
    }
}
