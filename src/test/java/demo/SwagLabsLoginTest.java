package demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class SwagLabsLoginTest extends BaseTest {

    @Test
    void canLoginWithStandardUser() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        boolean onInventory = driver.getCurrentUrl().contains("inventory.html");
        Assertions.assertTrue(onInventory, "Expected to be on inventory page. URL: " + driver.getCurrentUrl());
    }
}
