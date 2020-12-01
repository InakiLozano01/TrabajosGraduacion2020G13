
package idiomas.modelos;

import interfaces.IGestorIdiomas;
import interfaces.IGestorPublicaciones;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import publicaciones.modelos.GestorPublicaciones;


public class GestorIdiomas implements IGestorIdiomas {
    
    public List<Idioma> idiomas = new ArrayList<>();
    public static GestorIdiomas instance;
    
    public static GestorIdiomas crear(){
        if(instance==null)
            instance = new GestorIdiomas();
        return instance;
    }

    @Override
    public String nuevoIdioma(String nombre) {
        if(nombre!= null && nombre!="")
        {
            Idioma idioma = new Idioma (nombre);
            if(!this.idiomas.contains(idioma))
            {
                this.idiomas.add(idioma);
                return IDIOMA_OK;
            }else
            {
                return IDIOMA_REPEAT;
            }
        }else
        {
            return IDIOMA_ERROR;
        }
    }

    @Override
    public String borrarIdioma(Idioma idioma) {
        IGestorPublicaciones gp= GestorPublicaciones.crear();
        if(!gp.hayPublicacionesConEsteIdioma(idioma))
        {
            idiomas.remove(idioma);
            return BORRAR_OK;
        }
        else
        {
            return BORRAR_ERROR;
        }
        
    }

    @Override
    public List<Idioma> buscarIdiomas(String nombre) {
        List<Idioma> idiomasBuscar = new ArrayList<> ();
      for(Idioma idioma: idiomas)
      {
          if(idioma.verNombre().contains(nombre))
          {
              idiomasBuscar.add(idioma);
          }
      }
      Comparator<Idioma> ci = (i1, i2) -> i1.verNombre().compareTo(i2.verNombre());
      idiomasBuscar.sort(ci);
      return idiomasBuscar;
    }

    @Override
    public List<Idioma> verIdiomas() {
        Comparator<Idioma> ci = (i1, i2) -> i1.verNombre().compareTo(i2.verNombre());
        this.idiomas.sort(ci);
        return this.idiomas;
    }

    @Override
    public boolean existeEsteIdioma(Idioma idioma) {
        return this.idiomas.contains(idioma);
    }

    

    @Override
    public Idioma verIdioma(String nombre) {
       for(Idioma idioma: idiomas)
       {
           if(idioma.verNombre()==nombre)
           {
               return idioma;
           }
       }
       return null;
    }
    
}
