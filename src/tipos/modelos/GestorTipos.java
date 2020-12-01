
package tipos.modelos;

import interfaces.IGestorPublicaciones;
import interfaces.IGestorTipos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import publicaciones.modelos.GestorPublicaciones;
import publicaciones.modelos.Publicacion;


public class GestorTipos implements IGestorTipos{
    
    public List<Tipo> tipos = new ArrayList<> ();
    
    private static GestorTipos instance;

    public static GestorTipos crear(){
        if(instance==null)
            instance = new GestorTipos();
        return instance;
    }

    @Override
    public String nuevoTipo(String nombre) {
        
        if(nombre!= null && nombre!="")
        {
            Tipo tipo = new Tipo (nombre);
            if(!this.tipos.contains(tipo))
            {
                this.tipos.add(tipo);
                return TIPO_OK;
            }else
            {
                return TIPO_REPEAT;
            }
        }else
        {
            return TIPO_ERROR;
        }
    }

    @Override
    public String borrarTipo(Tipo tipo) {
       
        IGestorPublicaciones gp= GestorPublicaciones.crear();
        if(!gp.hayPublicacionesConEsteTipo(tipo))
        {
            tipos.remove(tipo);
            return BORRAR_OK;
        }
        else
        {
            return BORRAR_ERROR;
        }
    }

    @Override
    public List<Tipo> buscarTipos(String nombre) {
       
      List<Tipo> tiposBuscar = new ArrayList<> ();
      for(Tipo tipo: tipos)
      {
          if(tipo.verNombre().contains(nombre))
          {
              tiposBuscar.add(tipo);
          }
      }
      Comparator<Tipo> ct = (t1, t2) -> t1.verNombre().compareTo(t2.verNombre());
      tiposBuscar.sort(ct);
      return tiposBuscar;
    }

    @Override
    public List<Tipo> verTipos() {
        
        Comparator<Tipo> ct = (t1, t2) -> t1.verNombre().compareTo(t2.verNombre());
        this.tipos.sort(ct);
        return this.tipos;
    }

    
    @Override
    public boolean existeEsteTipo(Tipo tipo) {
        
        for(Tipo t: tipos)
        {
            if(t.equals(tipo))
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public Tipo verTipo(String nombre) {
        
        for(Tipo tipo: tipos)
        {
            if(tipo.verNombre()== nombre)
            {
                return tipo;
            }
        }
        return null;
    }
    
}
