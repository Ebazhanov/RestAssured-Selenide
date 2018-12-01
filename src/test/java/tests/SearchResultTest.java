package tests;

import api.SearchApi;
import api.SearchApiJson;
import api.SearchApiRequest;
import api.SortApiValues;
import base.BaseClass;
import io.qameta.allure.Feature;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.MainHomePage;
import pages.SortWebValues;

import java.util.Map;

import static api.SearchApiParameters.NUMBER_OF_ITEMS;
import static api.SearchApiParameters.QUERY;
import static pages.SearchResultPage.getProductNameForItemsRange;
import static pages.SearchResultPage.getProductPriceForItemsRange;

@Feature("Check search results")
public class SearchResultTest extends BaseClass {

    @DataProvider
    public Object[][] walmartSearchData() {
        return new Object[][]{{
                new SearchApi
                        .SearchApiBuilder(WALMART_API_KEY, "Shell Scripting")
                        .setNumberOfItemsInSearchResults("3")
                        .build()
                        .getSearchApiMap(), SortWebValues.NONE}, {
                new SearchApi
                        .SearchApiBuilder(WALMART_API_KEY, "Shell Scripting")
                        .setNumberOfItemsInSearchResults("3")
                        .setSort(SortApiValues.PRICE)
                        .build()
                        .getSearchApiMap(), SortWebValues.PRICE_LOW}};
    }

    @Test(dataProvider = "walmartSearchData")
    public void compareSearchResultsWithWebAndApiRequest(Map<String, String> queryMap, SortWebValues webSort) {
        SearchApiJson searchResultsApiJson = SearchApiRequest.makeSearchRequest(queryMap);
        new MainHomePage()
                .enterTextToSearchField(queryMap.get(QUERY.getParameter()))
                .selectSortBy(webSort);

        softAssert.assertEquals(getProductNameForItemsRange(queryMap.get(NUMBER_OF_ITEMS.getParameter())),
                searchResultsApiJson.getNames(), "Wrong name.");

        softAssert.assertEquals(getProductPriceForItemsRange(queryMap.get(NUMBER_OF_ITEMS.getParameter())),
                searchResultsApiJson.getPrices(), "Wrong price.");
        softAssert.assertAll();
    }
}
