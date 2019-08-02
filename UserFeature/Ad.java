import java.util.HashMap;

public class Ad extends Entity{
    // the body value in the advertisement

    public Ad(int id, HashMap<String, Double> description) {
        super(id);
        for (String feature : description.keySet()) {
            featureMap.put(feature, description.get(feature));
        }
    }
}
