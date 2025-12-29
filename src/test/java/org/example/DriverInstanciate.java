package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class DriverInstanciate {
    public static WebDriver driver;
    @BeforeTest
    public static WebDriver getDriver()
    {
        driver =new EdgeDriver();
        driver.manage().window().maximize();
        return driver;

    }
    @AfterTest
    public  void closeDriver()
    {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.close();
    }
}
