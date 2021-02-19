package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AmazonHomePage {

    protected WebDriver driver;

    private String pageTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
    private String pageUrl = "https://www.amazon.com";

    private By searchInputField = By.id("twotabsearchtextbox");
    private By searchButton = By.id("nav-search-submit-button");

    public AmazonHomePage(WebDriver driver){
        this.driver = driver;
    }

    public void navigateToHomePage() {
        this.driver.get(pageUrl);
    }

    public boolean verifyPageTitle(){
        Assert.assertEquals(this.driver.getTitle(), pageTitle);
        return true;
    }

    public void enterSearchItemAndSubmit (String item) {
        this.driver.findElement(searchInputField).sendKeys(item);
        this.driver.findElement(searchButton).click();
    }


}
