package co.uk.safebear.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {
    private static final String URL = System.getProperty("url", "http://toolslist.safebear.co.uk:8080");
    private static final String BROWSER  = System.getProperty("browser", "chrome");
}


public static String getUrl(){
    return URL;
}

public static WebDriver getDriver(){
    ChromeOptions chromeOptions;

    switch (BROWSER.toUpperCase()) {
        case "CHROME":

            //tell the user which browser we are running our tests on
            System.out.println("Executing on CHROME");

            // Use 'WebDriverManager' to setup our chromedriver
            WebDriverManager.chromedriver().setup();

            // Return our driver
            return new ChromeDriver();

        default:
            throw new IllegalArgumentException("The browser type is undefined");
    }
}

