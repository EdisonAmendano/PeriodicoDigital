
package ec.edu.ups.clases;

import java.util.ArrayList;
import java.util.List;

/**
    * Seccion
    * Calase que permite clasificar las diferentes secciones del periodeico digital
    * @since  2019
    * @author Edison
    */
    

public class Seccion {
    
    private String nombre;
    private List<Noticia> noticias;
    
    public Seccion(){
        noticias = new ArrayList<>();
    }

    public String getNombre() {
        /**
        * GetNombre
        * Metodo que me permite obtener el nombre de la seccion
        * @since  2019
        * @author Edison
        */
        return nombre;
    }

    public void setNombre(String nombre) {
        /**
        * setNombre
        * Metodo que me permite establecer el nombre de la seccion
        * @since  2019
        * @author Edison
        */
        this.nombre = nombre;
    }
    
    public void agregarNoticia(Noticia noticia){
        
        noticias.add(noticia);
    }

    @Override
    public String toString() {
        return "\n\t\tSeccion:" + "\n\t\t\tnombre: " + nombre + "\n\t\t\tnoticias: " + noticias;
    }

}
