package com.indracompany.qa.parametros;

public class Constante {

    private static final Propiedad propiedad = Propiedad.getInstancia();

    private static final String URL=propiedad.getPropiedad("URL");
    private static final String ELEMENTO_NO_ENCONTRADO=propiedad.getPropiedad("ELEMENTO_NO_ENCONTRADO");
    private static final String  MENSAJE_CATEGORIAS_NO_IGUALES=propiedad.getPropiedad("MENSAJE_CATEGORIAS_NO_IGUALES");
    private static final String  MENSAJE_OPCIONES_NO_IGUALES=propiedad.getPropiedad("MENSAJE_OPCIONES_NO_IGUALES");
    private static final String MENSAJE_NO_BANNER_PUBLICIDAD=propiedad.getPropiedad("MENSAJE_NO_BANNER_PUBLICIDAD");
    public Constante(){
        super();
    }

    public static String getUrl() {
        return URL;
    }

    public static String getElementoNoEncontrado() {
        return ELEMENTO_NO_ENCONTRADO;
    }

    public static String getMensajeCategoriasNoIguales() {
        return MENSAJE_CATEGORIAS_NO_IGUALES;
    }

    public static String getMensajeOpcionesNoIguales() {
        return MENSAJE_OPCIONES_NO_IGUALES;
    }

    public static String getMensajeNoBannerPublicidad() {
        return MENSAJE_NO_BANNER_PUBLICIDAD;
    }
}
