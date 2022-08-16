package Locators;

import org.openqa.selenium.By;

public class Identifiers {

    public By NewAccount = By.xpath("//div[@id='globalContainer']/div/div/div/div/div[2]/div/div/form/div[5]/a");
    public By firstname = By.name("firstname");
    public By lastname = By.name("lastname");
    private By mobile = By.name("reg_email__");
    private By pass = By.id("password_step_input");
    public By gender = By.xpath("//*[@id='reg_form_box']/div[7]/span/span[1]");
    public By close = By.xpath("//body/div[3]/div/div/div/img");
    public  By label = By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/h2");
    public  By forgot = By.xpath("//form/div[3]/a");
    public By find = By.xpath("//*[@id=\"identify_yourself_flow\"]/div/div[1]/div/div[2]/h2");
    public By email = By.cssSelector("#identify_email");
    public By searchbtn = By.xpath("//*[@id=\"did_submit\"]");

    public By nosearch = By.xpath("//*[@id=\"identify_yourself_flow\"]/div/div[2]/div[1]/div[1]");

    public By getMobile() {
        return mobile;
    }

    public By getPass(){
        return pass;
    }

    public void setPass(By pass) {
        this.pass = pass;
    }

    public By getGender(){
        return gender;
    }

    public By getClose(){
        return close;
    }

    public By getLabel(){
        return label;
    }

    public By getForgot(){
        return forgot;
    }

    public By getFind() {
        return find;
    }

    public By getEmail() {
        return email;
    }

    public By getSearchbtn() {
        return searchbtn;
    }

    public By getNosearch() {
        return nosearch;
    }
}