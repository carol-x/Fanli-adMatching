import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class FeatureMatchTest {
    Ad[] adList = new Ad[10];

    public FeatureMatchTest() {
        for (int i = 0; i < 10; i++) {
            adList[i] = new Ad(100 + i, randomizedMap());
        }

        User user1 = sportyUser(100);
        User user2 = artsyUser(101);

        int bestMatch1 = new FeatureMatch(user1, adList).bestAdID();
        int bestMatch2 = new FeatureMatch(user2, adList).bestAdID();

        // visualized test
        System.out.println("Best matching id for the sportyUser is " + bestMatch1);
        printFeatureMap(adList[bestMatch1 - 100].getFeatureMap());

        System.out.println("Best matching id for the artsyUser is " + bestMatch2);
        printFeatureMap(adList[bestMatch2 - 100].getFeatureMap());
    }

    /// random feature map utilities

    private HashMap<String, Double> randomizedMap() {
        HashMap<String, Double> result = new HashMap<>();
        for (String feature : FeatureCategory.CATEGORY) {
            result.put(feature, new Random().nextDouble());
        }
        return result;
    }

    private void printFeatureMap(HashMap<String, Double> map) {
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }


    /// random user utility

    private User sportyUser(int Id) {
        User user = new User(Id);
        user.updateFeature("sport", 0.8);
        user.updateFeature("cosmetics", 0.1);
        user.updateFeature("home", 0.4);
        user.updateFeature("computer", 0.9);
        user.updateFeature("dress", 0);
        user.updateFeature("coffee", 0.5);
        return user;
    }

    private User artsyUser(int Id) {
        User user = new User(Id);
        user.updateFeature("sport", 0.1);
        user.updateFeature("cosmetics", 0.9);
        user.updateFeature("home", 0.4);
        user.updateFeature("computer", 0.3);
        user.updateFeature("dress", 0.6);
        user.updateFeature("cofee", 0.7);
        return user;
    }
}
