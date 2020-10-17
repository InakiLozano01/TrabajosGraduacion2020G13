package principal.controladores;

import java.util.ArrayList;
import autores.modelos.*;
import grupos.modelos.Grupo;
import idiomas.modelos.Idioma;
import lugares.modelos.Lugar;
import palabrasclaves.modelos.PalabraClave;
import tipos.modelos.Tipo;
import autores.vistas.*;
import grupos.vistas.*;
import idiomas.vistas.*;
import lugares.vistas.*;
import palabrasclaves.vistas.*;
import tipos.vistas.*;



public class ControladorPrincipal {
    
    public static void main (String[] args)
    {
        ArrayList<Alumno> alumnos_array = new ArrayList<>();
        ArrayList<Profesor> profesor_array = new ArrayList<>();
        ArrayList<Grupo> grupo_array = new ArrayList<>();
        ArrayList<Idioma> idioma_array = new ArrayList<>();
        ArrayList<Lugar> lugar_array = new ArrayList<>();
        ArrayList<PalabraClave> palabraclave_array = new ArrayList<>();
        ArrayList<Tipo> tipo_array = new ArrayList<>();
        
        Alumno unalumno1 = new Alumno(43363245,"0001","yella","Pepe","Garcia");
        alumnos_array.add(unalumno1);

        Alumno unalumno2 = new Alumno(43363246,"0002","yel","Pepa","Lopez");
        alumnos_array.add(unalumno2);
        
        for(Alumno i: alumnos_array)
        {
            i.mostrar();
        }
        
        VentanaAMGrupo ventanaGrupo = new VentanaAMGrupo(null); //se instancia la ventana
        ventanaGrupo.setLocationRelativeTo(null); //se centra la ventana
        ventanaGrupo.setVisible(true); //se hace visible la ventana

        VentanaAMAlumno ventanaAlumno = new VentanaAMAlumno(null); //se instancia la ventana
        ventanaAlumno.setLocationRelativeTo(null); //se centra la ventana
        ventanaAlumno.setVisible(true); //se hace visible la ventana   
        
        VentanaAMProfesor ventanaProfesor = new VentanaAMProfesor(null); //se instancia la ventana
        ventanaProfesor.setLocationRelativeTo(null); //se centra la ventana
        ventanaProfesor.setVisible(true); //se hace visible la ventana        
       
        VentanaAIdioma ventanaIdioma = new VentanaAIdioma(null); //se instancia la ventana
        ventanaIdioma.setLocationRelativeTo(null); //se centra la ventana
        ventanaIdioma.setVisible(true); //se hace visible la ventana                
        
        VentanaALugar ventanaLugar = new VentanaALugar(null); //se instancia la ventana
        ventanaLugar.setLocationRelativeTo(null); //se centra la ventana
        ventanaLugar.setVisible(true); //se hace visible la ventana                        

        VentanaAPalabraClave ventanaPalabraClave = new VentanaAPalabraClave(null); //se instancia la ventana
        ventanaPalabraClave.setLocationRelativeTo(null); //se centra la ventana
        ventanaPalabraClave.setVisible(true); //se hace visible la ventana                                

        VentanaATipo ventanaTipo = new VentanaATipo(null); //se instancia la ventana
        ventanaTipo.setLocationRelativeTo(null); //se centra la ventana
        ventanaTipo.setVisible(true); //se hace visible la ventana   

        
    }
    
}
