import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class FirstTest {


    WebDriver driver;
    private Logger logger = LogManager.getLogger(FirstTest.class);

    @BeforeTest
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        logger.info("Драйвер поднят");

    }

    @Test
    public void testOtus (){


        driver.get("https://otus.ru");
        System.out.println(driver.getTitle()+"=============");
        logger.info("Открыт браузер");

    }

    @AfterTest
    public void setDown(){
        if (driver != null) {
            driver.quit();
        }

    }
}
