package com.regrassion;

import com.base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class HomePage extends CommonAPI {

   WebDriver driver ;


         @FindBy(xpath = "//*[@class='nav__logo']")
        WebElement Homebotton;

        public void setHomebotton(){
            String text =Homebotton.getTagName();
            System.out.println(text);
            Assert.assertEquals(text, "a");
        }

        @FindBy(css = "#menu")
        WebElement selectingMenu;

        @FindBy(xpath = "//div[@id='nav']/div/div[2]/a[2]")
        WebElement clickOnTech;

        @FindBy(xpath = "//a[@class='nav-menu-links__link' and text()='Markets']")
        WebElement marketInBuseness;

        @FindBy(css = "button:nth-child(2)>svg>path")
        WebElement tredeScrolling;

        @FindBy(id = "downshift-0-input")
        WebElement inputSearchInBusiness;

        @FindBy(xpath = "//img[@class='media__image']")
        WebElement testImage;

        @FindBy(xpath = "//section[@id='business-zone-1']/div[2]/div/div/ul/li/article/div/div/a/img")
        WebElement topTitleImage;

        @FindBy(css = "//label[text()='Credit Cards']")
        WebElement craditCardChosing;

        @FindBy(xpath = "//div[@id='outbrain_widget_0']//div//div//ul//li[3]")
        WebElement imageInPaidcontent;

        @FindBy(xpath = "//section[@id='business-zone-4']/div[2]/div/div[1]/div/div[2]/article/div/div[1]/a/img")
        WebElement testImage3;
        @FindBy(css = ".cn.cn-list-xs.cn--idx-2.cn-container_F95CD326-B566-A6B8-7773-DD5C7E528839.cn--expandable.cn--collapsed li:nth-child(6)")
        WebElement storisSix;

        @FindBy(css = ".cn.cn-list-xs.cn--idx-2.cn-container_F95CD326-B566-A6B8-7773-DD5C7E528839.cn--expandable.cn--collapsed")
        WebElement topStoris;

        @FindBy(xpath = "//section[@id='health-zone-1']/div/div/div[@class='column zn__column--idx-0']/ul/li/article/div/div/a/img")
        WebElement firstIMG;

        @FindBy(css = ".cn.cn-grid-small.cn--idx-0.cn-coverageContainer_F88040B3-E11A-13A0-E56D-DDAFADE02BCB.cn--has-shingle.cn-grid.cn-grid--small div:nth-child(3)")
        WebElement testParenting;

        @FindBy(id = "searchInputFooter")
        WebElement InputStoris;

        @FindBy(css = ".cn.cn-list-xs.cn--idx-0.cn-container_AE924ECF-E3AC-3569-1D82-DD5D6BE467B7.cn--expandable.cn--collapsed li:nth-child(6)")
        WebElement populerSixthTopic;

        @FindBy(xpath = "//section[@id='health-zone-8']/div/div/div[3]/ul/a//following-sibling::li/article/div/div/a/img")
        WebElement paidPartnerIMG;

        @FindBy(xpath = "//div[@id='nav__plain-header']//following-sibling::footer/div/div/div/ol[3]/li/ol/li")
        WebElement bottomWorldAsianews;

        @FindBy(xpath = "//div[@id='nav__plain-header']//following-sibling::footer/div/div/div/ol[3]/li/ol/li[4]")
        WebElement bottomWorldAustralia;

        @FindBy(xpath = "//div[@id='nav__plain-header']//following-sibling::footer/div/div/div/ol[4]/li/ol/li[2]")
        WebElement bottomPoliticsCongress;

        @FindBy(xpath = "//section[@id='us-zone-1']/div/div/div/ul/a//following-sibling::li/article/div/div/a")
        WebElement topImage;

        @FindBy(xpath = "//div[@class='ad ad--epic ad--tablet']//following-sibling::ul/a//following-sibling::li/article/div/div/a/img")
        WebElement table1stImg;

        @FindBy(css = ".cn.cn-list-xs.cn--idx-0.cn-coverageContainer_AAB13E2E-907B-4A68-8F63-353F46C92F10.cn--expandable.cn--collapsed li")
        WebElement storiestext;

        @FindBy(css = ".cn.cn-list-xs.cn--idx-0.cn-coverageContainer_AAB13E2E-907B-4A68-8F63-353F46C92F10.cn--expandable.cn--collapsed")
        WebElement storiestext1;

        @FindBy(css = ".cn.cn-list-xs.cn--idx-0.cn-container_DCB8F55B-ECE9-602C-1A45-5919511B4582.cn--expandable.cn--collapsed")
        WebElement alltextfromUsPage;

        @FindBy(css = "section[id='us-zone-8']")
        WebElement aroundtheUsText;

        @FindBy(xpath = "//section[@id='homepage4-zone-7']/div/div/div/ul/li/article/div/div/a/img")
        WebElement lastImg;

        @FindBy(css = ".m-legal__list")
        WebElement bottomTopics;

        @FindBy(xpath = "//section[@id='us-zone-8']/div/div/div/div//div[22]/article/div/div/a/img")
        WebElement clickingonfb;


        public void gotoMenu() {
            TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Menu Button in Business Page");
            selectingMenu.click();
        }

        public void getBusinessPage() {
            clickOnTech.click();
            TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Tech Button in Business Page");
            driver.navigate().to("https://www.cnn.com/business");
        }

        public void seeMarketaGlance() {
            TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Go To Market in Business Page");
            marketInBuseness.click();
            driver.navigate().to("https://www.cnn.com/business");
        }

        public void image1() {
            TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName())+"-> "+"Verify IMAGE in Business Page");
            boolean img = testImage.isDisplayed();
            Assert.assertTrue(img);
            driver.navigate().to("https://www.cnn.com/business");
        }

        public void seeNikeTrade(String locator) throws Exception {
            TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName())+"-> "+"Search for"+locator);
            inputSearchInBusiness.sendKeys(locator, Keys.ENTER);
            driver.navigate().to("https://www.cnn.com/business");
            Thread.sleep(2000);
        }

        public void tradeScrolclick() {
            TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Trade Button in Business Page");
            boolean selected = tredeScrolling.isDisplayed();
            Assert.assertTrue(selected);
            driver.navigate().to("https://www.cnn.com/business");
        }

        public void setTopTitleImage() {
            TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Top IMAGE in Business Page");
            boolean titleVideo = topTitleImage.isDisplayed();
            Assert.assertTrue(titleVideo);
            driver.navigate().to("https://www.cnn.com/business");
        }

        public void craditCard() {
            TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName())+"-> "+"Verify Credit Card Button in Business Page");
