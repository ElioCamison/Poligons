/*
 *Crea una classe amb main.
1.Crea un mètode que rebi com a paràmetre un Poligon2D. Aquest mètode ha de mostrar les dades del polígon i la seva àrea.
2.Al main crea un triangle i un quadrat.
3.Passa el triangle i el quadrat al mètode creat anteriorment.
 */
package cat.iespaucasesnoves.herencia.poligons;

/**
 *
 * @author Elio
 */
public class Main {
    
    public void rebrePoligon(Poligon2D poli){
        poli.pinta();
        poli.calcularArea();
        
    }

    public static void main(String[] args) {
        Punt2D punt1 = new Punt2D(3,5);
        Punt2D punt2 = new Punt2D(6,10);
        Punt2D punt3 = new Punt2D(9,15);
        Punt2D punt4 = new Punt2D(12,20);
        Punt2D punt5 = new Punt2D(15,25);
        Triangle tri1 = new Triangle(punt1,punt2,punt3,3,5);
        Quadrat qua1 = new Quadrat(5,punt1,punt2,punt3,punt4);
        Main obj = new Main();
        obj.rebrePoligon(tri1);
        obj.rebrePoligon(qua1);
        System.out.println(tri1 instanceof Poligon2D);
    }

}
