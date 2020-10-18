
package grupos.modelos;

import autores.modelos.Autor;
import java.util.ArrayList;

public class Grupo {
    private String nombre;
    private String descripcion;
    private ArrayList<MiembroEnGrupo> meg;
    
    public void mostrar()
    {
        System.out.println("Nombre:"+nombre);
        System.out.println("Descripcion:"+descripcion);
    }
    
    public Grupo (String nombre, String descripcion)
    {
        this.nombre=nombre;
        this.descripcion=descripcion;
    }
   
    public boolean equals(Object obj)
    {
        if(obj==null)
            return false;
        if(this==obj)
            return true;
        if(this.nombre==((Grupo)obj).nombre)
            return true;
        else return false;
    }
    
    public void verMiembros()
    {
        for(MiembroEnGrupo m: meg)
            m.mostrarmiembro();
    }
    
    public void agregarMiembro(Autor a, Rol r)
    {
        
    }
    
}
