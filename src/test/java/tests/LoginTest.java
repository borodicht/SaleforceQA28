package tests;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class LoginTest extends BaseTest {

    @Test
    public void test() {
        loginPageFactory.open();
        loginPageFactory.login("khljkgh", "kjgkjg");
    }
}
