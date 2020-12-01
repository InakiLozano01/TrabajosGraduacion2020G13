
package publicaciones.modelos;

import autores.modelos.Autor;
import grupos.modelos.MiembroEnGrupo;
import idiomas.modelos.Idioma;
import interfaces.IGestorPublicaciones;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import lugares.modelos.Lugar;
import palabrasclaves.modelos.PalabraClave;
import tipos.modelos.Tipo;


public class GestorPublicaciones implements IGestorPublicaciones {
    
    public ArrayList<Publicacion> publicaciones = new ArrayList<> ();
     private static GestorPublicaciones instance;

    public static GestorPublicaciones crear(){
        if(instance==null)
            instance = new GestorPublicaciones();
        return instance;
    }
    @Override
    public String nuevaPublicacion(String titulo, MiembroEnGrupo miembroEnGrupo, LocalDate fechaPublicacion, Tipo tipo, Idioma idioma, Lugar lugar, List<PalabraClave> palabrasClaves, String enlace, String resumen) {
        
        if(titulo!=null && titulo!="" && miembroEnGrupo!=null && fechaPublicacion!= null && tipo!=null && idioma!=null && lugar!=null && palabrasClaves!=null && palabrasClaves.size()!=0 && enlace!= null && enlace!="" && resumen!=null && resumen!="")
        {
            Publicacion publicacion = new Publicacion (titulo, miembroEnGrupo, fechaPublicacion, tipo, idioma, lugar, palabrasClaves, enlace, resumen);
            if(!this.existeEstaPublicacion(publicacion))
            {
                this.publicaciones.add(publicacion);
                return PUBLICACION_OK;
            }else
            {
                return PUBLICACION_REPEAT;
            }
        }else
        {
            return PUBLICACION_ERROR;
        }
    }

    @Override
    public String modificarPublicacion(Publicacion publicacion, MiembroEnGrupo miembroEnGrupo, LocalDate fechaPublicacion, Tipo tipo, Idioma idioma, Lugar lugar, List<PalabraClave> palabrasClaves, String enlace, String resumen) {
        
        if(publicacion!= null && miembroEnGrupo!=null && fechaPublicacion!= null && tipo!=null && idioma!=null && lugar!=null && palabrasClaves!=null && palabrasClaves.size()!=0 && enlace!= null && enlace!="" && resumen!=null && resumen!="")
        {
            if(this.publicaciones.contains(publicacion))
            {
                publicacion.setEnlace(enlace);
                publicacion.setFechadepublicacion(fechaPublicacion);
                publicacion.setIdioma(idioma);
                publicacion.setLugar(lugar);
                publicacion.setMeg(miembroEnGrupo);
                publicacion.setPalabrasclaves(palabrasClaves);
                publicacion.setResumen(resumen);
                publicacion.setTipo(tipo);
                return PUBLICACION_MODIFIED;
            }else
            {
                return PUBLICACION_NOTFOUND;
            }
        }else
        {
            return PUBLICACION_ERROR;
        }
    }

    @Override
    public boolean hayPublicacionesConEstaPalabraClave(PalabraClave palabraClave) {
        for(Publicacion publicacion: publicaciones)
        {
            if(publicacion.getPalabrasclaves().contains(palabraClave))
            {
                return true;
            }
        }
        return false;
        
    }

    @Override
    public boolean hayPublicacionesConEsteLugar(Lugar lugar) {
        for(Publicacion publicacion: publicaciones)
        {
            if(publicacion.getLugar().equals(lugar))
            {
                return true;
            }
        }
        return false;
       
    }

    @Override
    public boolean hayPublicacionesConEsteIdioma(Idioma idioma) {
        for(Publicacion publicacion: publicaciones)
        {
            if(publicacion.getIdioma().equals(idioma))
            {
                return true;
            }
        }
        return false;
      
    }

    @Override
    public boolean hayPublicacionesConEsteTipo(Tipo tipo) {
        for(Publicacion publicacion: publicaciones)
        {
            if(publicacion.getTipo().equals(tipo))
            {
                return true;
            }
        }
        return false;
        
    }

    @Override
    public boolean hayPublicacionesConEsteAutor(Autor autor) {
                       
    for(Publicacion publicacion: publicaciones)
           {
               if(publicacion.getMeg().getAutor().equals(autor))
               {
                   return true;
              }
           }
          return false;
        
    }

    @Override
    public boolean existeEstaPublicacion(Publicacion publicacion) {
        return publicaciones.contains(publicacion);
       
    }

    @Override
    public String borrarPublicacion(Publicacion publicacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Publicacion> buscarPublicaciones(String titulo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Publicacion> verPublicaciones() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    @Override
    public Publicacion verPublicacion(String titulo) {
        for(Publicacion publicacion: publicaciones)
        {
            if(publicacion.getTitulo()==titulo)
            {
                return publicacion;
            }
        }
        return null;
        
    }
    
}
