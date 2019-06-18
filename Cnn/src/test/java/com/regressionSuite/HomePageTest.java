package com.regressionSuite;

import com.base.CommonAPI;
import com.regrassion.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.concurrent.TimeUnit;

public class HomePageTest extends CommonAPI {

    WebDriver driver;
    HomePage hpage;
    String hpgurl="https://www.cnn.com/";


    @BeforeClass
    public void initialize(){
        driver.get(hpgurl);
        hpage= PageFactory.initElements(driver,HomePage.class);

    }
    @AfterClass
    public void init(){
        driver.get(hpgurl);
    }
    @Test
    public void homebuttontest(){
        TestLogger.log(getClass().getSimpleName()+ " "+ convertToString(new Object(){
        }.getClass().getEnclosingMethod().getName())+" "+ "Veryfy Home Button");
        hpage.setHomebotton();
    }
    @Test
    public void menubtn() throws Exception{
        hpage.gotoMenu();
        driver.navigate().to(hpgurl);
    }

    @Test
    public void pageTech()throws Exception{
        hpage.getBusinessPage();
    }

    @Test
    public void glaceAtMarket() throws Exception{
        hpage.seeMarketaGlance();
    }
    @Test
    public void imageTesting1()throws Exception{
        hpage.image1();
    }

    @Test
    public void nikeTraging() throws Exception {
        hpage.seeNikeTrade("Nike");
        driver.navigate().to(hpgurl);
    }

    @Test
    public void tradeScrolTest()throws Exception{
        hpage.tradeScrolclick();
    }
    @Test
    public void testTopTitleImage()throws Exception{
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        hpage.setTopTitleImage();
    }

    @Test
    public void testCraditCard()throws Exception{
        hpage.craditCard();
    }

    /* @Test
     public void testPaidContent()throws Exception{
         hmpage.paidContentImage();
     }
 */
    @Test
    public void testSetStorisSix(){
        hpage.setStorisSix();
    }
    @Test
    public void testSetTopStoris(){
        hpage.setTopStoris();
    }
    @Test
    public void testSetFirstIMG(){
        hpage.setFirstIMG();
    }
    @Test
    public void testParenting(){
        hpage.setTestParenting();
    }
    @Test
    public void testSetHouseStoris()throws Exception{
        hpage.setHouseStories("Politics");
    }
    @Test
    public void testSetPaidPartnerIMG(){
        hpage.setPaidPartnerIMG();
    }
    @Test
    public void testSetBottomWorldAsianews(){
        hpage.setBottomWorldAsianews();
    }
    @Test
    public void testSetbottomWorldAustralia(){
        hpage.setbottomWorldAustralia();
    }
    @Test
    public void testSetBottomPoliticsCongress(){
        hpage.setbottomPoliticsCongress();
    }
    @Test
    public void testSetPopulerSixthTopic(){
        hpage.setPopulerSixthTopic();
    }
    @Test
    public void testsetImage(){
        hpage.setTopImage();
    }
    @Test
    public void testCurrentUrl(){
        hpage.testurl();
    }
    @Test
    public void testsetTable1stImg(){
        hpage.setTable1stImg();
    }
    @Test
    public void testsetStoriestext(){
        hpage.setStoriestext();
    }
    @Test
    public void testsetStoriestext1(){
        hpage.setStoriestext1();
    }
    @Test
    public void testalltextfromUsPage(){
        hpage.setalltextfromUsPage();
    }
    @Test
    public void testsetLastImg(){
        hpage.setLastImg();
    }
    @Test
    public void testsetaroundtheUsText(){
        hpage.setaroundtheUsText();
    }
    @Test
    public void testsetBottomTopics(){
        hpage.setBottomTopics();
    }
    @Test
    public void testsetclickingonfb(){
        hpage.setclickingonfb();
    }



}





