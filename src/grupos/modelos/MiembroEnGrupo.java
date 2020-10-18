
package grupos.modelos;

import autores.modelos.Profesor;

public class MiembroEnGrupo {
    private Profesor profesor;
    private Grupo grupo;
    private Rol rol;

 
public MiembroEnGrupo (Profesor p, Grupo g, Rol r)
{
this.profesor = p;
this.grupo = g;
this.rol = r;     
}

public void mostrar()
{
    profesor.mostrar();
    grupo.mostrar();
}

}
