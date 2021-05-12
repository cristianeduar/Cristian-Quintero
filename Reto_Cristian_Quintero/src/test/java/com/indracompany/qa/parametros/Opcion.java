package com.indracompany.qa.parametros;

public class Opcion {
    private static final Propiedad propiedad = Propiedad.getInstancia();
    private static final String PRODUCTOS_PROPIOS=propiedad.getPropiedad("PRODUCTOS_PROPIOS");
    private static final String OFERTAS_ESPECIALES=propiedad.getPropiedad("OFERTAS_ESPECIALES");
    private static final String PRODUCTOS_MAS_POPULARES=propiedad.getPropiedad("PRODUCTOS_MAS_POPULARES");
    private static final String LINK_DE_CONTACTENOS=propiedad.getPropiedad("LINK_DE_CONTACTENOS");

    public Opcion(){
        super();
    }

    public static String getProductosPropios() {
        return PRODUCTOS_PROPIOS;
    }

    public static String getOfertasEspeciales() {
        return OFERTAS_ESPECIALES;
    }

    public static String getProductosMasPopulares() {
        return PRODUCTOS_MAS_POPULARES;
    }

    public static String getLinkDeContactenos() {
        return LINK_DE_CONTACTENOS;
    }
}
