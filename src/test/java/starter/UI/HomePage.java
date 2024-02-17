package starter.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final Target BTN_SIGNUP =
            Target.the("button to sign up").located(By.id("signin2"));

    public static final Target INPUT_EMAIL =
            Target.the("input user email").located(By.id("sign-username"));

    public static final Target INPUT_PASSWORD =
            Target.the("input user password").located(By.id("sign-password"));

    public static final Target BTN_CONFIRM_SIGNUP =
            Target.the("button to make sign up").located(By.xpath("//button[normalize-space()='Sign up']"));

    public static final Target BTN_CLOSE =
            Target.the("button close modal").located(By.xpath("//div[@id='signInModal']//button[@type='button'][normalize-space()='Close']"));
    public static final Target BTN_LOGIN =
            Target.the("button to login").located(By.id("login2"));
}
