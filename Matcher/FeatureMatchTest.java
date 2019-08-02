import java.util.HashMap;
import java.util.Random;

public class FeatureMatchTest {
    Ad[] adList = new Ad[10];

    public FeatureMatchTest() {
        for (int i = 0; i < 10; i++) {
            adList[i] = new Ad(100 + i, randomizedMap());
        }

        User user1 = sportyUser(100);

        int bestMatch = new FeatureMatch(user1, adList).bestAdID();

        // visualized test
        System.out.println("Best matching id is " + bestMatch);
        adList[bestMatch - 100].getFeatureMap().toString();
    }

    private HashMap<String, Double> randomizedMap() {
        HashMap<String, Double> result = new HashMap<>();
        for (String feature : FeatureCategory.CATEGORY) {
            result.put(feature, new Random().nextDouble());
        }
        return result;
    }

    private User sportyUser(int Id) {
        User user = new User(Id);
        user.updateFeature("sport", 0.8);
        user.updateFeature("cosmetics", 0.1);
        user.updateFeature("home", 0.4);
        user.updateFeature("computer", 0.9);
        user.updateFeature("dress", 0);
        user.updateFeature("computer", 0.6);
        return user;
    }
}
