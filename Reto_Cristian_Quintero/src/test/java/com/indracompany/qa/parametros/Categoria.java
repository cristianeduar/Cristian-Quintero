package com.indracompany.qa.parametros;

import java.util.ArrayList;

public class Categoria
{
    private static final Propiedad propiedad = Propiedad.getInstancia();
    private static final String ALTAVOCES=propiedad.getPropiedad("ALTAVOCES");
    private static final String TABLETS=propiedad.getPropiedad("TABLETS");
    private static final String PORTATILES=propiedad.getPropiedad("PORTATILES");
    private static final String MOUSE=propiedad.getPropiedad("MOUSE");
    private static final String AURICULARES=propiedad.getPropiedad("AURICULARES");


    public Categoria(){
        super();
    }

    public static String getALTAVOCES() {
        return ALTAVOCES;
    }

    public static String getTABLETS() {
        return TABLETS;
    }

    public static String getPORTATILES() {
        return PORTATILES;
    }

    public static String getMOUSE() {
        return MOUSE;
    }

    public static String getAURICULARES() {
        return AURICULARES;
    }
}
