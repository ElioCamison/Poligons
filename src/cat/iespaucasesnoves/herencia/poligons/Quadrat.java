/*
 * Crea una classe Quadrat. Els objectes d'aquesta classe sempre tendran quatre vèrtexs. 
 * A més, per calcular l'àrea necessitam conèixer la longitud del costat. Àrea=costat x costat
 */
package cat.iespaucasesnoves.herencia.poligons;

/**
 *
 * @author Elio
 */
public final class Quadrat extends Poligon2D {

    private int longitud;

    public Quadrat(int longitud, Punt2D a, Punt2D b, Punt2D c, Punt2D d) {
        super(a, b, c, d);
        this.longitud = longitud;
    }

    public int getLongitud() {
        return longitud;
    }

    @Override
    public int calcularArea() {
        int area = (longitud * longitud);
        return area;
    }
}
