
package interfaces;

import java.util.ArrayList;
import tipos.modelos.Tipo;

public interface IGestorTipos {
    public String nuevoTipo(String nombre);
    
    public ArrayList<Tipo> verTipos();
    public Tipo verTipo(String nombre);

}
