package Pages;

import Base.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.Assert;
import Locators.Identifiers;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    public static void main(String[] args){
        HomePage program = new HomePage();
        Identifiers locators = new Identifiers();
        Setup setup = new Setup();
        setup.driver = setup.CreateDriver();
        WebElement element;

        WebDriverWait ewait= new WebDriverWait(setup.driver, 10);

        ewait.until(ExpectedConditions.visibilityOfElementLocated(locators.NewAccount));
        if(setup.urlValidator(Setup.url)){
            System.out.println("The url "+Setup.url+" is correct.");
        }else{
            System.out.println("The url "+Setup.url+"is not correct");
        }

        Assert.assertEquals("Facebook - log in or sign up",setup.driver.getTitle());
        System.out.println(setup.driver.getTitle());
        System.out.println("Title was macthed");

        ewait.until(ExpectedConditions.visibilityOfElementLocated(locators.NewAccount));
        element = setup.driver.findElement(locators.NewAccount);
        setup.Click(element);

        ewait.until(ExpectedConditions.visibilityOfElementLocated(locators.firstname));
        element = setup.driver.findElement(locators.firstname);
        setup.SendText(element,"Pedro");

        ewait.until(ExpectedConditions.visibilityOfElementLocated(locators.lastname));
        element = setup.driver.findElement(locators.lastname);
        setup.SendText(element,"Perez");

        ewait.until(ExpectedConditions.visibilityOfElementLocated(locators.getMobile()));
        element = setup.driver.findElement(locators.getMobile());
        setup.SendText(element,"3002704079");

        ewait.until(ExpectedConditions.visibilityOfElementLocated(locators.getPass()));
        element = setup.driver.findElement(locators.getPass());
        setup.SendText(element,"123456");

        //locators.setPass();

        Assert.assertEquals("Jul", setup.DropDownListMonth());
        Assert.assertEquals("7", setup.DropdownListDay());
        Assert.assertEquals("1983", setup.DropdownListYear());

        ewait.until(ExpectedConditions.visibilityOfElementLocated(locators.getGender()));
        WebElement radio = setup.driver.findElement(locators.gender);
        setup.Click(radio);
        System.out.println("Fill information in form was complete");

        ewait.until(ExpectedConditions.visibilityOfElementLocated(locators.getClose()));
        element = setup.driver.findElement(locators.getClose());
        setup.Click(element);

        Assert.assertEquals("Connect with friends and the world around you on Facebook.",setup.getText(locators.getLabel()));

        ewait.until(ExpectedConditions.visibilityOfElementLocated(locators.getForgot()));
        element = setup.driver.findElement(locators.getForgot());
        setup.Click(element);

        Assert.assertEquals("Find Your Account",setup.getText(locators.getFind()));

        ewait.until(ExpectedConditions.visibilityOfElementLocated(locators.getEmail()));
        element = setup.driver.findElement(locators.getEmail());
        setup.SendText(element,"Prueba@unosquare.com");

        ewait.until(ExpectedConditions.visibilityOfElementLocated(locators.getSearchbtn()));
        element = setup.driver.findElement(locators.getSearchbtn());
        setup.Click(element);

        Assert.assertEquals("No Search Results",setup.getText(locators.getNosearch()));
    }

}
