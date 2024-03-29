import java.util.HashMap;

public class Ad extends Entity{
    // the body value in the advertisement
    public Ad(int id, BasicFeature info, HashMap<String, Double> description) {
        super(id, info);
        for (String feature : description.keySet()) {
            featureMap.put(feature, description.get(feature));
        }
    }
}
