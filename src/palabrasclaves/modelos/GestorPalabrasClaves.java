
package palabrasclaves.modelos;

import interfaces.IGestorPalabrasClaves;
import java.util.ArrayList;
import java.util.List;


public class GestorPalabrasClaves implements IGestorPalabrasClaves {
    
    public ArrayList<PalabraClave> palabrasClaves = new ArrayList<> ();
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PalabraClave> buscarPalabrasClaves(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PalabraClave> verPalabrasClaves() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean existeEstaPalabraClave(PalabraClave palabraClave) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
