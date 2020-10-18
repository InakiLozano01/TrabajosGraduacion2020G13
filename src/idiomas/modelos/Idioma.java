
package idiomas.modelos;

public class Idioma {
    private String nombre;
    
    public void mostrar()
     {
         System.out.println(nombre);
     }
    
    public Idioma (String nombre)
    {
        this.nombre=nombre;
    }
    
    public void asignar (String n)
    {
        this.nombre=n;
    }
}
