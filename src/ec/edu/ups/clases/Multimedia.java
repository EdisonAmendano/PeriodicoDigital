
package ec.edu.ups.clases;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
    * Multimedia
    * Calase que permite editar diferentes tipos de archivo multimedia del periodeico digital
    * @since  2019
    * @author Edison
    */

public class Multimedia {
    
    private List<Byte> archivos;
    private Date frechaCreacion;
    private Date fechaModificacion;
    private String formato;
    private double tamañobyts;
    private String path;
    private String nombre;
    private SimpleDateFormat format;
    
    public Multimedia(){
        archivos = new ArrayList<>();
        format = new SimpleDateFormat("dd/MM/yyyy");
    }

    public String getFormato() {
        /**
        * getFormato
        * Metodo que me permite obtener el formato del archivo multimedia
        * @since  2019
        * @author Edison
        */
        return formato;
    }

    public void setFormato(String formato) {
        /**
        * setFormato
        * Metodo que me permite establecer el formato del archivo multimedia
        * @since  2019
        * @author Edison
        */
        this.formato = formato;
    }

    public double getTamañobyts() {
        /**
        * getTamañobyts
        * Metodo que me permite obtener el tamaño del archivo multimedia
        * @since  2019
        * @author Edison
        */
        return tamañobyts;
    }

    public void setTamañobyts(double tamañobyts) {
        /**
        * setTamañobyts
        * Metodo que me permite establecer el tamaño del archivo multimedia
        * @since  2019
        * @author Edison
        */
        this.tamañobyts = tamañobyts;
    }

    public String getPath() {
        /**
        * getPath
        * Metodo que me permite obtener la ubicación del archivo multimedia
        * @since  2019
        * @author Edison
        */
        return path;
    }

    public void setPath(String path) {
        /**
        * setPath
        * Metodo que me permite establecer la ubicación del archivo multimedia
        * @since  2019
        * @author Edison
        */
        this.path = path;
    }

    public String getNombre() {
        /**
        * getNombre
        * Metodo que me permite obtener el nombre del archivo multimedia
        * @since  2019
        * @author Edison
        */
        return nombre;
    }

    public void setNombre(String nombre) {
         /**
        * setNombre
        * Metodo que me permite establecer el nombre del archivo multimedia
        * @since  2019
        * @author Edison
        */
        this.nombre = nombre;
    }

    public Date getFrechaCreacion() {
        return frechaCreacion;
    }

    public void setFrechaCreacion(Date frechaCreacion) {
        this.frechaCreacion = frechaCreacion;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }
    public void agregarArchivo(Byte archivo){
        archivos.add(archivo);
    }

    @Override
    public String toString() {
        return "\n\t\t\t\t\t\tMultimedia:" + "\n\t\t\t\t\t\t\tarchivos: " + archivos + "\n\t\t\t\t\t\t\tfrechaCreacion: " 
                + format.format(frechaCreacion) + "\n\t\t\t\t\t\t\tfechaModificacion: " + format.format(fechaModificacion) + "\n\t\t\t\t\t\t\tformato: " 
                + formato + "\n\t\t\t\t\t\t\ttamañobyts: " + tamañobyts + "\n\t\t\t\t\t\t\tpath: " 
                + path + "\n\t\t\t\t\t\t\tnombre: " + nombre;
    }
    
    
}
