package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage extends BaseClass{

    @FindBy(name = "q")
    private WebElement searchField;
    @FindBy(name = "btnK")
    private WebElement searchButton;

   public GooglePage(WebDriver driver){
       this.driver = driver;
       PageFactory.initElements(driver,this);
   }

    public void searchFacebook() {
        searchField.sendKeys("Facebook");
    }

    public void clickButton() {
        searchButton.submit();
    }
}
