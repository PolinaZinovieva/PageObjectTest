import com.codeborne.selenide.Selenide;

public class HeaderUp extends BasePage{



    public HeaderUp logout () {
        Selenide.$("#userNavDropdown").click();
        Selenide.$x("//*[text()='Logout']").click();
        return null;

    }
}
