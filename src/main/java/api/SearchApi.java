package api;

import java.util.HashMap;
import java.util.Map;

import static api.SearchApiParameters.*;

public class SearchApi {

    private final String apiKey;
    private final String isPublisherId;
    private final String query;
    private final String categoryId;
    private final String start;
    private final String sort;
    private final String order;
    private final String numItems;
    private final String format;
    private final String responseGroup;
    private final String facet;
    private final String facetFilter;
    private final String facetRange;
    private Map<String, String> searchApiMap = new HashMap<>();

    public SearchApi(String apiKey, String isPublisherId, String query, String categoryId, String start, String sort,
                     String order, String numItems, String format, String responseGroup, String facet,
                     String facetFilter, String facetRange, Map<String, String> searchApiMap) {
        this.apiKey = apiKey;
        this.isPublisherId = isPublisherId;
        this.query = query;
        this.categoryId = categoryId;
        this.start = start;
        this.sort = sort;
        this.order = order;
        this.numItems = numItems;
        this.format = format;
        this.responseGroup = responseGroup;
        this.facet = facet;
        this.facetFilter = facetFilter;
        this.facetRange = facetRange;
        this.searchApiMap.putAll(searchApiMap);
    }

    public Map<String, String> getSearchApiMap() {
        return searchApiMap;
    }

    public static class SearchApiBuilder {

        private final String apiKey;
        private final String query;
        private String isPublisherId;
        private String categoryId;
        private String start;
        private String sort;
        private String order;
        private String numItems;
        private String format;
        private String responseGroup;
        private String facet;
        private String facetFilter;
        private String facetRange;
        private Map<String, String> searchApiMap = new HashMap<>();

        public SearchApiBuilder(String apiKey, String query) {
            this.apiKey = apiKey;
            this.searchApiMap.put(API_KEY.getParameter(), apiKey);
            this.query = query;
            this.searchApiMap.put(QUERY.getParameter(), query);
        }

        public SearchApiBuilder setIsPublisherId(String isPublisherId) {
            this.isPublisherId = isPublisherId;
            this.searchApiMap.put(LS_PUBLISHER_ID.getParameter(), isPublisherId);
            return this;
        }

        public SearchApiBuilder setCategoryId(String categoryId) {
            this.categoryId = categoryId;
            this.searchApiMap.put(CATEGORY_ID.getParameter(), categoryId);
            return this;
        }

        public SearchApiBuilder setStart(String start) {
            this.start = start;
            this.searchApiMap.put(START.getParameter(), start);
            return this;
        }

        public SearchApiBuilder setSort(SortApiValues sort) {
            this.sort = sort.getValue();
            this.searchApiMap.put(SORT.getParameter(), this.sort);
            return this;
        }

        public SearchApiBuilder setOrder(String order) {
            this.order = order;
            this.searchApiMap.put(ORDER.getParameter(), order);
            return this;
        }

        public SearchApiBuilder setNumberOfItemsInSearchResults(String numItems) {
            this.numItems = numItems;
            this.searchApiMap.put(NUMBER_OF_ITEMS.getParameter(), numItems);
            return this;
        }

        public SearchApiBuilder setFormat(String format) {
            this.format = format;
            this.searchApiMap.put(FORMAT.getParameter(), format);
            return this;
        }

        public SearchApiBuilder setResponseGroup(String responseGroup) {
            this.responseGroup = responseGroup;
            this.searchApiMap.put(RESPONSE_GROUP.getParameter(), responseGroup);
            return this;
        }

        public SearchApiBuilder setFacet(String facet) {
            this.facet = facet;
            this.searchApiMap.put(FACET.getParameter(), facet);
            return this;
        }

        public SearchApiBuilder setFacetFilter(String facetFilter) {
            this.facetFilter = facetFilter;
            this.searchApiMap.put(FACET_FILTER.getParameter(), facetFilter);
            return this;
        }

        public SearchApiBuilder setFacetRange(String facetRange) {
            this.facetRange = facetRange;
            this.searchApiMap.put(FACET_RANGE.getParameter(), facetRange);
            return this;
        }

        public SearchApi build() {
            return new SearchApi(apiKey, isPublisherId, query, categoryId, start, sort, order, numItems, format,
                    responseGroup, facet, facetFilter, facetRange, searchApiMap);
        }
    }
}
