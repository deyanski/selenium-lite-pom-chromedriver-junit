package demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GoogleTitleTest extends BaseTest {

    @Test
    void titleShouldContainGoogle() {
        driver.get("https://www.google.com/");
        String title = driver.getTitle();
        Assertions.assertTrue(title.toLowerCase().contains("google"),
                "Expected title to contain 'google' but was: " + title);
    }
}
