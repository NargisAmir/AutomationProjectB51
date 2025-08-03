package io.loop.test.day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {

        //setting up the driver
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--start-maximized");
//        options.addArguments("--incognito"); // Start in incognito mode
        WebDriver driver = new ChromeDriver();

        //maximize the window
       // driver.manage().window().maximize();

        driver.get("https://www.loopcamp.io");
        Thread.sleep(3000);

        driver.navigate().to("https://www.google.com");

        //navigate back to page
        driver.navigate().back();

        //navigate forward
        driver.navigate().forward();

        //refresh
        driver.navigate().refresh();


    }
}
