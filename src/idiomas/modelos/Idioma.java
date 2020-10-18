
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
    
    @Override
    public boolean equals(Object obj)
    {
        if(obj==null)
            return false;
        if(this==obj)
            return true;
        if(this.nombre==((Idioma)obj).nombre)
            return true;
        else return false;
    }
}
