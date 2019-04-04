
package ec.edu.ups.pruebas;

import ec.edu.ups.clases.EstructuraPeriodico;
import ec.edu.ups.clases.Multimedia;
import ec.edu.ups.clases.Noticia;
import ec.edu.ups.clases.RedSocial;
import ec.edu.ups.clases.Seccion;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;


public class Prueba {
    
    public static void main(String[] args) throws ParseException{
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        RedSocial facebook = new RedSocial();
        facebook.setCodigo(1);
        facebook.setNombre("Facebook");
        facebook.setUrl("www.facebook.com");
        facebook.agregarPublicaciones("Publicacion1......");
        facebook.agregarPublicaciones("Publicacion2......");
        
        RedSocial twitter = new RedSocial();
        twitter.setCodigo(2);
        twitter.setNombre("twitter");
        twitter.setUrl("www.twitter.com");
        twitter.agregarPublicaciones("Publicacion1.........");
        twitter.agregarPublicaciones("Publicacion1.........");
        
        Multimedia imagen1 = new Multimedia();
        imagen1.setNombre("Imagen");
        imagen1.setFormato(".npg");
        imagen1.setTamañobyts(33.026);
        imagen1.setPath("C:\\imagenes");
        imagen1.setFrechaCreacion(formato.parse("1/6/2018"));
        imagen1.setFechaModificacion(formato.parse("4/10/2018"));
        
        
        Multimedia video1 = new Multimedia();
        video1.setNombre("Video");
        video1.setFormato(".mp4");
        video1.setTamañobyts(7633.026);
        video1.setPath("C:\\videos");
        video1.setFrechaCreacion(formato.parse("6/8/2018"));
        video1.setFechaModificacion(formato.parse("1/1/2019"));
        
        Noticia barceleche = new Noticia();
        barceleche.setTitulo("Barcelona peor equipo del ecuador");
        barceleche.setAutor("Don Bosco");
        barceleche.setContenido("Barcelona es considerado el.....");
        barceleche.setFecha(formato.parse("4/4/2018"));
        barceleche.setLugar("Cuenca");
        barceleche.setMultimedia(video1);
                
        Noticia cuenquita = new Noticia();
        cuenquita.setTitulo("Cuanca golea a barcelona");
        cuenquita.setAutor("Don Bosco");
        cuenquita.setContenido("Cuenca goleao de.......");
        cuenquita.setFecha(formato.parse("3/4/2017"));
        cuenquita.setLugar("Cuenca");
        cuenquita.setMultimedia(imagen1);
        
        Noticia anuncios = new Noticia();
        anuncios.setTitulo("Venta de pc");
        anuncios.setAutor("TiendaPc");
        anuncios.setContenido("Se vende pc ........");
        anuncios.setFecha(formato.parse("4/4/2018"));
        anuncios.setLugar("Cuenca");
        anuncios.setMultimedia(video1);
        
        Noticia anuncios2 = new Noticia();
        anuncios2.setTitulo("Venta de carro");
        anuncios2.setAutor("TiendaCarro");
        anuncios2.setContenido("Se vende carro ........");
        anuncios2.setFecha(formato.parse("7/4/2016"));
        anuncios2.setLugar("Cuenca");
        anuncios2.setMultimedia(imagen1);
        
        Seccion deporte = new Seccion();
        deporte.setNombre("Deportes");
        deporte.agregarNoticia(barceleche);
        deporte.agregarNoticia(cuenquita);
        
        
        Seccion anuncio = new Seccion();
        anuncio.setNombre("Anuncios");
        anuncio.agregarNoticia(anuncios);
        anuncio.agregarNoticia(anuncios2);
        
        
        EstructuraPeriodico ep = new EstructuraPeriodico();
        ep.setEncavezado("Aqui va el encavezado.....");
        ep.setFecha(formato.parse("3/4/2019"));
        ep.setNombre("Deportes del dia y venta de ......");
        ep.setPeriodico("El diario");
        ep.setUbicacion("pag 2 ");
        ep.agregarRedSocial(facebook);
        ep.agregarRedSocial(twitter);
        ep.agregarSeccion(deporte);
        ep.agregarSeccion(anuncio);
        
        System.out.println(ep);
        
    }
  
}
