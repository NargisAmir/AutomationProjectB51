package io.loop.test.day4;

import io.loop.test.utilities.DocuportConstants;
import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.SQLOutput;

public class T1_DocportLogin_getText {
    public static void main(String[] args) {
        /*
         * go to docuport
         * enter username
         * do NOT enter password
         * click on login button
         * verify error message - please enter password
         */

            WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);
            driver.manage().window().maximize();
            driver.get(DocuportConstants.DOCUPORT_TEST);

        WebElement username = driver.findElement(By.id("input-14"));
        username.sendKeys(DocuportConstants.USERNAME_CLIENT);
        //spy/locate/inspect login button and click

        WebElement loginButton = driver.findElement(By.className("v-btn__content"));
        loginButton.click();

        //get error message from ui
        WebElement errorMessage = driver.findElement(By.className("v-messages__message"));
      //  System.out.println("errorMessage.getText " + errorMessage.getText());
        String actualErrorMessage = errorMessage.getText();
        //validation
        if (actualErrorMessage.equals(DocuportConstants.ERROR_MESSAGE_FOR_EMPTY_PASSWORD)){
            System.out.println("Expected error message: " + DocuportConstants.ERROR_MESSAGE_FOR_EMPTY_PASSWORD + " matches actual error message: " + actualErrorMessage +" TEST PASS" );
        }else{
            System.out.println("Expected error message: " + DocuportConstants.ERROR_MESSAGE_FOR_EMPTY_PASSWORD + " Does not matches actual error message: " + actualErrorMessage +" TEST FAIL");

            driver.quit();

        }

    }
    }

