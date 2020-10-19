
package autores.modelos;

import grupos.modelos.MiembroEnGrupo;
import java.util.ArrayList;
import java.util.Objects;

public class Alumno extends Autor {
    
   private String cx;

   
   public void mostrar()
    {  
        super.mostrar();
        System.out.println(cx);  
    }
   
   public Alumno (int dni, String clave, String nombres, String apellidos, String cx)
   {
       super(dni, clave, nombres, apellidos);
       this.cx=cx;
   }
   
   @Override
   public boolean equals (Object obj)
   {
       if(!super.equals(obj))
       {
           if(obj instanceof Alumno)
           {
               return Objects.equals(this.cx, ((Alumno)obj).cx);
           }
           else
           {
               return false;
           }
       }
       return true;
   }
}