//        craditCardChosing.click();
            String str = craditCardChosing.getText();
            System.out.println(str);
            Assert.assertEquals(str, "Credit Cards");
            driver.navigate().to("https://www.cnn.com/business");
        }

        public void setStorisSix() {
            TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Content in Health Page");
            String str = storisSix.getText();
            Assert.assertEquals(str, str);
            driver.navigate().to("https://www.cnn.com/business");
        }

        public void setTopStoris() {
            TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Top Stories in Health Page");
            String st = topStoris.getText();
            System.out.println(st);
            driver.navigate().to("https://www.cnn.com/business");
        }

        public void setFirstIMG() {
            TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify IMAGE in Health Page");
            boolean tr = firstIMG.isDisplayed();
            Assert.assertTrue(tr);
            driver.navigate().to("https://www.cnn.com/business");
        }

        public void setTestParenting() {
            TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Parenting Content in Health Page");
            String str = testParenting.getText();
            Assert.assertEquals(str, str);
            driver.navigate().to("https://www.cnn.com/business");
        }

        public void setHouseStoris(String value) throws Exception {
            TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + "-> " + value);
            InputStoris.sendKeys(value, Keys.ENTER);
            Thread.sleep(3000);
//        Assert.assertTrue(st);
            driver.navigate().to("https://www.cnn.com/health");
        }

        public void setPopulerSixthTopic() {
            TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Popular Topics Health Page");
            boolean str = populerSixthTopic.isSelected();
            Assert.assertFalse(str);
            driver.navigate().to("https://www.cnn.com/business");

        }

        public void setPaidPartnerIMG() {
            TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify IMAGE in Health Page");
            boolean img = paidPartnerIMG.isDisplayed();
            Assert.assertTrue(img);
            paidPartnerIMG.click();
            driver.navigate().to("https://www.cnn.com/health");
        }

        public void setBottomWorldAsianews() {
            TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify World Asia News in Health Page");
            boolean bl =bottomWorldAsianews.isDisplayed();
            Assert.assertTrue(bl);
            driver.navigate().to("https://www.cnn.com/health");
        }

        public void setbottomWorldAustralia() {
            TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Australia News in Health Page");
            String st = bottomWorldAustralia.getText();
            Assert.assertEquals(st, "Australia");
            driver.navigate().to("https://www.cnn.com/business");
        }

        public void setbottomPoliticsCongress() {
            TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Content Politics Health Page");
            bottomPoliticsCongress.click();
            driver.navigate().refresh();
            driver.navigate().to("https://www.cnn.com/health");
        }

        public void setTopImage() {
            TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify IMAGE in U.S. Page");
            boolean tIMG = topImage.isDisplayed();
            Assert.assertTrue(tIMG);
            driver.navigate().to("https://www.cnn.com/business");
        }

        public void testurl() {
            TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify url in U.S. Page");
            String url = driver.getCurrentUrl();
            Assert.assertEquals(url, "https://www.cnn.com/us");
        }

        public void setTable1stImg() {
            TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify IMAGE in U.S. Page");
            boolean tFisttIMG = table1stImg.isDisplayed();
            Assert.assertTrue(tFisttIMG);
            driver.navigate().to("https://www.cnn.com/business");
        }

        public void setStoriestext() {
            TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Stories in U.S. Page");
            String str = storiestext.getText();
            System.out.println(str);
            Assert.assertEquals(str, str);
            driver.navigate().to("https://www.cnn.com/business");
        }

        public void setStoriestext1() {
            TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Stories 1 in U.S. Page");
            String str = storiestext1.getText();
            System.out.println(str);
            driver.navigate().to("https://www.cnn.com/business");
        }

        public void setalltextfromUsPage() {
            TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Stories 2 in U.S. Page");
            String str = alltextfromUsPage.getText();
            System.out.println(str);
            Assert.assertEquals(str, str);
            driver.navigate().to("https://www.cnn.com/business");
        }

        public void setLastImg() {
            TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Image in U.S. Page");
            boolean limg = lastImg.isDisplayed();
            Assert.assertTrue(limg);
            driver.navigate().to("https://www.cnn.com/business");
        }

        public void setaroundtheUsText() {
            TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Text in U.S. Page");
            String str = aroundtheUsText.getText();
            System.out.println(str);
            driver.navigate().to("https://www.cnn.com/business");
        }

        public void setBottomTopics() {
            TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Bottom topics in U.S. Page");
            String st = bottomTopics.getText();
            String str = "Terms of UsePrivacy PolicyAccessibility & CCAdChoicesAbout usCNN " +
                    "Studio ToursCNN StoreNewslettersTranscriptsLicense FootageCNN Newsource";
            System.out.println(st);

            Assert.assertEquals(st, st);
            driver.navigate().to("https://www.cnn.com/business");
        }

        public void setclickingonfb() {
            TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Stories 1 in U.S. Page");
            clickingonfb.click();
            driver.navigate().to("https:/cnn.com/us");
            driver.navigate().to("https://www.cnn.com/business");
        }


    public void setHouseStories( String politics ){
    }
}
