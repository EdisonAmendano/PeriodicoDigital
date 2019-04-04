
package ec.edu.ups.clases;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
  /**
    * EstructuraPeriodico
    * Calase que permite estructurar el periodeico digital
    * @since  2019
    * @author Edison
    */

public class EstructuraPeriodico {
    
  
    
    private String ubicacion;
    private String nombre;
    private String periodico;
    private Date fecha;
    private List<Seccion> secciones;
    private List<RedSocial> redesSociales;
    private String encavezado;
    private SimpleDateFormat formato; 
    
    public EstructuraPeriodico(){
        secciones = new ArrayList<>();
        redesSociales = new ArrayList<>();
        formato = new SimpleDateFormat("dd/MM/yyyy");
    }

    public String getUbicacion() {
        /**
        * getUbicacion
        * Metodo que me permite obtener una ubicacion en el periodico digital
        * @since  2019
        * @author Edison
        */
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        /**
        * setUbicacion
        * Metodo que me permite establecer una ubicacion en el periodico digital
        * @since  2019
        * @author Edison
        */
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        /**
        * getNombre
        * Metodo que me permite obtener el nombre de la ubicación periodico digital
        * @since  2019
        * @author Edison
        */
        return nombre;
    }

    public void setNombre(String nombre) {
        /**
        * setNombre
        * Metodo que me permitestablecer obtener el nombre de la ubicación periodico digital
        * @since  2019
        * @author Edison
        */
        this.nombre = nombre;
    }

    public String getPeriodico() {
        /**
        * getPeriodico
        * Metodo que me permitestablecer obtener el periodico
        * @since  2019
        * @author Edison
        */
        return periodico;
    }

    public void setPeriodico(String periodico) {
        /**
        * setPeriodico
        * Metodo que me permitestablecer establecer el periodico
        * @since  2019
        * @author Edison
        */
        this.periodico = periodico;
    }

    public Date getFecha() {
        /**
        * getFecha
        * Metodo que me permite obtener la fecha de publicacion del periodico digital
        * @since  2019
        * @author Edison
        */
        return fecha;
    }

    public void setFecha(Date fecha) {
        /**
        * setFecha
        * Metodo que me permite establecer la fecha de publicacion del periodico digital
        * @since  2019
        * @author Edison
        */
        this.fecha = fecha;
    }
    
    public String getEncavezado() {
        return encavezado;
    }

    public void setEncavezado(String encavezado) {
        this.encavezado = encavezado;
    }
    
    public void agregarSeccion(Seccion seccion){
        secciones.add(seccion);
    }  
    public void agregarRedSocial(RedSocial redeSocial){
        redesSociales.add(redeSocial);
    }

    @Override
    public String toString() {
        return "EstructuraPeriodico: " + "\n\tUbicacion: " + ubicacion + "\n\tEncavezado: " + encavezado + "\n\tNombre: " + nombre 
                + "\n\tPeriodico: " + periodico + "\n\tFecha: " + formato.format(fecha) + "\n\tSecciones: " + secciones 
                + "\n\tRedesSociales:" + redesSociales;
    }
    
    
}
