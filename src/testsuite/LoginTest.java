package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginTest extends BaseTest {
    String baseUrl = "https://www.saucedemo.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test

    public void userSholdLoginSuccessfullyWithValid(){
        //find login link and click on login link
       // WebElement loginLink = driver.findElement(By.linkText("Log in"));
       // loginLink.click();
        // find the email field element and type email
        WebElement emailField = driver.findElement(By.id("user-name"));
        emailField.sendKeys("standard_user");

        // find the password field element and type the password
        driver.findElement(By.name("password")).sendKeys("secret_sauce");

        //Find the Login btn Element and click
        WebElement loginBtn = driver.findElement(By.id("login-button"));
        loginBtn.click();

        String expectedMessage = "Products";
        WebElement actualTestElement = driver.findElement(By.className("title"));
        String actualMessage = actualTestElement.getText();
        Assert.assertEquals(expectedMessage,actualMessage);



        driver.quit();


    }
    @Test
    public void verifyThatSixProductsAreDisplayedOnPage(){
        WebElement emailField = driver.findElement(By.id("user-name"));
        emailField.sendKeys("standard_user");

        // find the password field element and type the password
        driver.findElement(By.name("password")).sendKeys("secret_sauce");

        //Find the Login btn Element and click
        WebElement loginBtn = driver.findElement(By.id("login-button"));
        loginBtn.click();

        List<WebElement> sliderElementList = driver.findElements(By.className("inventory_item"));
        System.out.println("Total slide is : " +sliderElementList.size());


    }
}
