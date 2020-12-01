
package palabrasclaves.modelos;

import interfaces.IGestorPalabrasClaves;
import interfaces.IGestorPublicaciones;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import publicaciones.modelos.GestorPublicaciones;


public class GestorPalabrasClaves implements IGestorPalabrasClaves {
    
    public List<PalabraClave> palabrasClaves = new ArrayList<> ();
    private static GestorPalabrasClaves instance;

    public static GestorPalabrasClaves crear(){
        if(instance==null)
            instance = new GestorPalabrasClaves();
        return instance;
    }


    @Override
    public String nuevaPalabraClave(String nombre) {
        
        if(nombre!= null && nombre!="")
        {
            PalabraClave palabraClave = new PalabraClave (nombre);
            if(!this.palabrasClaves.contains(palabraClave))
            {
                this.palabrasClaves.add(palabraClave);
                return PALABRACLAVE_OK;
            }else
            {
                return PALABRACLAVE_REPEAT;
            }
        }else
        {
            return PALABRACLAVE_ERROR;
        }
        
    }

    @Override
    public String borrarPalabraClave(PalabraClave palabraClave) {
        
       IGestorPublicaciones gp = GestorPublicaciones.crear();
       if(!gp.hayPublicacionesConEstaPalabraClave(palabraClave))
       {
           palabrasClaves.remove(palabraClave);
           return BORRAR_OK;
       }
       else
       {
           return BORRAR_ERROR;
       }
    }

    @Override
    public List<PalabraClave> buscarPalabrasClaves(String nombre) {
        
        List<PalabraClave> palabrasBuscar = new ArrayList<> ();
      for(PalabraClave palabraClave: palabrasClaves)
      {
          if(palabraClave.verNombre().contains(nombre))
          {
              palabrasBuscar.add(palabraClave);
          }
      }
      Comparator<PalabraClave> cpc = (pc1, pc2) -> pc1.verNombre().compareTo(pc2.verNombre());
      palabrasBuscar.sort(cpc);
      return palabrasBuscar;
    }

    @Override
    public List<PalabraClave> verPalabrasClaves() {
        
        Comparator<PalabraClave> cpc = (pc1, pc2) -> pc1.verNombre().compareTo(pc2.verNombre());
        this.palabrasClaves.sort(cpc);
        return this.palabrasClaves;
    }

    @Override
    public boolean existeEstaPalabraClave(PalabraClave palabraClave) {
        
        for(PalabraClave pc: palabrasClaves)
        {
            if(pc.equals(palabraClave))
            {
                return true;
            }
        }
        return false;
    }

    

    @Override
    public PalabraClave verPalabraClave(String nombre) {
        for(PalabraClave palabraClave: palabrasClaves)
        {
            if(palabraClave.verNombre()==nombre)
            {
                return palabraClave;
            }
        }
        return null;
    }
    
}
