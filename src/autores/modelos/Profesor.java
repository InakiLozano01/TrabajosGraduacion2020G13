
package autores.modelos;

import grupos.modelos.*;
import java.util.ArrayList;

public class Profesor extends Autor {
   
   private Cargo cargo;
    
   @Override
   public void mostrar()
    {
        super.mostrar();
        System.out.println("Cargo:"+cargo);
        
    }
    public Profesor (int dni, String clave, String nombres, String apellidos, Cargo cargo, ArrayList<MiembroEnGrupo> m)
   {
       super(dni, clave, nombres, apellidos, m);
       this.cargo = cargo;
   }
}
