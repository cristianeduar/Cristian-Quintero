package com.indracompany.qa.parametros;

import java.io.FileInputStream;
import java.util.Properties;

public class Propiedad {

    private static Properties properties;
    private static Propiedad propiedad;

    public Propiedad(){
        properties = new Properties();
        cargarArchivo();
    }

    public static Propiedad getInstancia() {

        if (properties == null){
            propiedad = new Propiedad();
            cargarArchivo();
        }
        return propiedad;
    }

      private static Properties cargarArchivo() {

        try {
            properties.load(new FileInputStream("src/test/propiedades/propiedad.properties"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return properties;
    }

    public String getPropiedad(String prop) {
        return properties.getProperty(prop);
    }

}
