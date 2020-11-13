
package interfaces;

public interface IGestorPublicaciones {
    public String nuevaPublicacion(String titulo, MiembroEnGrupo miembroEnGrupo,
LocalDate fechaPublicacion, Tipo tipo, Idioma idioma, Lugar lugar,
ArrayList<PalabraClave> palabrasClaves, String enlace, String resumen)
public String modificarPublicacion(Publicacion publicacion, MiembroEnGrupo
miembroEnGrupo, LocalDate fechaPublicacion, Tipo tipo, Idioma idioma, Lugar lugar,
ArrayList<PalabraClave> palabrasClaves, String enlace, String resumen)
public boolean hayPublicacionesConEstaPalabraClave(PalabraClave palabraClave)
public boolean hayPublicacionesConEsteLugar(Lugar lugar)
public boolean hayPublicacionesConEsteIdioma(Idioma idioma)
public boolean hayPublicacionesConEsteTipo(Tipo tipo)
public boolean hayPublicacionesConEsteAutor(Autor autor)
public boolean existeEstaPublicacion(Publicacion publicacion)
public ArrayList<Publicacion> verPublicaciones()
public Publicacion verPublicacion(String titulo)
    
}
