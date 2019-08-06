public class KeywordSearch implements Behavior {
    // records the behavior of searching for a keyword
    private String keyword;
    private double timeStamp;
    private double timeSpent;

    @Override
    public double relevance(FeatureCategory feature) {
        return 0;
    }
}
