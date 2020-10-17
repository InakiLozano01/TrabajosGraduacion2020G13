
package autores.modelos;

public class Alumno {
    
   private int dni;
   private String cx;
   private String clave;
   private String nombres;
   private String apellidos;
    
   public void mostrar()
    {
        System.out.println(dni);
        System.out.println(cx);
        System.out.println(clave);
        System.out.println(nombres);
        System.out.println(apellidos);
    }
   
   public Alumno (int dni, String cx, String clave, String nombres, String apellidos)
   {
       this.dni=dni;
       this.cx=cx;
       this.clave=clave;
       this.nombres=nombres;
       this.apellidos=apellidos;
   }
}