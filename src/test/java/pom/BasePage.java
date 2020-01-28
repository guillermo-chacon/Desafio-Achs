package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait driverWait;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public void click(By element) throws Exception{
        try {
            driver.findElement(element).click();
        }catch (Exception e){
            throw new Exception("No se pudo click sobre el elemento: " + element);
        }
    }
    public boolean isDisplayed(By element) throws Exception{
        try {
            return driver.findElement(element).isDisplayed();
        }catch (Exception e){
            throw new Exception("No se pudo encontrar el elemento: " + element);
        }
    }
    public String getText(By element) throws Exception{
        try {
            return driver.findElement(element).getText();
        }catch (Exception e){
            throw new Exception("No se pudo obtener el texto del elemento: " + element);
        }
    }
    public String getTitle() throws Exception{
        try {
            return driver.getTitle();
        }catch (Exception e){
            throw new Exception("No se pudo obtener el titulo de la pagina");
        }
    }
    public void clear(By element) throws Exception{
            try {
                driver.findElement(element).clear();
            }catch (Exception e){
                throw new Exception("No se pudo limpiar el elemento: " + element);
            }
    }
    public void send(By element) throws Exception {
        try {
            driver.findElement(element).sendKeys();
        } catch (Exception e) {
            throw new Exception("No se pudo enviar send: " + element);
        }
    }

    public WebElement findElement(By element) throws Exception{
        try {
            return driver.findElement(element);
        }catch (Exception e) {
            throw new Exception("No se pudo limpiar el elemento: " + element);
        }
    }
/*    public String sendKeys(WebElement element) throws Exception {
        try {
            return driver.findElement(eleme nt).getText();
        } catch (Exception e) {
            throw new Exception("No se pudo limpiar el elemento: " + element);
        }
    }*/

}
