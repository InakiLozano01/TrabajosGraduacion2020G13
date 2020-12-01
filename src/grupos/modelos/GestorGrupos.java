
package grupos.modelos;

import autores.modelos.GestorAutores;
import interfaces.IGestorAutores;
import interfaces.IGestorGrupos;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GestorGrupos implements IGestorGrupos{

    public List<Grupo> grupos = new ArrayList<>();
    
    private static GestorGrupos instance;

    public static GestorGrupos crear(){
        if(instance==null)
            instance = new GestorGrupos();
        return instance;
    }
    
    
    @Override
    public String nuevoGrupo(String nombre, String descripcion) {
        if(nombre!=null && nombre!="")
        {
            Grupo grupo = new Grupo(nombre, descripcion);
            if(!this.grupos.contains(grupo))
            {
                this.grupos.add(grupo);
                return GRUPO_OK;
            }
            else
            {
               return GRUPO_REPEAT;
            }
        }
        else
        {
            return GRUPO_ERROR;
        }
    }

    @Override
    public String modificarGrupo(Grupo grupo, String descripcion) {
        if(grupo!=null && descripcion!=null && descripcion!="")
        {
            if(this.grupos.contains(grupo))
            {
                grupo.setDescripcion(descripcion);
                return GRUPO_MODIFIED;
            }
            else
            {
                return GRUPO_NOTFOUND;
            }
        }
        else
        {
            return GRUPO_ERROR;
        }
    }

    @Override
    public String borrarGrupo(Grupo grupo) {
        IGestorAutores ga = GestorAutores.crear();
        if(!ga.hayAutoresConEsteGrupo(grupo))
        {
            grupos.remove(grupo);
            return BORRAR_OK;
        }
        else
        {
            return BORRAR_ERROR;
        }
    }

    @Override
    public List<Grupo> verGrupos() {
        Comparator<Grupo> cg = (g1, g2) -> g1.getNombre().compareTo(g2.getNombre());
        this.grupos.sort(cg);
        return this.grupos;
    }

    

    @Override
    public List<Grupo> buscarGrupos(String nombre) {
      List<Grupo> gruposBuscar = new ArrayList<> ();
      for(Grupo grupo: grupos)
      {
          if(grupo.getNombre().contains(nombre))
          {
              gruposBuscar.add(grupo);
          }
      }
      Comparator<Grupo> cg = (g1, g2) -> g1.getNombre().compareTo(g2.getNombre());
      gruposBuscar.sort(cg);
      return gruposBuscar;
    }

    @Override
    public boolean existeEsteGrupo(Grupo grupo) {
        return grupos.contains(grupo);
    }
    
}
