
package interfaces;

import java.util.ArrayList;
import java.util.List;
import tipos.modelos.Tipo;

public interface IGestorTipos {
    public static final String TIPO_OK = "TIPO GUARDADO";
    public static final String TIPO_REPEAT = "ERROR. EL TIPO YA SE ENCUENTRA CARGADO";
    public static final String TIPO_ERROR = "NO SE HA PODIDO GUARDAR EL TIPO, DATOS INVALIDOS";
    
    public String nuevoTipo(String nombre);
    
    
    public Tipo verTipo(String nombre);
    
    public String borrarTipo(Tipo tipo);
    public List<Tipo> buscarTipos(String nombre);
    public List<Tipo> verTipos();
    public boolean existeEsteTipo(Tipo tipo);

}
