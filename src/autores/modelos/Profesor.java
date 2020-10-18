
package autores.modelos;

import grupos.modelos.MiembroEnGrupo;
import java.util.ArrayList;

public class Profesor {
    
   private int dni;
   private Cargo cargo;
   private String clave;
   private String nombres;
   private String apellidos; 
   private ArrayList<MiembroEnGrupo> meg;
    
   public void mostrar()
    {
        System.out.println("DNI:"+dni);
        System.out.println("Cargo:"+cargo);
        System.out.println("Clave:"+clave);
        System.out.println("Nombres:"+nombres);
        System.out.println("Apellidos:"+apellidos);
        
    }
    public Profesor (int dni, Cargo cargo, String clave, String nombres, String apellidos)
   {
       this.dni = dni;
       this.cargo = cargo;
       this.clave = clave;
       this.nombres = nombres;
       this.apellidos = apellidos;
   }
   
}
