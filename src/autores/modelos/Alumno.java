
package autores.modelos;

import grupos.modelos.MiembroEnGrupo;
import java.util.ArrayList;

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
       if(obj==null)
           return false;
       if(this==obj)
           return true;
       if(this.dni==((Alumno)obj).dni)
       {
           return true;
       }else
       {
           if(this.cx==((Alumno)obj).cx)
           {
           return true;
           }
           else
           {
               return false;
           }  
       }        
   }
}