package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GooglePage extends BasePage{
    private String titleGooglePage = "Google";
    private By buscarGoogleLocator = By.name("q");
    //private By achsLocator = By.cssSelector("a[href='https://www.hospitaldeltrabajador.cl/']");
    private By achsLocator = By.xpath("//*[@id=\"rso\"]/div[3]/div/div/div/div[1]/a");
    private String achsSearch = "ACHS";


    public GooglePage(WebDriver driver){

        super(driver);
    }

    public boolean googlePageIsDisplayed(By xpath) throws Exception {
        return this.getTitle().equals(titleGooglePage);
    }
    public void clickSearchGoogle() throws Exception {
        this.click(buscarGoogleLocator);
    }
    public void cleanSearchGoogle() throws Exception {
        this.clear(buscarGoogleLocator);
    }
/*    public String sendKeySearchGoogle() throws Exception {
        return this.sendKeys("hola");
    }*/
    public void clickAchsPage() throws Exception {
        this.click(achsLocator);
    }
    public void submitSearchGoogle() throws Exception {
        this.send(buscarGoogleLocator);
    }





    public void waitAchsLocator() throws Exception {
        WebDriverWait ewait = new WebDriverWait(driver, 20);
        ewait.until(ExpectedConditions.elementToBeClickable(achsLocator));
    }
}
