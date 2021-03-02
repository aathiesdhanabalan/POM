package com.quinbay.qa.training.Actions;

import com.quinbay.qa.training.pages.HomePage;
import com.quinbay.qa.training.test.Page_class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePageActions {
    public Page_class homePage;

    public HomePageActions(WebDriver driver) {
        homePage = PageFactory.initElements(driver, Page_class.class);
    }
    /*public void searchForAnItem(String item){
        homePage.setSearchText(item);
        homePage.pressReturnToSearch();
    }*/

    /*public void clickOnTab(String tab){
        String tabName = tab;

        switch(tabName){
            case "Shop":homePage.clickOnShopTab();
            break;
            case "Home": homePage.clickOnHomeTab();
            break;

        }
    }*/


    public void searchBox() {
        homePage.searchBox();
    }

    public void dismiss() {
        homePage.dismiss();
    }

    public void addtocart() {
        homePage.addtocart();
    }

    public void viewcart() {
        homePage.viewcart();
    }

    public void proceedtopay() {
        homePage.proceedtopay();
    }

    public void filldetails() {
        homePage.filldetails();
    }
}
