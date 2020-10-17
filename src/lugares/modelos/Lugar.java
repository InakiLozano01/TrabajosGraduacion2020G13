
package lugares.modelos;


public class Lugar {
    private String nombre;
    
    public void mostrar()
    {
        System.out.println(nombre);
    }
    
    public Lugar (String nombre)
    {
        this.nombre=nombre;
    }
}

