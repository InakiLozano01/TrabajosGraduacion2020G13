
package interfaces;

import autores.modelos.*;
import grupos.modelos.Grupo;
import java.util.ArrayList;
import java.util.List;


public interface IGestorAutores {
    
    public static final String AUTOR_OK = "AUTOR GUARDADO";
    public static final String AUTOR_REPEAT = "ERROR. EL AUTOR YA SE ENCUENTRA CARGADO";
    public static final String AUTOR_ERROR = "NO SE HA PODIDO GUARDAR EL AUTOR, DATOS INVALIDOS";
    public static final String AUTOR_MODIFIED = "AUTOR MODIFICADO CORRECTAMENTE";
    public static final String AUTOR_NOTFOUND = "AUTOR NO ENCONTRADO";
    public static final String BORRAR_OK = "AUTOR BORRADO CORRECTAMENTE";
    public static final String BORRAR_ERROR = "NO SE PUDO BORRAR ESTE AUTOR PORQUE PERTENECE A UNA PUBLICACION";
    
public String nuevoAutor(int dni, String apellidos, String nombres, Cargo cargo, 
String clave, String claveRepetida);
            
public String nuevoAutor(int dni, String apellidos, String nombres, String cx,
String clave, String claveRepetida);
        
public String modificarAutor(Autor autor, String apellidos, String nombres, Cargo
cargo, String clave, String claveRepetida);
        
public String modificarAutor(Autor autor, String apellidos, String nombres, String
cx, String clave, String claveRepetida);


        
public boolean existeEsteAutor(Autor autor);
public Autor verAutor(int dni);

public String borrarAutor(Autor autor);
public List<Profesor> buscarProfesores(String apellidos);
public List<Alumno> buscarAlumnos(String apellidos);
public List<Autor> verAutores();
public List<Profesor> verProfesores();
public List<Alumno> verAlumnos();
public boolean hayAutoresConEsteGrupo(Grupo grupo);
    
}
