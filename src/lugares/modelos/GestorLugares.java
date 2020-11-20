
package lugares.modelos;

import interfaces.IGestorLugares;
import java.util.ArrayList;
import palabrasclaves.modelos.PalabraClave;

public class GestorLugares implements IGestorLugares {
    
    public ArrayList<Lugar> lugares = new ArrayList<>();
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
    public ArrayList<Lugar> verLugares() {
        return lugares;
        
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
