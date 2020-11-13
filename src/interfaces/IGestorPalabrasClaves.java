
package interfaces;

import java.util.ArrayList;
import palabrasclaves.modelos.PalabraClave;

public interface IGestorPalabrasClaves {
    public String nuevaPalabraClave(String nombre);
    
public ArrayList<PalabraClave> verPalabrasClaves();
public PalabraClave verPalabraClave(String nombre);
}
