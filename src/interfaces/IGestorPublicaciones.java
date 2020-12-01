
package interfaces;

import autores.modelos.Autor;
import grupos.modelos.MiembroEnGrupo;
import idiomas.modelos.Idioma;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import lugares.modelos.Lugar;
import palabrasclaves.modelos.PalabraClave;
import publicaciones.modelos.Publicacion;
import tipos.modelos.Tipo;

public interface IGestorPublicaciones {
    
    public static final String PUBLICACION_OK = "PUBLICACION GUARDADA";
    public static final String PUBLICACION_REPEAT = "ERROR. LA PUBLICACION YA SE ENCUENTRA CARGADO";
    public static final String PUBLICACION_ERROR = "NO SE HA PODIDO GUARDAR LA PUBLICACION, DATOS INVALIDOS";
    public static final String PUBLICACION_MODIFIED = "PUBLICACION MODIFICADA CORRECTAMENTE";
    public static final String PUBLICACION_NOTFOUND = "PUBLICACION NO ENCONTRADA";
    
    public String nuevaPublicacion(String titulo, MiembroEnGrupo miembroEnGrupo,
LocalDate fechaPublicacion, Tipo tipo, Idioma idioma, Lugar lugar,
List<PalabraClave> palabrasClaves, String enlace, String resumen);
    
public String modificarPublicacion(Publicacion publicacion, MiembroEnGrupo
miembroEnGrupo, LocalDate fechaPublicacion, Tipo tipo, Idioma idioma, Lugar lugar,
List<PalabraClave> palabrasClaves, String enlace, String resumen);

public boolean hayPublicacionesConEstaPalabraClave(PalabraClave palabraClave);
public boolean hayPublicacionesConEsteLugar(Lugar lugar);
public boolean hayPublicacionesConEsteIdioma(Idioma idioma);
public boolean hayPublicacionesConEsteTipo(Tipo tipo);
public boolean hayPublicacionesConEsteAutor(Autor autor);
public boolean existeEstaPublicacion(Publicacion publicacion);
public Publicacion verPublicacion(String titulo);

public String borrarPublicacion(Publicacion publicacion);
public List<Publicacion> buscarPublicaciones(String titulo);
public List<Publicacion> verPublicaciones();
    
}
