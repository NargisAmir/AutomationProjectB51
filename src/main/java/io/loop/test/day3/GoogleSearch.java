package io.loop.test.day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
    public static void main(String[] args) {

        /*
         * Navigate to Google search
         * maximize the page
         * get title of the page
         * get url of the page
         * validate the title, expected title is "Google"
         * validate the url of the page, expected url is "https://www.google.com/"
         * close the browser
         */
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        //expected Title
        String expectedTitle = "Google";

        //actual title
       String actualTitle =  driver.getTitle();

       //validation
        if(actualTitle.contains(expectedTitle)){
            System.out.println("Actual title: " + actualTitle + " matches" + expectedTitle + " Test pass");

        }else{
            System.err.println("Actual title:" + actualTitle + "does not matches" + expectedTitle + "Test fail");
        }

        String expectedURL = "https://www.google.com";

        String actualURL = driver.getCurrentUrl();

        if(actualURL.contains(expectedURL)){
            System.out.println("Actual URL: " + actualURL + " matches" + expectedURL + " Test pass");

        }else{
            System.err.println("Actual URL:" + actualURL + "does not matches" + expectedURL + "Test fail");
        }
        driver.quit();





    }
}
