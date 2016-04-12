/*
 * Crea una classe Triangle. 
 * Els objectes d'aquesta classe sempre tendran tres vèrtexs. A més, per calcular l'àrea necessitam conèixer la base i l'altura.
 * AREA = B*A/2
 */
package cat.iespaucasesnoves.herencia.poligons;

import java.util.ArrayList;

/**
 *
 * @author Elio
 */
public final class Triangle extends Poligon2D {

    private int base;
    private int altura;

    public Triangle(Punt2D a, Punt2D b, Punt2D c, int base, int altura) {
        super(a, b, c);
        this.base = base;
        this.altura = altura;

    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    @Override
    public int calcularArea() {
        int area = (base * altura) / 2;
        return area;
    }
    
    
}
