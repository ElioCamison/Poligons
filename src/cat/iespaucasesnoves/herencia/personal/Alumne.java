/*
 * Crea al paquet cat.iespaucasesnoves.herencia.personal una subclasse de Persona anomenada Alumne. 
 * Afegeix els atributs cicle i curs.
 */
package cat.iespaucasesnoves.herencia.personal;

import java.util.Date;

/**
 *
 * @author Elio
 */
public class Alumne extends Persona {

    private String cicle;
    private int curs;

    public Alumne(String cicle, int curs, String nom, String dni, Date dataNaixement) {
        super(nom, dni, dataNaixement);
        this.cicle = cicle;
        this.curs = curs;
    }

    
    
    
    
}
