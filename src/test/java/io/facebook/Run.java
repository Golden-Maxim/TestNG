package io.facebook;

import PageObjects.BaseClass;
import PageObjects.GooglePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Run extends BaseClass {
    @Test
    public void googleTest(){
        GooglePage googlePage = PageFactory.initElements(driver, GooglePage.class);
        googlePage.navigateTo("https://www.google.com/");
        googlePage.searchFacebook();
        googlePage.clickButton();
    }
}
