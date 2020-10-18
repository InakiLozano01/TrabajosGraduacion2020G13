
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
    public boolean equals(Object obj) {
        if(obj==null)
            return false;
        if(this==obj)
            return true;
        if(this.nombre==((Tipo)obj).nombre)
            return true;
        else return false;
    }
}
