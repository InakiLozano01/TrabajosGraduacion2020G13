
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
   
    public void asignar(String n)
    {
        this.nombre=n;
    }
    
    @Override
    
    public boolean equals (Object obj)
    {
        if(obj==null)
            return false;
        if(this==obj)
            return true;
        if(this.nombre==((Lugar)obj).nombre)
            return true;
        else return false;
            
    }
}

