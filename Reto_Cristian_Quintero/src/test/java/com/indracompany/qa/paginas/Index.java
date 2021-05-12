package com.indracompany.qa.paginas;

import lombok.Data;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

@Data
public class Index extends PageObject {
    @FindBy(className = "AddToCard")
    private WebElementFacade addToCar;
    @FindBy(className = "categoryCell")
    private List<WebElement> bloqueCategorias;
    @FindBy(tagName = "aside")
    private WebElementFacade barraAdicional;
    @FindBy(className = "adsbygoogle")
    private WebElementFacade anuncioGoogle;
    @FindBy(id = "Aside")
    private WebElementFacade barraAdicionalId;
    @FindBy(tagName = "header")
    private WebElementFacade cabecera;
    @FindBy(className = "menu")
    private List<WebElement> listaMenu;

    public Index(WebDriver driver) {
        super(driver);
    }

    public WebElementFacade getAddToCar() {
        return addToCar;
    }

    public List<WebElement> getBloqueCategorias() {
        return bloqueCategorias;
    }

    public WebElementFacade getBarraAdicional() {
        return barraAdicional;
    }

    public WebElementFacade getAnuncioGoogle() {
        return anuncioGoogle;
    }

    public WebElementFacade getBarraAdicionalId() {
        return barraAdicionalId;
    }

    public WebElementFacade getCabecera() {
        return cabecera;
    }

    public List<WebElement> getListaMenu() {
        return listaMenu;
    }
}
