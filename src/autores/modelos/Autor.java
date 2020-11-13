
package autores.modelos;

import grupos.modelos.MiembroEnGrupo;
import grupos.modelos.*;
import java.util.ArrayList;

public abstract class Autor {
    protected int dni;
    protected String clave;
    protected String nombres;
    protected String apellidos;
    protected ArrayList<MiembroEnGrupo> meg = new ArrayList<>();
    
    public Autor (int d, String a, String n, String c)
    {
        this.dni=d;
        this.apellidos=a;
        this.nombres=n;
        this.clave=c;
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
   
    public void mostrar ()
    {
        System.out.println("["+dni+"]"+apellidos+", "+nombres);
        for(MiembroEnGrupo m: meg)
        {
            System.out.println("\nPertenece al grupo: "+m.getGrupo().getNombre()+"\nRol: "+m.getRol());
        }
    }
   
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.dni;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }

        final Autor other = (Autor) obj;
        if (this.dni != other.dni) {
            return false;
        }
        return true;
        
    }
    
    public void agregarGrupo(Grupo g, Rol r)
    {
        MiembroEnGrupo m= new MiembroEnGrupo(this,g,r);
        if(this.meg.contains(m)==false)
        {
            meg.add(m);
            g.agregarMiembro(this, r);
        }
        
        
    }
    
    public void quitarGrupo(Grupo g)
    {
        MiembroEnGrupo m= new MiembroEnGrupo(this,g,null);
        if(this.meg.contains(m)==true)
        {
            meg.remove(m);
            g.quitarMiembro(this);
        }
        else
        {
            System.out.println("Grupo incorrecto, intente nuevamente");
        }
    }
    
    public boolean esSuperAdministrador()
    {
        for(MiembroEnGrupo m: meg)
        {
            if(m.getGrupo().esSuperAdministradores())
            {
                return true;
            }
        }
        return false;
    }
    
    
}
