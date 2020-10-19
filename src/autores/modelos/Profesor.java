
package autores.modelos;

import grupos.modelos.*;
import java.util.ArrayList;

public class Profesor extends Autor {
   
   private Cargo cargo;
    
   @Override
   public void mostrar()
    {
        super.mostrar();
        System.out.println("Cargo: "+cargo);
        
    }
    public Profesor (int dni, String apellidos, String nombres, String clave, Cargo cargo)
   {
       super(dni, apellidos, nombres, clave);
       this.cargo = cargo;
   }
}
