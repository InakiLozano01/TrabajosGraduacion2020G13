
package tipos.modelos;

import interfaces.IGestorTipos;
import java.util.ArrayList;
import java.util.List;


public class GestorTipos implements IGestorTipos{
    
    public ArrayList<Tipo> tipos = new ArrayList<> ();
    
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Tipo> buscarTipos(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Tipo> verTipos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean existeEsteTipo(Tipo tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
