
package autores.modelos;

import grupos.modelos.MiembroEnGrupo;
import java.util.ArrayList;

public abstract class Autor {
    protected int dni;
    protected String clave;
    protected String nombres;
    protected String apellidos;
    protected ArrayList<MiembroEnGrupo> meg;
    
    public Autor (int d, String c, String n, String a, ArrayList<MiembroEnGrupo> m)
    {
        this.dni=d;
        this.clave=c;
        this.nombres=n;
        this.apellidos=a;
        this.meg=m;
    }
    
    public void mostrar ()
    {
        System.out.println("["+dni+"]"+apellidos+", "+nombres);    
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
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Autor other = (Autor) obj;
        if (this.dni != other.dni) {
            return false;
        }
        return true;
    }
    
    public void agregarGrupo()
    {
        
    }
    
}
