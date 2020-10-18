
package autores.modelos;

public abstract class Autor {
    protected int dni;
    protected String clave;
    protected String nombres;
    protected String apellidos;
            
    public Autor (int d, String c, String n, String a)
    {
        this.dni=d;
        this.clave=c;
        this.nombres=n;
        this.apellidos=a;
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
