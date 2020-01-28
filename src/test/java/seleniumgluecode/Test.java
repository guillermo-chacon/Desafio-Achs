package seleniumgluecode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test extends TestBase {


    @Given("^El Usuario Se encuentra con la pagina home de Google\\.$")
    public void el_Usuario_Se_encuentra_con_la_pagina_home_de_Google() throws Throwable {

    }

    @When("^En google buscar la palabra ACHS y del listado que aparece, presionar en el texto que dice Hospital del Trabajador\\.$")
    public void en_google_buscar_la_palabra_ACHS_y_del_listado_que_aparece_presionar_en_el_texto_que_dice_Hospital_del_Trabajador() throws Throwable {
        googlePage.clickSearchGoogle();
        googlePage.cleanSearchGoogle();
        driver.findElement(By.name("q")).sendKeys("ACHS");
        driver.findElement(By.name("q")).submit();
        //googlePage.submitSearchGoogle();
    }

    @When("^En pagina ACHS presionar botón Reserva tu Hora luego clic en agendar hora ingresar un N° documento válido, seleccionar previsión “Fonasa” y darle clic a siguiente\\.$")
    public void en_pagina_ACHS_presionar_botón_Reserva_tu_Hora_luego_clic_en_agendar_hora_ingresar_un_N_documento_válido_seleccionar_previsión_Fonasa_y_darle_clic_a_siguiente() throws Throwable {

/*        WebDriverWait ewait = new WebDriverWait(driver, 20);
        ewait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"rso\"]/div[3]/div/div/div/div[1]/a")));*/
        googlePage.waitAchsLocator();
        googlePage.clickAchsPage();

        achsPage.waitResaraHora();
        achsPage.isTitleAchsDisplayed();
        achsPage.clickBtnReserva();

        Thread.sleep(4000);
        driver.switchTo().frame(0);
        achsPage.waitAgendaHora();
        achsPage.clickBtnAgenda();

        ingresaPage.wairut();
        ingresaPage.clickRut();
        Thread.sleep(2000);
        driver.findElement(By.id("rut")).sendKeys("17532187-k");
        Thread.sleep(4000);
        //ingresaPage.sendRut("17532187-k");

        ingresaPage.waitPrevision();
        Thread.sleep(2000);
        ingresaPage.selectListBtn();

        ingresaPage.waitFonasa();
        ingresaPage.selectReacFonasa();
        Thread.sleep(2000);
        //ingresaPage.selectbtnSiguiente();
        ingresaPage.btnSiguiente();


       Thread.sleep(20000);
       // driver.switchTo().frame(0);
        ingresaPage.waitEspecialidad();
      //  Thread.sleep(4000);
        ingresaPage.selectEspecialidadBtn();
        Thread.sleep(4000);
        ingresaPage.selectReacMedicinaGeneral();

        Thread.sleep(2000);
        ingresaPage.btnSiguiente2();
        Thread.sleep(20000);
        ingresaPage.validateMedicinaGral();



    }
    @When("^En especialidad, escribir Medicina General darle siguiente Finalmente validar que el texto en pantalla diga Medicina General\\.$")
    public void en_especialidad_escribir_Medicina_General_darle_siguiente_Finalmente_validar_que_el_texto_en_pantalla_diga_Medicina_General() throws Throwable {

    }

    @Then("^Finalmente tomar un Screenshot para validar el término del flujo\\.$")
    public void finalmente_tomar_un_Screenshot_para_validar_el_término_del_flujo() throws Throwable {
        ingresaPage.capturaPantalla();

    }
////////////////////////////////////////////////////////////////////////////////////////////////////////
}

