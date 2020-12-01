
package idiomas.modelos;

import interfaces.IGestorIdiomas;
import java.util.ArrayList;
import java.util.List;


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
    public String borrarIdioma(Idioma idioma) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Idioma> buscarIdiomas(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Idioma> verIdiomas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean existeEsteIdioma(Idioma idioma) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
