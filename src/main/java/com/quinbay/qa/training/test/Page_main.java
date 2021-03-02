package com.quinbay.qa.training.test;

import java.io.IOException;
import java.security.Key;
import java.util.*;
import java.util.concurrent.TimeUnit;

import com.quinbay.qa.training.Actions.HomePageActions;
import com.quinbay.qa.training.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

public class Page_main {

    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver","src/main/resources/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://www.edgewordstraining.co.uk/demo-site/");
        HomePageActions obj=new HomePageActions(driver);
       // WebDriver driver=obj.instance_drive();
        obj.dismiss();
        obj.searchBox();
       /* List<WebDriver> li=obj.elementListed(driver);
        if(li.isEmpty())
            System.out.println("Not Found");
        else
            System.out.println("Element Found");*/
        obj.addtocart();
        obj.viewcart();
        obj.proceedtopay();
        obj.filldetails();

    }

}
