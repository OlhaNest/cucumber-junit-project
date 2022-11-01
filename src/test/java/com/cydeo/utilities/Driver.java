package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    //creating a private constructor, so we are closing access to the object of this class from outside of any classes
    private Driver(){}

    //Making our 'driver' instance private, so that is not reachable from outside of any classes, because we want it to run before anything else, --- also we will use it in static method

    private static InheritableThreadLocal<WebDriver> driverPool = new InheritableThreadLocal<>();

    public static WebDriver getDriver(){


        if(driverPool.get()==null){ //if driver/browser has never been opened

            String browserType = ConfigurationReader.getProperty("browser");

            /*
            Depending on the browserType our switch statement will determine to open specific type of browser/driver
             */

            switch(browserType){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driverPool.set(new ChromeDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driverPool.set(new FirefoxDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
            }
        }
        //Same driver instance will be returned every time we call Driver.getDriver() method
        return driverPool.get();
    }

    public static void closeDriver() {
        if (driverPool.get()!= null) {
            driverPool.get().quit(); // this line will kill the session. Value will may be null
            driverPool.remove(); // it's already null
        }
    }

}
