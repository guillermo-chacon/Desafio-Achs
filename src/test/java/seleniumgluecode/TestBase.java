package seleniumgluecode;

import org.openqa.selenium.WebDriver;
import pom.AchsPage;
import pom.GooglePage;
import pom.IngresaPage;

public class TestBase {

    protected WebDriver driver = Hooks.getDriver();
    protected GooglePage googlePage = new GooglePage(driver);
    protected AchsPage achsPage= new AchsPage(driver);
    protected IngresaPage ingresaPage= new IngresaPage(driver);
}
