import com.thoughtworks.gauge.Step;
import org.example.DemoqaPage;
import org.junit.Assert;

public class DemoqaTest {
    DemoqaPage demoqaPage;

    public DemoqaTest(){
        demoqaPage = new DemoqaPage();
    }

    @Step("Demoqa sitesine girilir.")
    public void initalDemoqa() {
        demoqaPage.setupChrome();
        demoqaPage.gotoDomain("https://demoqa.com/");
        Assert.assertTrue("demoqa sitesi açılmadı",demoqaPage.checkUrl("demoqa.com"));
    }

    @Step("JOIN NOW linkine tıklanır.")
    public void clickJoinNow() {
        demoqaPage.clickJoinNow();
    }

    @Step("Pencere geçişi yapılır.")
    public void switchToWindow() {
        demoqaPage.switchToWindow();
        Assert.assertTrue("toolsqa sitesine geçiş yapılmadı",demoqaPage.checkUrl("toolsqa.com"));
    }

    @Step("Go To Registration butonuna tıklanır.")
    public void clickGoToRegistration() {
        demoqaPage.clickGoToRegistration();
    }

    @Step("First Name <firstName> yazılır.")
    public void setFirstName(String firstName) {
        demoqaPage.setFirstName(firstName);
    }

    @Step("Last name <lastName> yazılır.")
    public void setLastName(String lastName) {
        demoqaPage.setLastName(lastName);
    }

    @Step("Mobil <mobil> yazılır.")
    public void setMobil(String mobil) {
        demoqaPage.setMobil(mobil);
    }

    @Step("Country <country> seçilir.")
    public void selectCountry(String country) {
        demoqaPage.selectCountry(country);
    }

    @Step("City <city> yazılır.")
    public void setCity(String city) {
        demoqaPage.setCity(city);
    }

    @Step("Your Mesaage <message> yazılır.")
    public void setYourMessage(String message) {
        demoqaPage.setYourMessage(message);
    }
}
