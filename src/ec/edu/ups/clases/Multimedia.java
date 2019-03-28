
package ec.edu.ups.clases;


public class Multimedia {
    private byte[] archivo;
    private String formato;
    private double tamañobyts;
    private String path;
    private String nombre;

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public double getTamañobyts() {
        return tamañobyts;
    }

    public void setTamañobyts(double tamañobyts) {
        this.tamañobyts = tamañobyts;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
