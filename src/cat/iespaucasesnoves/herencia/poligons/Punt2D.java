/*
 * Crea una classe que representi un punt 2D. Haurà de guardar les coordenades X i Y d'aquest punt. 
 * El punt s'inicialitzarà amb el constructor i una vegada creat no es podrà modificar.
 */
package cat.iespaucasesnoves.herencia.poligons;

/**
 *
 * @author Elio
 */
public class Punt2D {
    private int x ;
    private int y ;

    public Punt2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Punt2D{" + "x=" + x + ", y=" + y + '}';
    }
    
    
}
