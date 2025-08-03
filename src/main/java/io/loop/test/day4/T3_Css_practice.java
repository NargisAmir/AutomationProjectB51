package io.loop.test.day4;

import io.loop.test.utilities.DocuportConstants;
import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_Css_practice {
    public static void main(String[] args) {

        /*
    go to docuport app
    identify docuport with css
    get value of the attribute
    validate if it is "Docuport"

    the rest is home work
    locate:
    username
    password
    login
        with css
    login to docuport
    locate home icon of docuport after login or any other element after login
    validated that you logged in

     */

        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);
        driver.manage().window().maximize();
        driver.navigate().to(DocuportConstants.DOCUPORT_TEST);
        WebElement logo = driver.findElement(By.cssSelector("img[src='/img/logo.d7557277.svg"));

       String actualLogodocuport = logo.getDomAttribute("alt");
        System.out.println(actualLogodocuport);

        if (DocuportConstants.EXPECTED_LOGO_DOCUPORT.equals(actualLogodocuport)){
            System.out.println("expected logo " + DocuportConstants.EXPECTED_LOGO_DOCUPORT + "matches actual logo " + actualLogodocuport + "TEST PASS");

        }else{
            System.out.println("expected logo " + DocuportConstants.EXPECTED_LOGO_DOCUPORT + "Does not matches actual logo " + actualLogodocuport + "TEST FAIL");
        }


    }
}
