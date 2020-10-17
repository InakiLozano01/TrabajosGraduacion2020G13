
package publicaciones.modelos;

import grupos.modelos.Rol;
import idiomas.modelos.Idioma;
import java.time.LocalDate;
import java.util.ArrayList;
import lugares.modelos.Lugar;
import palabrasclaves.modelos.PalabraClave;
import tipos.modelos.Tipo;

public class Publicacion {
    private String titulo;
    private LocalDate fechadepublicacion;
    private String enlace;
    private String resumen;
    private Tipo tipo;
    private ArrayList<PalabraClave> palabrasclaves;
    private Lugar lugar;
    private Idioma idioma;
    private Rol rol;
    
    public void mostrar ()
    {
        System.out.println("Titulo: " +titulo);
        System.out.println("Autor: " +apellido+ "," +nombre);
        System.out.println("Grupo: " +grupo);
        System.out.println("Fecha de publicacion: " +fechadepublicacion);
        System.out.println("Tipo: " +tipo);
        System.out.println("Idioma: " +idioma);
        System.out.println("Palabras Claves");
        System.out.println("----------");
        System.out.println("");//palabras claves
        System.out.println("Enlace: " +enlace);
        System.out.println("Resumen: " +resumen);
    }
    
}
