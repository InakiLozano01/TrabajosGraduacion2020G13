
package idiomas.modelos;

import interfaces.IGestorIdiomas;
import java.util.ArrayList;


public class GestorIdiomas implements IGestorIdiomas {
    
    public ArrayList<Idioma> idiomas = new ArrayList<>();
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
    public ArrayList<Idioma> verIdiomas() {
        return idiomas;
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
