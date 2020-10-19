
package publicaciones.modelos;

import grupos.modelos.MiembroEnGrupo;
import grupos.modelos.Rol;
import idiomas.modelos.Idioma;
import java.time.LocalDate;
import java.util.ArrayList;
import lugares.modelos.Lugar;
import palabrasclaves.modelos.PalabraClave;
import tipos.modelos.Tipo;

public class Publicacion {
    private String titulo;
    private MiembroEnGrupo meg;  
    private LocalDate fechadepublicacion;
    private Tipo tipo;
    private Idioma idioma;
    private Lugar lugar;
    private ArrayList<PalabraClave> palabrasclaves;
    private String enlace;
    private String resumen;
    
    public Publicacion(String t, MiembroEnGrupo meg, LocalDate fp, Tipo tip, Idioma i, Lugar l, ArrayList<PalabraClave> pc, String e, String r)
    {
        this.titulo=t;
        this.meg=meg;
        this.fechadepublicacion=fp;
        this.tipo=tip;
        this.idioma=i;
        this.lugar=l;
        this.palabrasclaves=pc;
        this.enlace=e;
        this.resumen=r;
    }
    public void mostrar ()
    {
        System.out.println("Titulo: " +titulo);
        
        System.out.print("Autor: ");
        meg.mostrarmiembro();
        
        meg.verGrupo().mostrarNombre();
        
        meg.mostrarRol();
        
        System.out.println("Fecha de publicacion: " +fechadepublicacion);
        
        System.out.print("Tipo: ");
        tipo.mostrar();
        
        System.out.print("Idioma: ");
        idioma.mostrar();
        
        System.out.print("Lugar: ");
        lugar.mostrar();
        
        System.out.println("Palabras Claves");
        System.out.println("----------");
        for(PalabraClave i: palabrasclaves)
        {
            i.mostrar();
        }
        System.out.println("Enlace: " +enlace);
        System.out.println("Resumen: " +resumen);
    }
    
    @Override
    public boolean equals (Object obj)
    {
        if(obj==null)
            return false;
        if(this==obj)
            return true;
        if(this.titulo==((Publicacion)obj).titulo)
            return true;
        else return false;
        
    }
}
