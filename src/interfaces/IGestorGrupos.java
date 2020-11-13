
package interfaces;

import grupos.modelos.Grupo;
import java.util.ArrayList;


public interface IGestorGrupos {
    
    public String nuevoGrupo(String nombre, String descripcion);
    
public String modificarGrupo(Grupo grupo, String descripcion);

public ArrayList<Grupo> verGrupos();
public Grupo verGrupo(String nombre);
public boolean existeEsteGrupo(Grupo grupo);
}
