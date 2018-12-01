package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class MainHomePage {

    private final String HEADER_SEARCH_FIELD = ".GlobalHeaderSearchbar-input.header-GlobalSearch-input";
    private final String SEARCH_BUTTON = ".elc-icon.elc-icon-search-nav.elc-icon-18";

    public SearchResultPage enterTextToSearchField(String text) {
        enterText(text);
        clickSearchIcon();
        return new SearchResultPage();
    }

    @Step
    private void enterText(String text) {
        $(HEADER_SEARCH_FIELD).setValue(text);
    }

    @Step
    private void clickSearchIcon() {
        $(SEARCH_BUTTON).click();
    }

}
