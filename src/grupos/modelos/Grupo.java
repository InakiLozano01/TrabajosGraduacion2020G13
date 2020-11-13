
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
        if(!meg.isEmpty())
        {
            System.out.println("Miembros: \n");
            for(MiembroEnGrupo m: meg)
            {
                m.mostrar();
            }    
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<MiembroEnGrupo> getMeg() {
        return meg;
    }

    public void setMeg(ArrayList<MiembroEnGrupo> meg) {
        this.meg = meg;
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
    
    
    public void agregarMiembro(Autor a, Rol r)
    {
        Rol admin_yesornot=r;
        if(this.nombre.equals("Super Administradores"))
        {
            admin_yesornot=Rol.ADMINISTRADOR;
        }
        MiembroEnGrupo m= new MiembroEnGrupo(a,this,admin_yesornot);
        if(this.meg.contains(m)==false)
        {
            this.meg.add(m);
            a.agregarGrupo(this,r);
        }
            
    }
    
    public void quitarMiembro(Autor a)
    {
        if(a!=null)
        {
        MiembroEnGrupo m= new MiembroEnGrupo(a,this,null);
                if(this.meg.contains(m)==true)
                {
                    this.meg.remove(m);
                    a.quitarGrupo(this);
                }
        }
        else
        {
            System.out.println("Miembro incorrecto, intente nuevamente");
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
