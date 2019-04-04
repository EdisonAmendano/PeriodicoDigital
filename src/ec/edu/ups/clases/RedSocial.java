package ec.edu.ups.clases;

import java.util.ArrayList;
import java.util.List;

/**
    * RedSocial
    * Calase que permite asociar redes sociales a mi periodico digital
    * @since  2019
    * @author Edison
    */

public class RedSocial {
    
    private int codigo;
    private String nombre;
    private String url;
    private List<String> publicaciones;
    
    public RedSocial(){
        publicaciones = new ArrayList<>();
    }

    public void setCodigo(int codigo) {
        /**
        * setCodigo
        * Metodo que me permite establecer el codigo de la ubicacion de la red social
        * @since  2019
        * @author Edison
        */
        this.codigo = codigo;
    }
    
    public int getCodigo(){
        /**
        * getCodigo
        * Metodo que me permite obtener el codigo de la ubicacion de la red social
        * @since  2019
        * @author Edison
        */
        return this.codigo;
    }

    public void setNombre(String nombre) {
        /**
        * setNombre
        * Metodo que me permite establecer el nombre de la red social
        * @since  2019
        * @author Edison
        */
        this.nombre = nombre;
    }
    
    public String getNombre(){
        /**
        * getNombre
        * Metodo que me permite obtener el nombre de la red social
        * @since  2019
        * @author Edison
        */
        return this.nombre;
    }

    public void setUrl(String url) {
        /**
        * setUrl
        * Metodo que me permite establecer el url de la red social
        * @since  2019
        * @author Edison
        */
        this.url = url;
    }
    
    public String getUrl(){
        /**
        * getUrl
        * Metodo que me permite obtener el url de la red social
        * @since  2019
        * @author Edison
        */
        return this.url;
    }
    
    public void agregarPublicaciones(String publicacion){
        publicaciones.add(publicacion);
    }

    @Override
    public String toString() {
        return "\n\t\tRedSocial:" + "\n\t\t\tnombre: " + nombre + "\n\t\t\tcodigo: " + codigo +  "\n\t\t\turl: " + url + "\n\t\t\tpublicaciones: " + publicaciones;
    }

    
        
}
