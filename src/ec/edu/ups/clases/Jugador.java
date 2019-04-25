/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;
import java.util.Date;
/**
 * @version 2.0
 * @since 2019
 * @author Vinicio campoverde
 * @see http://ups.edu.ec
 */
public abstract class Jugador extends Persona {
private String cedula;
private Date fechaContratacion;
private String Posicion; 

    public Jugador() {
    }

    public Jugador(String cedula, String Posicion) {
        this.cedula = cedula;
        this.Posicion = Posicion;
    }

    public Jugador(String cedula, String Posicion, int codigoPersona, String nombre, String cargo, String Apellido, int edad) {
        super(codigoPersona, nombre, cargo, Apellido, edad);
        this.cedula = cedula;
        this.Posicion = Posicion;
    }

    public String getCedula() {
        return cedula;
    }

    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    public String getPosicion() {
        return Posicion;
    }


    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public void setPosicion(String Posicion) {
        this.Posicion = Posicion;
    }

    @Override
    public String toString() {
        return super.toString()+"Jugador{" + ", cedula=" + cedula + ", fechaContratacion=" + fechaContratacion + ", Posicion=" + Posicion + '}';
    }
 public abstract String goles();
  
}

