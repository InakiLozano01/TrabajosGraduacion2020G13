
package palabrasclaves.modelos;


public class PalabraClave {
    private String nombre;
    
    public void mostrar()
    {
        System.out.println(nombre);
    }
    
    public PalabraClave (String nombre)
    {
        this.nombre=nombre;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if(obj==null)
            return false;
        if(this==obj)
            return false;
        if(this.nombre==((PalabraClave)obj).nombre)
            return true;
        else return false;
    }
}