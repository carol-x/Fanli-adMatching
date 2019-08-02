public interface Feature {
    // the interface of different features

    double matches(Feature comparison); //return a double from 0 to 1 to decide if the 2 features match
    void update(Feature newVer);
}
