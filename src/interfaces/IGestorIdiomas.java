
package interfaces;

import idiomas.modelos.Idioma;
import java.util.ArrayList;
import java.util.List;


public interface IGestorIdiomas {
    
    public static final String IDIOMA_OK = "IDIOMA GUARDADO";
    public static final String IDIOMA_REPEAT = "ERROR. EL IDIOMA YA SE ENCUENTRA CARGADO";
    public static final String IDIOMA_ERROR = "NO SE HA PODIDO GUARDAR EL IDIOMA, DATOS INVALIDOS";
    public static final String BORRAR_OK = "IDIOMA BORRADO CORRECTAMENTE";
    public static final String BORRAR_ERROR = "NO SE PUDO BORRAR ESTE IDIOMA PORQUE UNA PUBLICACION LO UTILIZA";
    
    public String nuevoIdioma(String nombre);
    

public Idioma verIdioma(String nombre);

public String borrarIdioma(Idioma idioma);
public List<Idioma> buscarIdiomas(String nombre);
public List<Idioma> verIdiomas();
public boolean existeEsteIdioma(Idioma idioma);
}
