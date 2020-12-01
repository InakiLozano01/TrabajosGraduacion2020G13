
package interfaces;

import java.util.ArrayList;
import java.util.List;
import lugares.modelos.Lugar;


public interface IGestorLugares {
    
    public static final String LUGAR_OK = "LUGAR GUARDADO";
    public static final String LUGAR_REPEAT = "ERROR. EL LUGAR YA SE ENCUENTRA CARGADO";
    public static final String LUGAR_ERROR = "NO SE HA PODIDO GUARDAR EL LUGAR, DATOS INVALIDOS";
    public static final String BORRAR_OK = "Lugar BORRADO CORRECTAMENTE";
    public static final String BORRAR_ERROR = "NO SE PUDO BORRAR ESTE LUGAR PORQUE UNA PUBLICACION LO UTILIZA";
    
    public String nuevoLugar(String nombre);
    

public Lugar verLugar(String nombre);

public String borrarLugar(Lugar lugar);
public List<Lugar> buscarLugares(String nombre);
public List<Lugar> verLugares();
public boolean existeEsteLugar(Lugar lugar);
    
}
