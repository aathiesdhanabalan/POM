package com.quinbay.qa.training.test;

import com.quinbay.qa.training.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Home_page {

    public  Page_class homepage;
    public Home_page(WebDriver driver){
        homepage=PageFactory.initElements(driver,Page_class.class);
    }

    public void searchBox() {
        homepage.searchBox();
    }

    public void dismiss() {
        homepage.dismiss();
    }

    public void addtocart() {
        homepage.addtocart();
    }

    public void viewcart() {
        homepage.viewcart();
    }

    public void proceedtopay() {
        homepage.proceedtopay();
    }

    public void filldetails() {
        homepage.filldetails();
    }
}
