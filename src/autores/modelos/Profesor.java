package autores.modelos;

import grupos.modelos.MiembroEnGrupo;

public class Profesor extends Autor{

    private Cargo cargo;
    private MiembroEnGrupo meg;
    
    public Profesor (int d, String apellidos, String nombres, String clave, Cargo cargo){
        super(d, apellidos, nombres, clave);
        this.cargo = cargo;
    }
        
    
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Cargo: " + cargo + "\n");
    }
        
}