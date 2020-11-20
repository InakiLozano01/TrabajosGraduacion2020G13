
package interfaces;

import java.util.ArrayList;
import lugares.modelos.Lugar;


public interface IGestorLugares {
    
    public static final String LUGAR_OK = "LUGAR GUARDADO";
    public static final String LUGAR_REPEAT = "ERROR. EL LUGAR YA SE ENCUENTRA CARGADO";
    public static final String LUGAR_ERROR = "NO SE HA PODIDO GUARDAR EL LUGAR, DATOS INVALIDOS";
    
    public String nuevoLugar(String nombre);
    
public ArrayList<Lugar> verLugares();
public Lugar verLugar(String nombre);
    
}
