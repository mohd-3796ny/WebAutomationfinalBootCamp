package com.regressionSuite;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignInPageTest extends CommonAPI {



    public AmazonSignin sign;

    public SignInPageTest(){
        sign = PageFactory.initElements(driver, AmazonSignin.class);
    }

    //before all the methods, the object is being initialized and given value
    @BeforeMethod
    public void intializationSignInPage() {
    }

    //go to signIn page from the homepage
    @Test(enabled = false)
    public void gotoSigninPageTest()
    {
        sign.gotosignInPage();
    }
    //check forget account link and see if it goes to the right page.
    @Test (enabled = false)
    public void checkForgetPasswordTest()
    {
        sign.gotosignInPage();
        sign.checkForgetPassword();
        System.out.println("test passed");
    }
    //check condition link and see if it goes to the right page.
    @Test(enabled =false)
    public void checkConditionLinkTest()
    {
        sign.gotosignInPage();
        sign.checkConditionLink();
    }
    //check privacy link and see if it goes to the right page
    @Test (enabled = false)
    public void checkPrivacyNoticeTest()
    {
        sign.gotosignInPage();
        String title = sign.checkPrivacyNotice();
        Assert.assertEquals(title,"Amazon.com Help: Amazon.com Privacy Notice");
    }
    //checks if the checkbox is marked or not.
    @Test (enabled = false)
    public void checkboxsignIn()
    {
        sign.gotosignInPage();
        sign.checkboxsignIn();
        Assert.assertEquals(sign.checkboxsignIn(),true);
    }
    //check SignIn with invalid user and password


    @Test (enabled = false)
    public void signInTestInvalid()
    {
        sign.gotosignInPage();
        sign.signInIinvalid("faruque","amin");
    }

    private void invalid( String sohan ,String rifat ){

    }

    //check SignIn with valid user and password
    @Test (enabled = false)
    public void signInTestValid()
    {
        sign.gotosignInPage();
        sign.signInValid("kamal","shawkat");
    }
    //check if the create amazon acct works and goes to the crete acct page.
    @Test (enabled = false)
    public void AmazonCreateAccountTest()
    {

        sign.gotosignInPage();
        String title =sign.AmazonCreateAccount();
        Assert.assertEquals(title,"Amazon Registration");
    }

    private class AmazonSignin {
        public Object signInI;

        public void gotosignInPage(){
        }

        public String checkPrivacyNotice(){
            return null;
        }

        public boolean checkboxsignIn(){
            return false;
        }

        public void signInValid( String kamal ,String shawkat ){

        }

        public String AmazonCreateAccount(){
            return null;
        }

        public void signInIinvalid( String faruque ,String amin ){

        }

        public void checkForgetPassword(){
        }

        public void checkConditionLink(){

        }
    }
}






