package com.quinbay.qa.training.test;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.TimeUnit;

import com.quinbay.qa.training.Actions.HomePageActions;
import com.quinbay.qa.training.pages.HomePage;
//import jdk.internal.vm.annotation.ForceInline;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class Page_class {

    WebDriver driver;
    public HomePage homePage;
    @FindBy(xpath="//a[@class='woocommerce-store-notice__dismiss-link']")
    WebElement dis;
    @FindBy(id = "woocommerce-product-search-field-0")
            WebElement search;
    @FindBy(xpath ="//a[@data-product_id=38]")
            WebElement addcart;
    @FindBy (xpath = "//a[@title='View cart']")
            WebElement view_cart;
    @FindBy(xpath = "//a[@class='checkout-button button alt wc-forward']")
            WebElement proceedpay;
    @FindBy(xpath = "//input[@id='billing_first_name']")
            WebElement f_name;
    @FindBy(xpath = "//input[@id='billing_last_name']")
            WebElement s_name;
    @FindBy(xpath = "//input[@id='billing_company']")
            WebElement cmpny_name;
    @FindBy(xpath = "//select[@class='country_to_state country_select select2-hidden-accessible']")
            WebElement drpcountry1;
    @FindBy(xpath = "//input[@id='billing_address_1']")
            WebElement add1;
    @FindBy(xpath = "//input[@id='billing_address_2']")
            WebElement add2;
    @FindBy(xpath = "//select[@name='billing_state']")
            WebElement location;
    @FindBy(xpath = "//input[@id='billing_postcode']")
            WebElement zip;
    @FindBy(xpath = "//input[@id='billing_phone']")
            WebElement phone;
    @FindBy(xpath = "//input[@id='billing_email']")
            WebElement email;
    @FindBy(xpath = "//input[@id='createaccount']")
            WebElement create_pass;
    @FindBy(xpath = "//input[@id='account_password']")
            WebElement password;
    @FindBy(xpath = "//button[@class='button alt']")
            WebElement submit;
    @FindBy(xpath = "//input[@id='billing_city']")
            WebElement state;

    public void dismiss() {
        //WebElement dis=driver.findElement(By.xpath("//a[@class='woocommerce-store-notice__dismiss-link']"));
        dis.click();
    }
    public void searchBox(){
      //  WebElement search=driver.findElement(By.id("woocommerce-product-search-field-0"));
        search.click();
        search.sendKeys("Tshirt");
        search.sendKeys(Keys.RETURN);
    }
    /*public List<WebElement> elementListed(){
        List<WebElement> al=driver.findElements(By.xpath("//img[@src='https://www.edgewordstraining.co.uk/demo-site/wp-content/uploads/2018/03/vneck-tee.jpg']"));
        return al;
    }*/
    public void addtocart(){
        //WebElement addcart=driver.findElement(By.xpath("//a[@data-product_id=38]"));
        addcart.click();
    }
    public void viewcart(){
     //   WebElement view_cart=driver.findElement(By.xpath("//a[@title='View cart']"));
        view_cart.click();
    }
    public void proceedtopay(){
      //  WebElement proceedpay=driver.findElement(By.xpath("//a[@class='checkout-button button alt wc-forward']"));
        proceedpay.click();
    }
    public void filldetails(){
        //WebElement f_name=driver.findElement(By.xpath("//input[@id='billing_first_name']"));
        f_name.click();
        f_name.sendKeys("Firstname");
       // WebElement s_name=driver.findElement(By.xpath("//input[@id='billing_last_name']"));
        s_name.click();
        s_name.sendKeys("Secondname");
      //  WebElement cmpny_name=driver.findElement(By.xpath("//input[@id='billing_company']"));
        cmpny_name.click();
        cmpny_name.sendKeys("Quinbay technologies");
        Select drpcountry=new Select(drpcountry1);
        drpcountry.selectByVisibleText("India");
       // WebElement add1=driver.findElement(By.xpath("//input[@id='billing_address_1']"));
        add1.click();
        add1.sendKeys("Address value is 24 th sector");
       // WebElement add2=driver.findElement(By.xpath("//input[@id='billing_address_2']"));
        add2.click();
        add2.sendKeys("Address Bangalore Blore");
        //WebElement state=driver.findElement(By.xpath("//input[@id='billing_city']"));
        state.click();
        state.sendKeys("Bangalore");
        //state
        Select location1=new Select(location);
        location1.selectByVisibleText("Karnataka");
       // WebElement zip=driver.findElement(By.xpath("//input[@id='billing_postcode']"));
        zip.click();
        zip.sendKeys("541602");
        //WebElement phone=driver.findElement(By.xpath("//input[@id='billing_phone']"));
        phone.click();
        phone.sendKeys("1234567890");
      //  WebElement email=driver.findElement(By.xpath("//input[@id='billing_email']"));
        email.click();
        email.sendKeys("abcqqaw1qwe1dassx1f@gmail.com");
      //  WebElement create_pass=driver.findElement(By.xpath("//input[@id='createaccount']"));
        create_pass.click();

        //WebElement password=driver.findElement(By.xpath("//input[@id='account_password']"));
        password.click();
        password.sendKeys("Asd1234567890@Ashsacytasyx");
        /*WebElement payment=((ChromeDriver) driver).findElementByXPath("//input[@id='payment_method_cod']");
        ((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", payment);
        *///WebElement submit=driver.findElement(By.xpath("//button[@class='button alt']"));
        submit.submit();
    }

}
