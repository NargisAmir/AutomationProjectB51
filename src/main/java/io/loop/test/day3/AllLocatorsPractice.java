package io.loop.test.day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLocatorsPractice {

    public static void main(String[] args) {

        // create driver object
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // navigate to loopcamp practice page
        // https://loopcamp.vercel.app

        driver.get("https://loopcamp.vercel.app/registration_form.html");

    }

}
