/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iespaucasesnoves.herencia.personal;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author Elio
 */
public class Persona {

    protected String nom;
    protected Date dataNaixement;
    protected String dni;

    public Persona(String nom, String dni, Date dataNaixement) {
        this.nom = nom;
        this.dni = dni;
        this.dataNaixement = dataNaixement;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDataNaixement() {
        return dataNaixement;
    }

    public void setDataNaixement(Date dataNaixement) {
        this.dataNaixement = dataNaixement;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

}
