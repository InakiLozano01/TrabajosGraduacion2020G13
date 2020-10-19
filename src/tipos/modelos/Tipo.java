
package tipos.modelos;

import java.util.Objects;


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
    
    public void asignar(String n)
    {
        this.nombre=n;
    }
    
    //Comparador

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.nombre);
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
        final Tipo other = (Tipo) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
 
   
}
