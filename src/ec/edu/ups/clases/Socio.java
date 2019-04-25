/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public abstract class Socio extends Persona {
 private String tipo;
 private String tiempoSocio;
 private Date fechaSocio;  

    public Socio() {
    }

    public Socio(String tipo, String tiempoSocio, Date fechaSocio) {
        this.tipo = tipo;
        this.tiempoSocio = tiempoSocio;
        this.fechaSocio = fechaSocio;
    }

    public Socio(String tipo, String tiempoSocio, int codigoPersona, String nombre, String cargo, String Apellido, int edad) {
        super(codigoPersona, nombre, cargo, Apellido, edad);
        this.tipo = tipo;
        this.tiempoSocio = tiempoSocio;
        
    }
 
    public String getTipo() {
        return tipo;
    }

    public String getTiempoSocio() {
        return tiempoSocio;
    }

    public Date getFechaSocio() {
        return fechaSocio;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setTiempoSocio(String tiempoSocio) {
        this.tiempoSocio = tiempoSocio;
    }

    public void setFechaSocio(Date fechaSocio) {
        this.fechaSocio = fechaSocio;
    }

    @Override
    public String toString() {
        return super.toString()+"Socio{" + "tipo=" + tipo + ", tiempoSocio=" + tiempoSocio + ", fechaSocio=" + fechaSocio + '}';
    }
 
  public abstract String cuentas();
}
