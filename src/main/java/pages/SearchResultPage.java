package pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;


public class SearchResultPage {

    private static String SORT_BY_ICON = "select.field-input.field-input--primary";

    public static List<String> getProductNameForItemsRange(String number) {
        return $$(".product-title-link.line-clamp.line-clamp-2").texts().subList(0, Integer.parseInt(number));
    }

    public static String getProductPriceForItemsRange(String number) {
        return $$(".product-variant-price").texts().subList(0, Integer.parseInt(number)).toString().replace("$", "");
    }

    public SearchResultPage selectSortBy(SortWebValues sortType) {
        if (!sortType.equals(SortWebValues.NONE)) {
            selectSortByOptionByName(sortType);
        }
        return this;
    }

    @Step
    private void selectSortByOptionByName(SortWebValues sortType) {
        $(SORT_BY_ICON).waitUntil(Condition.visible, 1000).click();
        $(SORT_BY_ICON).selectOptionByValue(sortType.getValue());
    }

}
