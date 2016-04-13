/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iespaucasesnoves.herencia.polimorfisme;

import cat.iespaucasesnoves.herencia.polimorfisme.familia.Fill;
import cat.iespaucasesnoves.herencia.polimorfisme.familia.Net;
import cat.iespaucasesnoves.herencia.polimorfisme.familia.Pare;
/**
 *
 * @author Elio
 */
public class Principal {
    
    public void mostrarComu (Pare object){
        System.out.println(object.getClass());
    }
    
    public void objectePare (Pare object){
//        System.out.println("BLALBLALBLA");
//        System.out.println(object.getClass());
        System.out.println((object instanceof Net));
    }
    
    public static void mostrarEstaticPare (Pare object){
        
    }
    
    
    
    public static void main(String[] args){
        Net net1 = new Net();
        Pare pare1 = new Pare();
        Fill fill1 = new Fill();
        Principal o = new Principal();
        o.objectePare(net1);
        o.mostrarComu(net1);
        o.mostrarComu(pare1);
        o.mostrarComu(fill1);
    }
}
