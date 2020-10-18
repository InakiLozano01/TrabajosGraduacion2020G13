
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
    
    public boolean equeals (Object obj)
    {
        return false;
    }
}
