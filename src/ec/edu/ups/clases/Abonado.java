/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;
import ec.edu.ups.interfaz.Interfaz;

/**
 *
 * @author Usuario
 */
public final class Abonado extends Socio implements Interfaz {

private double costo;
private int NumeroAbono;
private int id;

    public Abonado() {
    }

    public Abonado( double costo, int NumeroAbono) {
        this.costo = costo;
        this.NumeroAbono = NumeroAbono;
      
    }

    public Abonado(double costo, int NumeroAbono, int id, String tipo, String tiempoSocio, int codigoPersona, String nombre, String cargo, String Apellido, int edad) {
        super(tipo, tiempoSocio, codigoPersona, nombre, cargo, Apellido, edad);
        this.costo = costo;
        this.NumeroAbono = NumeroAbono;
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public double getCosto() {
        return costo;
    }

    public int getNumeroAbono() {
        return NumeroAbono;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void setNumeroAbono(int NumeroAbono) {
        this.NumeroAbono = NumeroAbono;
    }

    @Override
    public String toString() {
        return super.toString()+ "Abonado{" + "costo=" + costo + ", NumeroAbono=" + NumeroAbono + ", id=" + id + '}';
     
    }
    @Override
    public String estadio() {
    return "Capacidad del Estadio"; 
    }

    @Override
    public String bolones() {
     return "Cantidad de balones";   
    }

    @Override
    public String cuentas() {
        return "Ganancias";
    }
 
}
