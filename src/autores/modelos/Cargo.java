package autores.modelos;

public enum Cargo {
    TITULAR("Titular"),
    ASOCIADO("Asociado"),
    ADJUNTO("Adjunto"),
    JTP("Jefe de trabajos practicos"),
    ADG("Aux. docente graduado");
    
    private String valor;
    
    private Cargo(String valor)
    {
        this.valor=valor;
    }
    
    @Override
    public String toString()
    {
        return this.valor;
    }
}
