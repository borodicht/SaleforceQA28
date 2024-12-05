package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class AccountsTest extends BaseTest {

    @Test
    public void checkCreateAccount() {
        driver.get("https://tms9-dev-ed.develop.my.salesforce.com");
        driver.findElement(By.id("username")).sendKeys("tborodich@tms.sandbox");
        driver.findElement(By.id("password")).sendKeys("Password001");
        driver.findElement(By.id("Login")).click();
        driver.get("https://tms9-dev-ed.develop.lightning.force.com/lightning/o/Account/new");
        newAccountModal.createAccount("TMS", "12333", "123344", "Rokossovskogo", "Hot");
        driver.findElement(By.xpath("//*[@name='SaveEdit']")).click();
        System.out.printf(driver.findElement(By.cssSelector("[data-aura-class=forceActionsText]")).getText());
        Assert.assertEquals(
                driver.findElement(By.cssSelector("[data-aura-class=forceActionsText]")).getText(),
                "Account \"TMS\" was created.");
    }
}
