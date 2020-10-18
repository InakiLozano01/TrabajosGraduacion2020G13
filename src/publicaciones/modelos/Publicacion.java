
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
    private LocalDate fechadepublicacion;
    private String enlace;
    private String resumen;
    private Tipo tipo;
    private ArrayList<PalabraClave> palabrasclaves;
    private Lugar lugar;
    private Idioma idioma;
    private Rol rol;
    private MiembroEnGrupo meg;
    
    public Publicacion(String t, LocalDate fp, String e, String r, Tipo tip, ArrayList<PalabraClave> pc, Lugar l, Idioma i, Rol rol, MiembroEnGrupo meg)
    {
        this.titulo=t;
        this.fechadepublicacion=fp;
        this.enlace=e;
        this.resumen=r;
        this.tipo=tip;
        this.palabrasclaves=pc;
        this.lugar=l;
        this.idioma=i;
        this.rol=rol;
        this.meg=meg;
    }
    public void mostrar ()
    {
        System.out.println("Titulo: " +titulo);
        System.out.println("Autor: ");
        System.out.println("Fecha de publicacion: " +fechadepublicacion);
        System.out.println("Tipo: " +tipo);
        System.out.println("Idioma: " +idioma);
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
