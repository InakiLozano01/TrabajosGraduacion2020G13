
package interfaces;

import idiomas.modelos.Idioma;
import java.util.ArrayList;


public interface IGestorIdiomas {
    public String nuevoIdioma(String nombre);
    
public ArrayList<Idioma> verIdiomas();
public Idioma verIdioma(String nombre);
}
