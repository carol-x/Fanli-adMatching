public class FeatureMatch {
    // pick the best ad from an array to match a user
    // computed within the constructor
    private int bestAd;
    private static final double featureWeight = 0.7;

    public FeatureMatch(User user, Ad[] adList) {
        double highestScore = 0;
        bestAd = 0;
        for (Ad ad : adList) {
            double score = FeatureCategory.matchScore(user, ad) * featureWeight
                    + user.getBasicInfo().matches(ad.getBasicInfo()) * (1 - featureWeight);

            // testing
            System.out.println("total score is " + score);
            System.out.println("feature score is " + FeatureCategory.matchScore(user, ad) * featureWeight +
                    ", basic score is " + user.getBasicInfo().matches(ad.getBasicInfo()) * (1 - featureWeight));
            System.out.println();

            if (score > highestScore) {
                highestScore = score;
                bestAd = ad.getId();
            }
        }
        //System.out.println(highestScore);
    }

    public int bestAdID() {
        return bestAd;
    }
}
