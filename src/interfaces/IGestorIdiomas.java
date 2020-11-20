
package interfaces;

import idiomas.modelos.Idioma;
import java.util.ArrayList;


public interface IGestorIdiomas {
    
    public static final String IDIOMA_OK = "IDIOMA GUARDADO";
    public static final String IDIOMA_REPEAT = "ERROR. EL IDIOMA YA SE ENCUENTRA CARGADO";
    public static final String IDIOMA_ERROR = "NO SE HA PODIDO GUARDAR EL IDIOMA, DATOS INVALIDOS";
    
    public String nuevoIdioma(String nombre);
    
public ArrayList<Idioma> verIdiomas();
public Idioma verIdioma(String nombre);
}
