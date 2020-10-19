
package grupos.modelos;

import autores.modelos.*;
import java.util.Objects;

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
public void mostrarRol()
{
    System.out.println("Rol: "+rol);
}

public void mostrarGrupos()
{
    grupo.mostrar();
}
public void mostrar()
{
    autor.verNyA();
    grupo.mostrar();
}
public void mostrarmiembro()
{
    autor.mostrar();
}
public void mostrarMiembroyRol()
{
    autor.mostrar();
    System.out.println("Rol:"+rol);
}


public Grupo verGrupo()
{
    return this.grupo;
}

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.grupo);
        hash = 53 * hash + Objects.hashCode(this.autor);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MiembroEnGrupo other = (MiembroEnGrupo) obj;
        if (!Objects.equals(this.grupo, other.grupo)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        return true;
    }


}
