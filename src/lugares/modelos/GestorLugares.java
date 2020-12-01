
package lugares.modelos;

import interfaces.IGestorLugares;
import interfaces.IGestorPublicaciones;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import palabrasclaves.modelos.PalabraClave;
import publicaciones.modelos.GestorPublicaciones;

public class GestorLugares implements IGestorLugares {
    
    public List<Lugar> lugares = new ArrayList<>();
    private static GestorLugares instance;

    public static GestorLugares crear(){
        if(instance==null)
            instance = new GestorLugares();
        return instance;
    }

    @Override
    public String nuevoLugar(String nombre) {
        if(nombre!= null && nombre!="")
        {
            Lugar lugar = new Lugar (nombre);
            if(!this.lugares.contains(lugar))
            {
                this.lugares.add(lugar);
                return LUGAR_OK;
            }else
            {
                return LUGAR_REPEAT;
            }
        }else
        {
            return LUGAR_ERROR;
        }
        
    }

    @Override
    public String borrarLugar(Lugar lugar) {
        IGestorPublicaciones gp= GestorPublicaciones.crear();
        if(!gp.hayPublicacionesConEsteLugar(lugar))
        {
            lugares.remove(lugar);
            return BORRAR_OK;
        }
        else
        {
            return BORRAR_ERROR;
        }
    }

    @Override
    public List<Lugar> buscarLugares(String nombre) {
        List<Lugar> lugaresBuscar = new ArrayList<> ();
      for(Lugar lugar: lugares)
      {
          if(lugar.verNombre().contains(nombre))
          {
              lugaresBuscar.add(lugar);
          }
      }
      Comparator<Lugar> cl = (l1, l2) -> l1.verNombre().compareTo(l2.verNombre());
      lugaresBuscar.sort(cl);
      return lugaresBuscar;
    }

    @Override
    public List<Lugar> verLugares() {
        Comparator<Lugar> cl = (l1, l2) -> l1.verNombre().compareTo(l2.verNombre());
        this.lugares.sort(cl);
        return this.lugares;
    }

    @Override
    public boolean existeEsteLugar(Lugar lugar) {
        return this.lugares.contains(lugar);
    }

    

    @Override
    public Lugar verLugar(String nombre) {
        for(Lugar lugar: lugares)
        {
            if(lugar.verNombre()==nombre)
            {
                return lugar;
            }
        }
       return null;
    }

    
    
}
