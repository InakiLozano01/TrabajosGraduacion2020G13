
package grupos.modelos;

import java.util.ArrayList;

public class Grupo {
    private String nombre;
    private String descripcion;
    private ArrayList<MiembroEnGrupo> meg;
    
    public void mostrar()
    {
        System.out.println("Nombre:"+nombre);
        System.out.println("Descripcion:"+descripcion);
    }
    
    public Grupo (String nombre, String descripcion)
    {
        this.nombre=nombre;
        this.descripcion=descripcion;
    }
}
