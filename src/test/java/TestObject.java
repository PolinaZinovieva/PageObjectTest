import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.Test;

public class TestObject {
HomePage homePage= new HomePage();
HeaderUp headerUp= new HeaderUp();
    @Test
    public void canLogout(){
        //Arrange
        homePage.preregister();
        Garagepage garagePage= homePage.login("Zinovievapolinastanislavovna@gmail.com", "Larryisreal69");
        //act
        headerUp.logout();
        //assert
        homePage.notifications.shouldHaveText();
        //Arrange again
        Garagepage garagepage= homePage.login("Zinovievapolinastanislavovna@gmail.com", "Larryisreal69");
        //act
        garagepage.logout2();
        //assert
        homePage.notifications.shouldHaveText();



    }

}
