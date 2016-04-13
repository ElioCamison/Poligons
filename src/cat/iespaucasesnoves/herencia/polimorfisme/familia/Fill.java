/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iespaucasesnoves.herencia.polimorfisme.familia;

/**
 *
 * @author Elio
 */
public class Fill extends Pare{
    public Fill() {
        System.out.println("Constructor del fill");
    }
    
    public void comu(){
        System.out.println("Som el mètode comú de la classe Fill");
    }  
    public void identitat(){
        System.out.println("Som de la classe Fill");
    }
    
    public static void estatic() {
        System.out.println("Som el mètode estatic de la classe Fill");
    }
}
