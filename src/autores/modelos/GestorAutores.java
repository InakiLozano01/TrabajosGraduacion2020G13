
package autores.modelos;

import interfaces.IGestorAutores;
import java.util.ArrayList;


public class GestorAutores implements IGestorAutores {
    

    private ArrayList<Autor> autores = new ArrayList<>();
    private ArrayList<Profesor> profesores = new ArrayList<>();
    private ArrayList<Alumno> alumnos = new ArrayList<>();
    
    private static GestorAutores instance;

    public static GestorAutores crear(){
        if(instance==null)
            instance = new GestorAutores();
        return instance;
    }

    @Override
    public String nuevoAutor(int dni, String apellidos, String nombres, Cargo cargo, String clave, String claveRepetida) {
        if((dni!=0)&&(apellidos!=null)&&(!"".equals(apellidos))&&(nombres!=null)&&(!"".equals(nombres))&&(cargo!=null)&&(clave.equals(claveRepetida))){
            Autor t = new Profesor(dni, apellidos, nombres, clave, cargo);
            if(!this.autores.contains(t)){
                this.autores.add(t);
                this.profesores.add((Profesor) t);
                return AUTOR_OK;
            }
            else
                return AUTOR_REPEAT;
        }
        else
            return AUTOR_ERROR;
    }

    @Override
    public String nuevoAutor(int dni, String apellidos, String nombres, String cx, String clave, String claveRepetida) {
        if((dni!=0)&&(apellidos!=null)&&(!"".equals(apellidos))&&(nombres!=null)&&(!"".equals(nombres))&&(cx!=null)&&(!"".equals(cx))&&(clave.equals(claveRepetida))){
            Autor t = new Alumno(dni, apellidos, nombres, clave, cx);
            if(!this.autores.contains(t)){
                this.autores.add(t);
                this.alumnos.add((Alumno) t);
                return AUTOR_OK;
            }
            else
                return AUTOR_REPEAT;
        }
        else
            return AUTOR_ERROR;
    }

    @Override
    public String modificarAutor(Autor autor, String apellidos, String nombres, Cargo cargo, String clave, String claveRepetida) {
        if((autor!=null)&&(apellidos!=null)&&(!"".equals(apellidos))&&(nombres!=null)&&(!"".equals(nombres))&&(cargo!=null)&&(clave.equals(claveRepetida))){
            if(this.autores.contains(autor)){
                Profesor profesor = (Profesor) autor;
                autor.setApellidos(apellidos);
                autor.setNombres(nombres);
                autor.setClave(clave);
                profesor.setCargo(cargo);
                return AUTOR_MODIFIED;
            }
            else
                return AUTOR_NOTFOUND;
        }
        else
            return AUTOR_ERROR;
    }

    @Override
    public String modificarAutor(Autor autor, String apellidos, String nombres, String cx, String clave, String claveRepetida) {
        if((autor!=null)&&(apellidos!=null)&&(!"".equals(apellidos))&&(nombres!=null)&&(!"".equals(nombres))&&(cx!=null)&&(!"".equals(cx))&&(clave.equals(claveRepetida))){
            if(this.autores.contains(autor)){
                Alumno alumno = (Alumno) autor;
                autor.setApellidos(apellidos);
                autor.setNombres(nombres);
                autor.setClave(clave);
                alumno.setCx(cx);
                return AUTOR_MODIFIED;
            }
            else
                return AUTOR_NOTFOUND;
        }
        else
            return AUTOR_ERROR;
    }

    @Override
    public boolean existeEsteAutor(Autor autor) {
        return autores.contains(autor);
    }

    @Override
    public ArrayList<Autor> verAutores() {
        return autores;
    }

    @Override
    public ArrayList<Profesor> verProfesores() {
        return profesores;
    }

    @Override
    public ArrayList<Alumno> verAlumnos() {
        return alumnos;
    }

    @Override
    public Autor verAutor(int dni) {
        for(Autor a : autores){
            if(a.getDni()==dni)
                return a;
        }
    return null; 
    }
    

    @Override
    public String borrarProfesores(Autor profesor) {
         if(profesores.contains(profesor)){
        profesores.remove(profesor);
        autores.remove(profesor);
            return BORRAR_OK;
                
        }
        else return AUTOR_NOTFOUND;
        
    }

    @Override
    public String borrarAlumnos(Autor alumno) {
        if(alumnos.contains(alumno)){
        alumnos.remove(alumno);
        autores.remove(alumno);
            return BORRAR_OK;
                
        }
        else return AUTOR_NOTFOUND;
    }

}
