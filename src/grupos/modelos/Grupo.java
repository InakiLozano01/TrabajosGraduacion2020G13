
package grupos.modelos;

import autores.modelos.Autor;
import java.util.ArrayList;

public class Grupo {
    private String nombre;
    private String descripcion;
    private ArrayList<MiembroEnGrupo> meg = new ArrayList<>();
    
    public void mostrar()
    {
        System.out.println("Grupo: "+nombre);
        System.out.println("Descripcion: "+descripcion);
        for(MiembroEnGrupo m: meg)
        {
            m.mostrarMiembroyRol();
        }
    }
    
    public void mostrarNombre()
    {
        System.out.println("Grupo:"+nombre);
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
        MiembroEnGrupo m= new MiembroEnGrupo(a,this,r);
        if(this.meg.contains(m)==false)
        {
            this.meg.add(m);
            a.agregarGrupo(this,r);
        }
            
    }
    
    
    public void quitarMiembro(Autor a)
    {
        MiembroEnGrupo m= new MiembroEnGrupo(a,this,null);
                if(this.meg.contains(m)==true)
                {
                    this.meg.remove(m);
                }
    }
    
    public boolean esSuperAdministradores()
            {
                return this.nombre.equalsIgnoreCase("Super Administradores");
            }
    
    public boolean tieneMiembros()
    {
        return this.meg.isEmpty();
    }
}
