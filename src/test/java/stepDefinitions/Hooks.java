package stepDefinitions;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Hooks extends Base {

    @Before
    public void setup() throws MalformedURLException {
       //WebDriverManager.chromedriver().setup();
      // ChromeOptions opt = new ChromeOptions();


        ChromeOptions opt = new ChromeOptions();
        driver = new RemoteWebDriver(new URL("http://3.145.197.131:4444"),opt);
    }

    @After
    public void tearDown() throws InterruptedException {

        driver.quit();
    }
}
