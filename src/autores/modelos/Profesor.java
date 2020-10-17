
package autores.modelos;

public class Profesor {
    
   private int dni;
   private String cargo;
   private String clave;
   private String nombres;
   private String apellidos; 
    
   public void mostrar()
    {
        System.out.println(dni);
        System.out.println(cargo);
        System.out.println(clave);
        System.out.println(nombres);
        System.out.println(apellidos);
    }
    public Profesor (int dni, String cargo, String clave, String nombres, String apellidos)
   {
       this.dni=dni;
       this.cargo=cargo;
       this.clave=clave;
       this.nombres=nombres;
       this.apellidos=apellidos;
   }
   
}
