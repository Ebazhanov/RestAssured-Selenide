package pages;

public enum SortWebValues {

    NONE("none"),
    BEST_MATCH("best_match"),
    BEST_SELLERS("best_seller"),
    PRICE_LOW("price_low"),
    PRICE_HIGH("price_high"),
    RATING_HIGH("rating_high");

    private String value;

    SortWebValues(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
