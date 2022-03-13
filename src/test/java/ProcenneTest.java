import com.thoughtworks.gauge.Step;
import org.example.DemoRequestPage;
import org.junit.Assert;

public class ProcenneTest {
    DemoRequestPage demoRequestPage;

    public ProcenneTest(){
        demoRequestPage = new DemoRequestPage();
    }

    @Step("Procenne sitesi <browser> tarayıcıda açılır.")
    public void initalProcenne(String browser) {
        if(browser.contains("Chrome")){
            demoRequestPage.setupChrome();
        }
        else{
            demoRequestPage.setupFireFox();
        }
        demoRequestPage.gotoDomain("https://procenne.com/");
        Assert.assertTrue("ProcenneTest açılmadı",demoRequestPage.checkUrl("procenne.com"));
    }

    @Step("DEMO Request sekmesine tıklanır.")
    public void clickDemoRequest() {
        demoRequestPage.clickDemoRequest();
        Assert.assertTrue("DEMO Request sayfası açılmadı",demoRequestPage.checkUrl("demo-request"));
    }

    @Step("Name <name>, Surname <surname> yazılır.")
    public void setNameAndSurname(String name, String surname) {
        demoRequestPage.setName(name);
        demoRequestPage.setSurname(surname);
    }

    @Step("Email <email> yazılır.")
    public void setEmail(String email) {
        demoRequestPage.setEmail(email);
    }

    @Step("Instituation <instituation> yazılır.")
    public void setInstituation(String instituation) {
        demoRequestPage.setInstituation(instituation);
    }

    @Step("Title <title> yazılır.")
    public void setTitle(String title) {
        demoRequestPage.setTitle(title);
    }

    @Step("Phone <phone> yazılır.")
    public void setPhone(String phone) {
        demoRequestPage.setPhone(phone);
    }

    @Step("Product <Product> seçilir.")
    public void setProduct(String product) {
        demoRequestPage.setProduct(product);
    }

    @Step("Message <email> yazılır.")
    public void setMessage(String message) {
        demoRequestPage.setMessage(message);
    }

    @Step("Kvkk tiklenir.")
    public void clickKvkk() {
        demoRequestPage.clickKvkk();
    }

    @Step("Sözleşme tiklenir.")
    public void clickContracts() {
        demoRequestPage.clickContracts();
    }

    @Step("Send butonuna tıklanır.")
    public void clickSend() {
        demoRequestPage.clickSend();
    }
}
