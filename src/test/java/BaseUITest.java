import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeSuite;

public class BaseUITest {

    @BeforeSuite
    public void setUp() {
        Configuration.baseUrl = "https://yandex.ru/";
        Configuration.browser = "SelenoidDriverProvider";
        Configuration.timeout = 10000;
        Configuration.browserSize = "1280x1024";
    }
}
