package com.regressionSuite;

import base.CommonAPI;
import com.regression.HomeActionPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class HomeActionPageTest extends CommonAPI {
    HomeActionPage obj1;

    @BeforeMethod
    public void AmazonTestObjectHomePage()
    {
        obj1 = PageFactory.initElements(driver, HomeActionPage.class);
    }

    @Test (enabled = false)
    public void searchBarInputTest() throws InterruptedException
    {
        obj1.searchBarInput("Headphones");
    }

    @Test (enabled = false)
    public void AllDropdownHomepageTest()
    {
        obj1.AllDropdownHomepage("Computers");
    }

    @Test (enabled = false)
    public void DropdownAndSearch() throws InterruptedException {
        obj1.AllDropdownHomepage("Computers");
        obj1.searchBarInput("Mac 2019");

    }
    @Test (enabled = false)
    public void TabsunderSearcbar()
    {
        obj1.TabsunderSearcbar("todays deal");
        Assert.assertEquals(obj1.TabsunderSearcbar("todays deal"),"Gold Box Deals | Today's Deals - Amazon.com");
    }
    @Test (enabled = false)
    public void GetreadyforSummerListtest()
    {
        obj1.GetreadyforSummerList("health");
    }
    @Test (enabled = false)
    public void hoveroverLanguage()
    {
        obj1.hoveroverLanguage();
    }
    @Test (enabled = false)
    public void icononHomepageTest()
    {
        obj1.icononHomepage();
    }
    @Test (enabled = false)
    public void onetabfromiconTest()
    {
        obj1.icononHomepage();
        Assert.assertEquals(obj1.onetabfromicon(),"Amazon.com: Books");
    }

    @Test (enabled = false)
    public void multipleWindowswithShiftTest()
    {
        obj1.multipleWindowswithShift();
    }
    @Test (enabled = false)
    public void multipletabsTest()
    {
        obj1.multipletabs();
    }
    @Test (enabled = false)
    public void CareerLinkTest()
    {
        obj1.CareerLink();
    }
    @Test (enabled = false)
    public void BlogTest()
    {
        obj1.Blog();
    }
    @Test (enabled = false)
    public void AboutAmazonTest()
    {
        obj1.AboutAmazon();
    }
    @Test (enabled = false)
    public void PressCenterTest()
    {
        obj1.PressCenter();
    }
    @Test (enabled = false)
    public void InvestorRelationsTest()
    {
        obj1.InvestorRelations();
    }
    @Test (enabled = false)
    public void AmazonDevicesTest()
    {
        obj1.AmazonDevices();
    }
    @Test(enabled = false)
    public void TourTest()
    {
        obj1.Tour();
    }
    @Test (enabled = false)
    public void SellonAmazonTest()
    {
        obj1.SellonAmazon();
    }
    @Test (enabled = false)
    public void SellunderBrandTest()
    {
        obj1.SellunderBrand();
    }
    @Test (enabled = false)
    public void SellHandmadeTest()
    {
        obj1.SellHandmade();
    }
    @Test (enabled = false)
    public void SellServicesTest()
    {
        obj1.SellServices();
    }
    @Test (enabled = false)
    public void SellBusinessTest()
    {
        obj1.SellBusiness();
    }
    @Test (enabled = false)
    public void SellAppsTest()
    {
        obj1.SellApps();
    }
    @Test (enabled = false)
    public void BecomeAffiliatesTest()
    {
        obj1.BecomeAffiliate();
    }
    @Test (enabled = false)
    public void AdvertiseTest()
    {
        obj1.Advertise();
    }
    @Test (enabled = false)
    public void SelfPublishedTest()
    {
        obj1.SelfPublished();
    }
    @Test (enabled = false)
    public void OpportunityTest()
    {
        obj1.Opportunity();
    }
    @Test (enabled = false)
    public void gotoLanguagePageTest()
    {
        obj1.gotoLanguagePage();
    }
    @Test (enabled = false)
    public void LanguagePopUpTest()
    {
        obj1.LanguagePopUp();
    }
    @Test (enabled = false)
    public void CountryPopUpTest()
    {
        obj1.CountryPopUp();
    }
    @Test (enabled = false)
    public void CountryDropdownTest()
    {
        obj1.CountryDropdown();
    }








}