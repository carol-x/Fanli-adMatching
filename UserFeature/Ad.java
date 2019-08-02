import java.util.HashMap;

public class Ad implements Entity{
    // the body value in the advertisement
    private int id;

    public Ad(int id, HashMap<String, Double> description) {
        this.id = id;
        for (String feature : description.keySet()) {
            featureMap.put(feature, description.get(feature));
        }
    }
}
