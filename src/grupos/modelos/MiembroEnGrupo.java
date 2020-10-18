
package grupos.modelos;

import autores.modelos.*;

public class MiembroEnGrupo {
    private Grupo grupo;
    private Rol rol;
    private Autor autor;

 
public MiembroEnGrupo (Autor a, Grupo g, Rol r)
{
this.autor=a;
this.grupo = g;
this.rol = r;  

}

public void mostrar()
{
    autor.mostrar();
    grupo.mostrar();
}
public void mostrarmiembro()
{
    autor.mostrar();
}
}
