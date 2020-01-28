package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AchsPage extends BasePage{
    private By homeACHSLocator = By.xpath("//*[@id=\"reserva-d\"]");
    private String reservaHora  = "RESERVA TU HORA";
    private By btnReservaHora = By.xpath("/html/body/form/div[4]/div[3]/div/div/a/strong");
    private By btnAgendarHora = By.xpath("//*[@id=\"root\"]/div/main/div/div[4]/div[1]/a");


    public AchsPage(WebDriver driver){
        super(driver);
    }

    public boolean isTitleAchsDisplayed() throws Exception {
        return this.isDisplayed(homeACHSLocator) && this.getText(homeACHSLocator).equals(reservaHora);
    }
    public void clickBtnReserva() throws Exception {
        this.click(btnReservaHora);
    }
    public void clickBtnAgenda() throws Exception {
        this.click(btnAgendarHora);
    }

    ////// estaras////
    public void waitResaraHora() throws Exception {
        WebDriverWait ewait = new WebDriverWait(driver, 20);
        ewait.until(ExpectedConditions.elementToBeClickable(btnReservaHora));
    }

    public void waitAgendaHora() throws Exception {
        WebDriverWait ewait = new WebDriverWait(driver, 60);
        ewait.until(ExpectedConditions.elementToBeClickable(btnAgendarHora));
    }


}
