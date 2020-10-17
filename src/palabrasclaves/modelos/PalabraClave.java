
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
}