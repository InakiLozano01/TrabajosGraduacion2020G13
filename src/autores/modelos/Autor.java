
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
    
    public void verNyA()
    {
        System.out.println("Nombre:"+nombres);
        System.out.println("Apellido"+apellidos);
    }
    public void mostrar ()
    {
        System.out.println("["+dni+"]"+apellidos+", "+nombres);
    }
    
    public void verGrupos()
    {
        for(MiembroEnGrupo m: meg)
        {
            m.mostrar();
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
        }
    }
    
    public void quitarGrupo(Grupo g)
    {
        MiembroEnGrupo m= new MiembroEnGrupo(this,g,null);
        if(this.meg.contains(m)==true)
        {
            meg.remove(m);
        }
    }
    
    public boolean esSuperAdministrador()
    {
        for(MiembroEnGrupo m: meg)
        {
            if(m.verGrupo().esSuperAdministradores())
            {
                return true;
            }
        }
        return false;
    }
    
    
}
