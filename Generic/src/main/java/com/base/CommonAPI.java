package com.base;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.TestNG;
import org.testng.TestRunner;
import org.testng.annotations.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.cssSelector;

public class CommonAPI {

    private static Object
            File;
    private static By.ByClassName driver;
    private Object extent;



    public static WebDriver getLocalDriver( String browser ,String platform ){
        if (platform.equalsIgnoreCase ( "mac" ) && browser.equalsIgnoreCase ( "chrome" )) {
            System.setProperty ( "webdriver.chrome.driver" ,"/Users/mohdfaruque/Desktop/WebAutomationFinal/Generic/src/driver/chromedriver" );
        } else if (platform.equalsIgnoreCase ( "windows" ) && browser.equalsIgnoreCase ( "chrome" )) {
            System.setProperty ( "webdriver.chrome.driver" ,"/Users/mohdfaruque/Desktop/WebAutomationFinal/Generic/src/driver/chromedriver.exe" );
        }
        WebDriver driver = new ChromeDriver ( );
        driver.manage ( ).timeouts ( ).implicitlyWait ( 2000 ,TimeUnit.SECONDS );
        driver.manage ( ).timeouts ( ).pageLoadTimeout ( 2000 ,TimeUnit.SECONDS );
        driver.manage ( ).window ( ).maximize ( );
        driver.quit ( );
        return driver;
    }


    public static String convertToString( String st ){
        String splitString = "";
        //splitString = StringUtils.join(StringUtils.splitByCharacterTypeCamelCase(st), ' ');
        return splitString;
    }


    //Used
    public static List<WebElement> getListOfWebElementsByCss( String locator ){
        List<WebElement> list = new ArrayList<WebElement> ( );
        list = driver.findElements ( (SearchContext) cssSelector ( locator ) );
        return list;
    }

    //Used
    public static List<WebElement> getListOfWebElementsByCss( String locator ,WebDriver driver1 ){
        List<WebElement> list = new ArrayList<WebElement> ( );
        list = driver1.findElements ( cssSelector ( locator ) );
        return list;
    }

    //Handling New Tabs

    public static WebDriver handleNewTab( WebDriver driver ){
        String oldTab = driver.getWindowHandle ( );
        List<String> newTabs = new ArrayList<String> ( driver.getWindowHandles ( ) );

        newTabs.remove ( oldTab );
        driver.switchTo ( ).window ( newTabs.get ( 0 ) );
        return driver;
    }

    //used
    public static boolean isPopUpWindowDisplayed( WebDriver driver1 ,String locator ){
        boolean value = driver1.findElement ( cssSelector ( locator ) ).isDisplayed ( );
        return value;
    }


    public static void typeOnElementNEnter( String locator ,String value ){
        try {
            driver.findElement ( (SearchContext) cssSelector ( locator ) ).sendKeys ( value ,Keys.ENTER );
        } catch (Exception ex1) {
            try {
                System.out.println ( "First Attempt was not successful" );
                driver.findElement ( (SearchContext) By.name ( locator ) ).sendKeys ( value ,Keys.ENTER );
            } catch (Exception ex2) {
                try {
                    System.out.println ( "Second Attempt was not successful" );
                    driver.findElement ( (SearchContext) By.xpath ( locator ) ).sendKeys ( value ,Keys.ENTER );
                } catch (Exception ex3) {
                    System.out.println ( "Third Attempt was not successful" );
                    driver.findElement ( (SearchContext) By.id ( locator ) ).sendKeys ( value ,Keys.ENTER );
                }
            }
        }
    }

    //used
    public static void typeOnElementNEnter( String locator ,String value ,WebDriver driver1 ){
        try {
            driver1.findElement ( cssSelector ( locator ) ).sendKeys ( value ,Keys.ENTER );
        } catch (Exception ex1) {
            try {
                System.out.println ( "First Attempt was not successful" );
                driver1.findElement ( By.id ( locator ) ).sendKeys ( value ,Keys.ENTER );
            } catch (Exception ex2) {
                try {
                    System.out.println ( "Second Attempt was not successful" );
                    driver1.findElement ( By.name ( locator ) ).sendKeys ( value ,Keys.ENTER );
                } catch (Exception ex3) {
                    System.out.println ( "Third Attempt was not successful" );
                    driver1.findElement ( By.xpath ( locator ) ).sendKeys ( value ,Keys.ENTER );
                }
            }
        }
    }


    @BeforeSuite
    public void extentSetup( ITestContext context ){
        TestRunner ExtentManager = null;
        extent = ExtentManager.getClass ( );
    }

    private class TestRunner {
    }
}
