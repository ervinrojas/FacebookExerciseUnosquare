package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Setup {

    public WebDriver driver;
    public By month = By.cssSelector("#month>option[value='7']");
    public By day = By.cssSelector("#day>option[value='7']");
    public By year = By.cssSelector("#year>option[value='1983']");

    public static String url = "https://www.facebook.com";

    public WebDriver CreateDriver()	{

        System.setProperty("webdriver.chrome.driver", "src/main/Resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        return driver;
    }

    public static boolean urlValidator(String url){
        try{
            new URL(url).toURI();
            return true;
        }catch (URISyntaxException exception){
            return false;
        }catch (MalformedURLException exception){
            return false;
        }
        //UrlValidator defaultValidator = new UrlValidator();
        //return defaultValidator.isValid(url);
    }

    public void Click(WebElement element){
        element.click();
    }

    public void SendText(WebElement element, String value){
        element.sendKeys(value);
    }

    public String getText(By locator) {
        return driver.findElement(locator).getText();
    }
    public WebElement findElement(By locator)	{
        return driver.findElement(locator);
    }

    public List<WebElement> findElements(By locator)	{
        return driver.findElements(locator);
    }
    public String DropDownListMonth(){
        WebElement option = findElement(month);
        option.click();
        return option.getText();
    }

    public String DropdownListDay(){
        WebElement option = findElement(day);
        option.click();
        return option.getText();
    }

    public String DropdownListYear(){
        WebElement option = findElement(year);
        option.click();
        return option.getText();
    }
}
