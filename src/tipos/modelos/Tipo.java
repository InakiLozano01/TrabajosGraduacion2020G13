
package tipos.modelos;


public class Tipo {
    private String nombre;
    
    public void mostrar()
    {
        System.out.println(nombre);
    }
    
    public Tipo(String nombre)
    {
        this.nombre=nombre;
    }
}
