package com.quinbay.qa.training.test;


import java.security.Key;
import java.util.*;
import com.quinbay.qa.training.Actions.HomePageActions;
import com.quinbay.qa.training.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;


import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class First_Selenium_Example {

    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","src/main/resources/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.edgewordstraining.co.uk/demo-site/");
        WebElement dismiss=driver.findElement(By.xpath("//a[@class='woocommerce-store-notice__dismiss-link']"));
        dismiss.click();
        WebElement searchBox=driver.findElement(By.id("woocommerce-product-search-field-0"));
        searchBox.click();
        searchBox.sendKeys("Tshirt");
        searchBox.sendKeys(Keys.RETURN);
        List<WebElement> elements= driver.findElements(By.xpath("//img[@src='https://www.edgewordstraining.co.uk/demo-site/wp-content/uploads/2018/03/vneck-tee.jpg']"));
        Thread.sleep(3000);
        if(elements.isEmpty())
            System.out.println("Element is empty");
        else
            System.out.println("Element is found");
        WebElement addtocart=driver.findElement(By.xpath("//a[@data-product_id=38]"));
        addtocart.click();
        WebElement viewcart=driver.findElement(By.xpath("//a[@title='View cart']"));
        viewcart.click();
        WebElement procedtopay=driver.findElement(By.xpath("//a[@class='checkout-button button alt wc-forward']"));
        procedtopay.click();
        WebElement f_name=driver.findElement(By.xpath("//input[@id='billing_first_name']"));
        f_name.click();
        f_name.sendKeys("Firstname");
        WebElement s_name=driver.findElement(By.xpath("//input[@id='billing_last_name']"));
        s_name.click();
        s_name.sendKeys("Secondname");
        WebElement cmpny_name=driver.findElement(By.xpath("//input[@id='billing_company']"));
        cmpny_name.click();
        cmpny_name.sendKeys("Quinbay technologies");
        Select drpcountry=new Select(( driver).findElement(By.xpath("//select[@class='country_to_state country_select select2-hidden-accessible']")));
        drpcountry.selectByVisibleText("India");
        WebElement add1=driver.findElement(By.xpath("//input[@id='billing_address_1']"));
        add1.click();
        add1.sendKeys("Address value is 24 th sector");
        WebElement add2=driver.findElement(By.xpath("//input[@id='billing_address_2']"));
        add2.click();
        add2.sendKeys("Address Bangalore Blore");
        WebElement state=driver.findElement(By.xpath("//input[@id='billing_city']"));
        state.click();
        state.sendKeys("Bangalore");
        //state
        Select location=new Select(( driver).findElement(By.xpath("//select[@name='billing_state']")));
        location.selectByVisibleText("Karnataka");
        WebElement zip=driver.findElement(By.xpath("//input[@id='billing_postcode']"));
        zip.click();
        zip.sendKeys("541602");
        WebElement phone=driver.findElement(By.xpath("//input[@id='billing_phone']"));
        phone.click();
        phone.sendKeys("1234567890");
        WebElement email=driver.findElement(By.xpath("//input[@id='billing_email']"));
        email.click();
        email.sendKeys("abcaw1easasdassx1f@gmail.com");
        WebElement create_pass=driver.findElement(By.xpath("//input[@id='createaccount']"));
        create_pass.click();
        WebElement password=driver.findElement(By.xpath("//input[@id='account_password']"));
        password.click();
        WebElement payment=((ChromeDriver) driver).findElementByXPath("//input[@id='payment_method_cod']");
        ((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", payment);
        password.sendKeys("Asd1234567890@Ashsacytasyx");
        WebElement submit=driver.findElement(By.xpath("//button[@class='button alt']"));
        submit.submit();
        Thread.sleep(30000);
        driver.close();

    }
}
