
package ec.edu.ups.clases;

import java.text.SimpleDateFormat;
import java.util.Date;
 /**
    * Noticia
    * Calase que permite editar(crear, modificar, eiminar, etc.) las noticias del periodeico digital
    * @since  2019
    * @author Edison
    */

public class Noticia {
  
    private String titulo;
    private String autor;
    private Date fecha;
    private String contenido;
    private Multimedia multimedia;
    private String lugar;
    private SimpleDateFormat formato ;
    
    public Noticia(){
        formato = new SimpleDateFormat("dd/MM/yyyy");
    }

    public String getTitulo() {
        /**
        * getTitulo
        * Metodo que me permite obtener el titulo de la noticia
        * @since  2019
        * @author Edison
        */
        return titulo;
    }

    public void setTitulo(String titulo) {
        /**
        * setTitulo
        * Metodo que me permite establecer el nombre de la seccion
        * @since  2019
        * @author Edison
        */
        this.titulo = titulo;
    }

    public String getAutor() {
        /**
        * getAutor
        * Metodo que me permite obtener el Autor de la noticia
        * @since  2019
        * @author Edison
        */
        return autor;
    }

    public void setAutor(String autor) {
        /**
        * setAutor
        * Metodo que me permite establecer el Autor de la noticia
        * @since  2019
        * @author Edison
        */
        this.autor = autor;
    }

    public Date getFecha() {
        /**
        * getFecha
        * Metodo que me permite obtener la fecha de publicación de la noticia
        * @since  2019
        * @author Edison
        */
        return fecha;
    }

    public void setFecha(Date fecha) {
        /**
        * setFecha
        * Metodo que me permite establecer la fecha de publicación de la noticia
        * @since  2019
        * @author Edison
        */
        this.fecha = fecha;
    }

    public String getContenido() {
        /**
        * getContenido
        * Metodo que me permite obtener el contenido de la noticia
        * @since  2019
        * @author Edison
        */
        return contenido;
    }

    public void setContenido(String contenido) {
        /**
        * setContenido
        * Metodo que me permite establecer el contenido de la noticia
        * @since  2019
        * @author Edison
        */
        this.contenido = contenido;
    }

    public Multimedia getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(Multimedia multimedia) {
        this.multimedia = multimedia;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        return "\n\t\t\t\tNoticia:" + "\n\t\t\t\t\ttitulo: " + titulo + "\n\t\t\t\t\tautor: " + autor + "\n\t\t\t\t\tfecha: " 
                + formato.format(fecha) + "\n\t\t\t\t\tcontenido: " + contenido + "\n\t\t\t\t\tlugar: " + lugar
                + "\n\t\t\t\t\tmultimedia: " + multimedia ;
    }
    
}
