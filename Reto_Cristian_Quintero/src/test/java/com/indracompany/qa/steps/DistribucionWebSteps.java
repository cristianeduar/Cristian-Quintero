package com.indracompany.qa.steps;

import com.indracompany.qa.Accion.AccionesIndex;
import com.indracompany.qa.parametros.Constante;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Y;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class DistribucionWebSteps {

    @Managed
    WebDriver driver;
    AccionesIndex accionesIndex= new AccionesIndex(getDriver());

    @Cuando("^Estoy en la pagina$")
    public void estoyEnLaPagina() {
        driver.get(Constante.getUrl());
        driver.manage().window().maximize();
    }

    @Y("^Valido que se encuentren los productos por categoria$")
    public void validoQueSeEncuentrenLosProductosPorCategoria() {
        accionesIndex.verificaExistenciaBloquesProductos();
        accionesIndex.verificaExistenciaBloquesCategoria();
    }

    @Y("^Valido que exista banner para la publicidad$")
    public void validoQueExistaBannerParaLaPublicidad() {
        accionesIndex.buscarBannerPublicidad();
    }

    @Y("^valido las opciones del menu$")
    public void validoLasOpcionesDelMenú() {
        accionesIndex.verificaExistenciaDeOpciones();
    }
}