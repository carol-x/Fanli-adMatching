public class FeatureMatch {
    // pick the best ad from an array to match a user
    // computed within the constructor
    private int bestAd;

    public FeatureMatch(User user, Ad[] adList) {
        double highestScore = 0;
        bestAd = 0;
        for (Ad ad : adList) {
            double score = FeatureCategory.matchScore(user, ad);
            if (score > highestScore) {
                highestScore = score;
                bestAd = ad.getId();
            }
        }
    }


    public int bestAdID() {
        return bestAd;
    }
}
