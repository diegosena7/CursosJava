package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PageObject {

    protected WebDriver browser;

    public PageObject(WebDriver browser) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver1.exe");
        if (this.browser == null){
            this.browser = new ChromeDriver();
        }else{
            this.browser = browser;
        }
        this.browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS)
        .pageLoadTimeout(10, TimeUnit.SECONDS);
    }

    public void fecharBrowser(){
        this.browser.quit();
    }
}
