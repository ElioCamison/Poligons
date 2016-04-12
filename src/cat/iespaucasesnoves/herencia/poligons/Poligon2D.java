/*
 *  Crea una classe que representi un polígon en 2D. Està format per una sèrie de punts. 
 * 1.Hem de saber quants vèrtexs té el polígon i quins són. Es suposa que ens el donaran seguits, 
 de manera que podrem pintar el polígon unint les parelles de vèrtexs consecutius. 
 *  De moment es suposa que ens donaran el nombre adequat de punts. El constructor rebrà els punts i no es podran modificar.
 * 2.El polígon tendrà un mètode pinta, que de moment només mostrarà els punts per pantalla.
 * 3.El polígon tendrà un mètode per calcular la seva àrea. De moment només el definirem, no el programarem.
 */
package cat.iespaucasesnoves.herencia.poligons;

import java.util.ArrayList;

/**
 *
 * @author Elio
 */
public class Poligon2D {

    private ArrayList<Punt2D> puntsPoligon;

    public Poligon2D(Punt2D... puntsPoligon) {
        this.puntsPoligon = new ArrayList<>();
        for (int i = 0; i < puntsPoligon.length; i++) {
            this.puntsPoligon.add(puntsPoligon[i]);
        }
    }

    public ArrayList<Punt2D> getPuntsPoligon() {
        return puntsPoligon;
    }

    public void pinta() {
        for (int i = 0; i < puntsPoligon.size(); i++) {
            System.out.println(puntsPoligon.get(i));
        }
    }

    public int calcularArea() {
        return 0;
    }

   
    
    
}
