package com.indracompany.qa.Accion;

import com.indracompany.qa.paginas.Index;
import com.indracompany.qa.parametros.Categoria;
import com.indracompany.qa.parametros.Constante;
import com.indracompany.qa.parametros.Opcion;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccionesIndex extends Index {

    private static Boolean  encontroBanner= Boolean.FALSE;

    public AccionesIndex(WebDriver driver) {
        super(driver);
    }

    public void verificaExistenciaBloquesProductos(){
        shouldNotBeVisible(getAddToCar());
    }

    public void verificaExistenciaBloquesCategoria(){

        String categoriasWeb="";
        int i=0;
        for (WebElement categoria : getBloqueCategorias()) {
            categoriasWeb =categoriasWeb + categoria.getText();
            i++;
        }
        Assert.assertTrue(Constante.getMensajeCategoriasNoIguales(),categoriasWeb.equals(Categoria.getALTAVOCES()));
        Assert.assertTrue(Constante.getMensajeCategoriasNoIguales(),categoriasWeb.equals(Categoria.getAURICULARES()));
        Assert.assertTrue(Constante.getMensajeCategoriasNoIguales(),categoriasWeb.equals(Categoria.getMOUSE()));
        Assert.assertTrue(Constante.getMensajeCategoriasNoIguales(),categoriasWeb.equals(Categoria.getPORTATILES()));
        Assert.assertTrue(Constante.getMensajeCategoriasNoIguales(),categoriasWeb.equals(Categoria.getTABLETS()));
    }

      public void buscarBannerPublicidad(){
        if (getBarraAdicional().isVisible() || getBarraAdicionalId().isVisible() || getAnuncioGoogle().isVisible()){
            encontroBanner= Boolean.TRUE;
        }else{
            encontroBanner= Boolean.FALSE;
        }
          Assert.assertTrue(Constante.getMensajeNoBannerPublicidad(),encontroBanner= Boolean.TRUE);
      }

    public void verificaExistenciaDeOpciones(){

       // getCabecera().click();
        String opcionesWeb= "";
        for (WebElement categoria : getListaMenu()) {
            opcionesWeb = opcionesWeb + categoria.getText();
        }
        Assert.assertTrue(Constante.getMensajeOpcionesNoIguales(),opcionesWeb.contains(Opcion.getProductosPropios()));
        Assert.assertTrue(Constante.getMensajeOpcionesNoIguales(),opcionesWeb.contains(Opcion.getOfertasEspeciales()));
        Assert.assertTrue(Constante.getMensajeOpcionesNoIguales(),opcionesWeb.contains(Opcion.getLinkDeContactenos()));
        Assert.assertTrue(Constante.getMensajeOpcionesNoIguales(),opcionesWeb.contains(Opcion.getProductosMasPopulares()));

    }
}
