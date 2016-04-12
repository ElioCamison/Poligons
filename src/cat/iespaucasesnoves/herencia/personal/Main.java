/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iespaucasesnoves.herencia.personal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Elio
 */
public class Main {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf;
        sdf = new SimpleDateFormat("d/M/y");
        Date d = sdf.parse("12/11/2005");
        Alumne nou = new Alumne("S1W", 1, "Tomeu", "43194116R", d);
        System.out.println(nou.nom+"  " +"  "+ nou.dni);
        System.out.println("Hem canviat els modifcador d'accés dels atributs de Persona per poder accedir d'una subclasse.\nIgual que hem fet amb els atributs de Persona hauriem de fer el mateix amb els d'alumne. Haurien  de ser protected o public");
    }
}
