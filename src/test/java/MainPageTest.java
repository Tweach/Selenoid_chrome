import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.$x;

public class MainPageTest extends BaseUITest {
    @Test
    public void testName() throws InterruptedException {
        MainPage.open();
        Thread.sleep(10000);
        $x("//input[@name='text']").shouldHave(appear).setValue("text");
        Thread.sleep(5000);
    }
}