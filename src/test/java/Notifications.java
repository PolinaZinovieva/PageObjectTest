import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

public class Notifications {
    public void shouldHaveText(){
        Selenide.$(".header_signin").shouldHave( Condition.text("Sign In"));

    }
}
