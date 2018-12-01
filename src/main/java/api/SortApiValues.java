package api;

public enum SortApiValues {

    RELEVANCE("relevance"),
    PRICE("price"),
    TITLE("title"),
    BESTSELLER("bestseller"),
    CUSTOM_RATING("customerRating"),
    NEW("new");

    private String value;

    SortApiValues(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
