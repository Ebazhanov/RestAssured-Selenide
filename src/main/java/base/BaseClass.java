package base;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import java.util.ResourceBundle;

import static com.codeborne.selenide.Selenide.open;

public class BaseClass {

    private static final String URL = ResourceBundle.getBundle("test").getString("URL");
    protected SoftAssert softAssert;
    public static final String WALMART_API_KEY = ResourceBundle.getBundle("api").getString("API_KEY");

    @BeforeTest
    public void beforeTest() {
        open(URL);
    }

    @BeforeMethod
    public void beforeMethod() {
        softAssert = new SoftAssert();
    }

    @AfterTest
    public void afterTest() {
        Selenide.clearBrowserCookies();
        Selenide.close();
    }

}
