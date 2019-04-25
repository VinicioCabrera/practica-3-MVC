/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import ec.edu.ups.interfaz.Interfaz;
import java.util.Date;

/**
 * @version 2.0
 * @since 2019
 * @author Vinicio campoverde
 * @see http://ups.edu.ec
 */
public final class Delantero extends Jugador implements Interfaz {
 private int promediogoles;
 private int remates;
 private int pasesCompletos;
 private int tirosEsquina;

    public Delantero() {
    }

    public Delantero(int promediogoles, int remates, int pasesCompletos, int tirosEsquina) {
        this.promediogoles = promediogoles;
        this.remates = remates;
        this.pasesCompletos = pasesCompletos;
        this.tirosEsquina = tirosEsquina;
    }

    public Delantero(int promediogoles, int remates, int pasesCompletos, int tirosEsquina, String cedula, String Posicion, int codigoPersona, String nombre, String cargo, String Apellido, int edad) {
        super(cedula, Posicion, codigoPersona, nombre, cargo, Apellido, edad);
        this.promediogoles = promediogoles;
        this.remates = remates;
        this.pasesCompletos = pasesCompletos;
        this.tirosEsquina = tirosEsquina;
    }
    
    public int getPromediogoles() {
        return promediogoles;
    }

    public int getRemates() {
        return remates;
    }

    public int getPasesCompletos() {
        return pasesCompletos;
    }

    public int getTirosEsquina() {
        return tirosEsquina;
    }

    public void setPromediogoles(int promediogoles) {
        this.promediogoles = promediogoles;
    }

    public void setRemates(int remates) {
        this.remates = remates;
    }

    public void setPasesCompletos(int pasesCompletos) {
        this.pasesCompletos = pasesCompletos;
    }

    public void setTirosEsquina(int tirosEsquina) {
        this.tirosEsquina = tirosEsquina;
    }

    @Override
    public String toString() {
        return "Delantero{" + "promediogoles=" + promediogoles + ", remates=" + remates + ", pasesCompletos=" + pasesCompletos + ", tirosEsquina=" + tirosEsquina + '}';
    }
    

    @Override
    public String estadio() {
       return "Codigo asientos"; 
    }

    @Override
    public String bolones() {
        return "Codigo balones";
    }

    @Override
    public String goles() {
        return "Cantidad goles";
    }

}
