
package grupos.modelos;

import interfaces.IGestorGrupos;
import java.util.ArrayList;

public class GestorGrupos implements IGestorGrupos{

    public ArrayList<Grupo> grupos = new ArrayList<>();
    
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
    public ArrayList<Grupo> verGrupos() {
        return grupos;
    }

    @Override
    public Grupo verGrupo(String nombre) {
        for(Grupo grupo: grupos){
            if(grupo.getNombre()==nombre)
                return grupo;
        }
        return null;
    }

    @Override
    public boolean existeEsteGrupo(Grupo grupo) {
        return grupos.contains(grupo);
    }
    
}
