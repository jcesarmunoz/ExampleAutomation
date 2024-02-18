package starter.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target INPUT_EMAIL =
            Target.the("input email in Login").located(By.id("loginusername"));

    public static final Target INPUT_PASSWORD =
            Target.the("input password in Login").located(By.id("loginpassword"));

    public static final Target BTN_LOGIN =
            Target.the("button to login").located(By.xpath("//div[@class='modal-footer']//button[text()='Log in']"));

    public static final Target TEXT_EMAIL =
            Target.the("email user text").locatedBy("//a[@id='nameofuser' and contains(text(),'{0}')]");

    public static final Target BTN_LOGOUT =
            Target.the("button to logout").located(By.id("logout2"));
}
