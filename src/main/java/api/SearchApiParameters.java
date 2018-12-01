package api;

public enum SearchApiParameters {

    API_KEY("apiKey"),
    LS_PUBLISHER_ID("lsPublisherId"),
    QUERY("query"),
    CATEGORY_ID("categoryId"),
    START("start"),
    SORT("sort"),
    ORDER("order"),
    NUMBER_OF_ITEMS("numItems"),
    FORMAT("format"),
    RESPONSE_GROUP("responseGroup"),
    FACET("facet"),
    FACET_FILTER("facet.filter"),
    FACET_RANGE("facet.range");

    private String parameter;

    SearchApiParameters(String parameter) {
        this.parameter = parameter;
    }

    public String getParameter() {
        return parameter;
    }
}
