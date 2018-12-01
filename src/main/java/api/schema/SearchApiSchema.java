package api.schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class SearchApiSchema {

    @JsonProperty("query")
    private String query;
    @JsonProperty("sort")
    private String sort;
    @JsonProperty("responseGroup")
    private String responseGroup;
    @JsonProperty("totalResults")
    private Integer totalResults;
    @JsonProperty("start")
    private Integer start;
    @JsonProperty("numItems")
    private Integer numItems;
    @JsonProperty("items")
    private List<Item> items = null;
    @JsonProperty("facets")
    private List<Object> facets = null;

    /**
     * No args constructor for use in serialization
     */
    public SearchApiSchema() {
    }

    /**
     * @param sort
     * @param items
     * @param start
     * @param totalResults
     * @param query
     * @param facets
     * @param responseGroup
     * @param numItems
     */
    public SearchApiSchema(String query, String sort, String responseGroup, Integer totalResults, Integer start, Integer numItems, List<Item> items, List<Object> facets) {
        super();
        this.query = query;
        this.sort = sort;
        this.responseGroup = responseGroup;
        this.totalResults = totalResults;
        this.start = start;
        this.numItems = numItems;
        this.items = items;
        this.facets = facets;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getResponseGroup() {
        return responseGroup;
    }

    public void setResponseGroup(String responseGroup) {
        this.responseGroup = responseGroup;
    }

    public Integer getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getNumItems() {
        return numItems;
    }

    public void setNumItems(Integer numItems) {
        this.numItems = numItems;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public List<Object> getFacets() {
        return facets;
    }

    public void setFacets(List<Object> facets) {
        this.facets = facets;
    }

}
