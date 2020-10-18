
package grupos.modelos;

import autores.modelos.*;

public class MiembroEnGrupo {
    private Profesor profesor;
    private Grupo grupo;
    private Rol rol;
    private Alumno alumno;

 
public MiembroEnGrupo (Profesor p, Grupo g, Rol r, Alumno a)
{
this.profesor = p;
this.grupo = g;
this.rol = r;  
this.alumno=a;
}

public void mostrar()
{
    profesor.mostrar();
    grupo.mostrar();
}

}
