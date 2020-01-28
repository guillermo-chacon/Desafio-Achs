package pom;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

public class IngresaPage extends BasePage{

    private By rutLocator = By.id("rut");
    private String rut  = "17532187-k";

    private By previsionBtn = By.className("rbt-input-hint-container");
    private By fonasaLocator = By.id("rbt-menu-item-8");

    private By btnSiguienteLocator = By.xpath("//*[@id=\"login\"]/div/form/div[4]/button");
    private By btnSelectLocator = By.xpath("//div/h1[text() = 'Comienza tu agendamiento completando los siguientes campos']");

    private By especilidadlBtn = By.xpath("/html/body/div/div/main/div[4]/div[3]/div/form/div[3]/div/div/div[1]/input[1]");
    private By btnEspecialidadSelector = By.id("rbt-menu-item-11");

    private By btnSiguiente2Locator = By.xpath("//*[@id=\"login\"]/div/form/div[5]/button");

    private By imagenValidar = By.xpath("/html/body/div/div/main/div[2]/img");

    private By validateMedicinaGral = By.xpath("/html/body/div/div/main/div[4]/div[2]/div/div");

    private By validateAgendaDisponible = By.xpath("/html/body/div/div/main/div[4]/div[2]/div/h1");



    public IngresaPage(WebDriver driver){

        super(driver);
    }
    public void clickRut() throws Exception {
        this.click(rutLocator);
    }
    public void sendRut(String s) throws Exception {
        this.send(rutLocator);
    }
    public void selectListBtn() throws Exception {
        this.click(previsionBtn);
    }
    public void selectReacFonasa() throws Exception {
        this.click(fonasaLocator);
    }
    public void btnSiguiente2() throws Exception {
        this.click(btnSiguiente2Locator);
    }
    public void btnSiguiente() throws Exception {
        this.click(btnSiguienteLocator);
    }

    public void selectEspecialidadBtn() throws Exception {

        WebDriverWait ewait = new WebDriverWait(driver, 60);

        Assert.assertTrue("validando", ewait.until(ExpectedConditions.textToBePresentInElement(validateAgendaDisponible,"Busca una agenda disponible por:")));

        this.click(especilidadlBtn);

    }
    public void selectReacMedicinaGeneral() throws Exception {

        WebDriverWait ewait = new WebDriverWait(driver, 160);
        ewait.until(ExpectedConditions.visibilityOfElementLocated(btnEspecialidadSelector));
        this.click(btnEspecialidadSelector);
    }

    public void capturaPantalla() throws Exception {
        //Take Screesnshot
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            //Save Screenshot in destination file
            FileUtils.copyFile(src, new File("C://Capturas/screenshot.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    ////////////////////// esperas


    public void wairut() throws Exception {
        WebDriverWait ewait = new WebDriverWait(driver, 50);
        ewait.until(ExpectedConditions.elementToBeClickable(rutLocator));
    }

    public void waitPrevision() throws Exception {
        WebDriverWait ewait = new WebDriverWait(driver, 50);
        ewait.until(ExpectedConditions.elementToBeClickable(previsionBtn));
    }

    public void waitFonasa() throws Exception {
        WebDriverWait ewait = new WebDriverWait(driver, 20);
        ewait.until(ExpectedConditions.elementToBeClickable(fonasaLocator));
    }

    public void waitEspecialidad() throws Exception {
        WebDriverWait ewait = new WebDriverWait(driver, 160);
        ewait.until(ExpectedConditions.elementToBeClickable(imagenValidar));
        ewait.until(ExpectedConditions.visibilityOfElementLocated(especilidadlBtn));
        ewait.until(ExpectedConditions.elementToBeClickable(especilidadlBtn));
        ewait.until(ExpectedConditions.visibilityOfElementLocated(imagenValidar));

       // ewait.until(ExpectedConditions.visibilityOfElementLocated(btnEspecialidadSelector));
    }

    public void validateMedicinaGral(){
        WebDriverWait ewait = new WebDriverWait(driver, 60);

        Assert.assertTrue("validando", ewait.until(ExpectedConditions.textToBePresentInElement(validateMedicinaGral,"Medicina General")));
    }

/*    public String selectFonsa() throws Exception {
        Select selectList = new Select(this.findElement(previsionList));
        selectList.selectByVisibleText("FONASA");
        return getText((By) selectList.getFirstSelectedOption());
        //*[text() = 'qwerty']
imagenValidar
    }*/


}
