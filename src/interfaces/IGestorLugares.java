
package interfaces;

import java.util.ArrayList;
import palabrasclaves.modelos.PalabraClave;


public interface IGestorLugares {
    public String nuevaPalabraClave(String nombre);
    
public ArrayList<PalabraClave> verPalabrasClaves();
public PalabraClave verPalabraClave(String nombre);
    
}
