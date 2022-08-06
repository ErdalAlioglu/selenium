import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/erdalalioglu/IdeaProjects/com.selenium01/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.n11.com");
    }
}
