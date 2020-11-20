
package autores.modelos;

import grupos.modelos.MiembroEnGrupo;
import java.util.ArrayList;
import java.util.Objects;

public class Alumno extends Autor {
    
   private String cx;

   
   public void mostrar()
    {  
        super.mostrar();
        System.out.println("CX: "+cx);  
    }

    public String getCx() {
        return cx;
    }

    public void setCx(String cx) {
        this.cx = cx;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public ArrayList<MiembroEnGrupo> getMeg() {
        return meg;
    }

    public void setMeg(ArrayList<MiembroEnGrupo> meg) {
        this.meg = meg;
    }
   
   
   
   public Alumno (int dni, String apellidos, String nombres, String clave, String cx)
   {
       super(dni, apellidos, nombres, clave);
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.cx);
        return hash;
    }
}