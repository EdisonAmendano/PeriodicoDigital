
package ec.edu.ups.pruebas;

import ec.edu.ups.clases.RedSocial;


public class Prueba {
    
    public static void main(String[] args){
        RedSocial facebook = new RedSocial();
        facebook.setCodigo(1);
        facebook.setNombre("Facebook");
        facebook.setUrl("www.facebook.com");
        
        int cod = facebook.getCodigo();
        System.out.println("Codigo: " + cod);
        String nom = facebook.getNombre();
        System.out.println("Nombre: " + nom);
        String url = facebook.getUrl();
        System.out.println("URL: " + url);
    }
}
