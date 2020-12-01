
package autores.modelos;

import grupos.modelos.Grupo;
import grupos.modelos.MiembroEnGrupo;
import interfaces.IGestorAutores;
import interfaces.IGestorPublicaciones;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import publicaciones.modelos.GestorPublicaciones;


public class GestorAutores implements IGestorAutores {
    

    private List<Autor> autores = new ArrayList<>();
    private List<Profesor> profesores = new ArrayList<>();
    private List<Alumno> alumnos = new ArrayList<>();
    
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
    public String borrarAutor(Autor autor) {
        IGestorPublicaciones gp= GestorPublicaciones.crear();
        if(!gp.hayPublicacionesConEsteAutor(autor))
        {
            autores.remove(autor);
            
            if(alumnos.contains(autor))
                alumnos.remove(autor);
            else if(profesores.contains(autor))
                profesores.remove(autor);
            
            return BORRAR_OK;
        }
        else
        {
            return BORRAR_ERROR;
        }

    }

    @Override
    public List<Profesor> buscarProfesores(String apellidos) {
      List<Profesor> profesoresBuscar = new ArrayList<> ();
      for(Profesor profesor: profesores)
      {
          if(profesor.getApellidos().contains(apellidos))
          {
              profesoresBuscar.add(profesor);
          }
      }
      Comparator<Profesor> cp = (p1, p2) -> p1.toString().compareTo(p2.toString());
      profesoresBuscar.sort(cp);
      return profesoresBuscar;
    }

    @Override
    public List<Alumno> buscarAlumnos(String apellidos) {
      List<Alumno> alumnosBuscar = new ArrayList<> ();
      for(Alumno alumno: alumnos)
      {
          if(alumno.getApellidos().contains(apellidos))
          {
              alumnosBuscar.add(alumno);
          }
      }
      Comparator<Alumno> ca = (a1, a2) -> a1.toString().compareTo(a2.toString());
      alumnosBuscar.sort(ca);
      return alumnosBuscar;
    }

    @Override
    public List<Autor> verAutores() {
        Comparator<Autor> ca = (a1, a2) -> a1.toString().compareTo(a2.toString());
        this.autores.sort(ca);
        return this.autores;
    }

    @Override
    public List<Profesor> verProfesores() {
        Comparator<Profesor> cp = (p1, p2) -> p1.toString().compareTo(p2.toString());
        this.profesores.sort(cp);
        return this.profesores;
    }

    @Override
    public List<Alumno> verAlumnos() {
        Comparator<Alumno> ca = (a1, a2) -> a1.toString().compareTo(a2.toString());
        this.alumnos.sort(ca);
        return this.alumnos;
    }

    @Override
    public boolean hayAutoresConEsteGrupo(Grupo grupo) {
        for(Autor autor: autores)
        {
            for(MiembroEnGrupo meg: autor.getMeg())
            {
                if(meg.getGrupo().equals(grupo))
                    return true;
            }
        }
        return false;
    }



    @Override
    public Autor verAutor(int dni) {
        for(Autor a : autores){
            if(a.getDni()==dni)
                return a;
        }
    return null; 
    }
    

}
