package com.nopcommerce.demo.testbase;


import gov.uk.check.visa.propertyreader.PropertyReader;
import gov.uk.check.visa.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


/**
 * Created by Jay Vaghani
 */
public class BaseTest extends Utility {


    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        selectBrowser(browser);
        notification();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        closeBrowser();
    }

    public void notification(){
        disableNotification();
    }
}
