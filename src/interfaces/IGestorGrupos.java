
package interfaces;

import grupos.modelos.Grupo;
import java.util.ArrayList;
import java.util.List;


public interface IGestorGrupos {
    public static final String GRUPO_OK = "GRUPO GUARDADO";
    public static final String GRUPO_REPEAT = "ERROR. EL GRUPO YA SE ENCUENTRA CARGADO";
    public static final String GRUPO_ERROR = "NO SE HA PODIDO GUARDAR EL GRUPO, DATOS INVALIDOS";
    public static final String GRUPO_MODIFIED = "GRUPO MODIFICADO CORRECTAMENTE";
    public static final String GRUPO_NOTFOUND = "GRUPO NO ENCONTRADO";
    public static final String BORRAR_OK = "GRUPO BORRADO CORRECTAMENTE";
    public static final String BORRAR_ERROR = "NO SE PUDO BORRAR ESTE GRUPO PORQUE UN AUTOR PERTENECE A EL";
    
    
    public String nuevoGrupo(String nombre, String descripcion);
    
public String modificarGrupo(Grupo grupo, String descripcion);


public List<Grupo> buscarGrupos(String nombre);
public boolean existeEsteGrupo(Grupo grupo);
public String borrarGrupo(Grupo grupo);
public List<Grupo> verGrupos();
}
