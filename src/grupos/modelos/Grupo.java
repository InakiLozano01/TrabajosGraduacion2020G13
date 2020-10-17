
package grupos.modelos;

public class Grupo {
    private String nombre;
    private String descripcion;
    
    public void mostrar()
    {
        System.out.println(nombre);
        System.out.println(descripcion);
    }
    
    public Grupo (String nombre, String descripcion)
    {
        this.nombre=nombre;
        this.descripcion=descripcion;
    }
}
