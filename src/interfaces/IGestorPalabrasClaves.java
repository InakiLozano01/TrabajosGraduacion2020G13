
package interfaces;

import java.util.ArrayList;
import java.util.List;
import palabrasclaves.modelos.PalabraClave;

public interface IGestorPalabrasClaves {
    
    public static final String PALABRACLAVE_OK = "PALABRA CLAVE GUARDADA";
    public static final String PALABRACLAVE_REPEAT = "ERROR. LA PALABRA CLAVE YA SE ENCUENTRA CARGADO";
    public static final String PALABRACLAVE_ERROR = "NO SE HA PODIDO GUARDAR LA PALABRA CLAVE, DATOS INVALIDOS";
    
    public String nuevaPalabraClave(String nombre);
    

public PalabraClave verPalabraClave(String nombre);

public String borrarPalabraClave(PalabraClave palabraClave);
public List<PalabraClave> buscarPalabrasClaves(String nombre);
public List<PalabraClave> verPalabrasClaves();
public boolean existeEstaPalabraClave(PalabraClave palabraClave);
}
