package autores.modelos;

import grupos.modelos.MiembroEnGrupo;

public class Profesor extends Autor{

    private Cargo cargo;
    private MiembroEnGrupo meg;
    
    public Profesor (int d, String apellidos, String nombres, String clave, Cargo cargo){
        super(d, apellidos, nombres, clave);
        this.cargo = cargo;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }


    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    
        
    
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Cargo: " + cargo + "\n");
    }
        
}