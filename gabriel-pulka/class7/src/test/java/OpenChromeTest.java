import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;


public class OpenChromeTest {

    @Test
    public void testChrome(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String googleUrl = "http://www.google.com";
        driver.get(googleUrl);

        Assert.assertEquals(driver.getTitle(), "Google", "The url are not equals");

        driver.quit();
    }



}


