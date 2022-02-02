import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class HomePage extends BasePage  {
    SelenideElement signinBTn=Selenide.$(".header_signin");
    SelenideElement signinEmail=Selenide.$("#signinEmail");
    SelenideElement signinPassword=Selenide.$("#signinPassword");
    SelenideElement Loginin=Selenide.$x("//*[text()='Login']");
    public HomePage preregister (){
        Selenide.open("https://qauto.forstudy.space/","","guest","welcome2qauto");
        return null;
    }



    public Garagepage login(String email,String password){
        signinBTn.click();
        signinEmail.sendKeys(email);
        signinPassword.sendKeys(password);
        Loginin.click();
        return new Garagepage();


    }

}
