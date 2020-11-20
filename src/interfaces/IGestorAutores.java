
package interfaces;

import autores.modelos.*;
import java.util.ArrayList;


public interface IGestorAutores {
    
    public static final String AUTOR_OK = "AUTOR GUARDADO";
    public static final String AUTOR_REPEAT = "ERROR. EL AUTOR YA SE ENCUENTRA CARGADO";
    public static final String AUTOR_ERROR = "NO SE HA PODIDO GUARDAR EL AUTOR, DATOS INVALIDOS";
    public static final String AUTOR_MODIFIED = "AUTOR MODIFICADO CORRECTAMENTE";
    public static final String AUTOR_NOTFOUND = "AUTOR NO ENCONTRADO";
    public static final String BORRAR_OK = "AUTOR BORRADO CORRECTAMENTE";
    
public String nuevoAutor(int dni, String apellidos, String nombres, Cargo cargo, 
String clave, String claveRepetida);
            
public String nuevoAutor(int dni, String apellidos, String nombres, String cx,
String clave, String claveRepetida);
        
public String modificarAutor(Autor autor, String apellidos, String nombres, Cargo
cargo, String clave, String claveRepetida);
        
public String modificarAutor(Autor autor, String apellidos, String nombres, String
cx, String clave, String claveRepetida);

public String borrarProfesores (Autor profesor);
        
public String borrarAlumnos (Autor alumno);
        
public boolean existeEsteAutor(Autor autor);
public ArrayList<Autor> verAutores();
public ArrayList<Profesor> verProfesores();
public ArrayList<Alumno> verAlumnos();
public Autor verAutor(int dni);
    
}
