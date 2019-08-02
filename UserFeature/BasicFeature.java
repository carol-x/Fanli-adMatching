public class BasicFeature {
    // basic info for the product and for personal info
    private double price;
    private int gender;
    private int age;
    private static double scoreIncrement = 0.5;
    // gender: 0 is unknown/both, 1 is female, 2 is male
    // age, priceRange: 0 is unknown

    public BasicFeature(double price, int gender, int age) {
        this.price = price;
        this.gender = gender;
        this.age = age;
    }

    public double matches(BasicFeature comparison) {
        return matchAge(age, comparison.age) + matchGender(gender, comparison.gender)
                + matchPrice(price, comparison.price);
    }

    private static double matchGender(int gender, int comparison) {
        if (gender == 0 || comparison == 0 || gender == comparison) {
            return scoreIncrement;
        }
        else {
            return 0;
        }
    }

    private static double matchPrice(double price, double comparison) {
        if (price == 0 || comparison == 0) {
            return 0;
        }
        return scoreIncrement * 3 - Math.abs(Math.log(price) - Math.log(comparison));
    }

    private static double matchAge(double age, double comparison) {
        if (age == 0 || comparison == 0) {
            return 0;
        }
        return scoreIncrement * 1 - Math.abs(Math.log(age) - Math.log(comparison));
    }
}
