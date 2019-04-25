/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import ec.edu.ups.interfaz.Interfaz;


/**
 * @version 2.0
 * @since 2019
 * @author Vinicio campoverde
 */
public final class Auspisiante extends Socio implements Interfaz{

private String nombreAuspiciante;
private double aportacion;
private String materiaDeportivo; 

    public Auspisiante() {
    }

    public Auspisiante(String nombreAuspiciante, double aportacion, String materiaDeportivo) {
        this.nombreAuspiciante = nombreAuspiciante;
        this.aportacion = aportacion;
        this.materiaDeportivo = materiaDeportivo;
    }

    public Auspisiante(String nombreAuspiciante, double aportacion, String materiaDeportivo, String tipo, String tiempoSocio, int codigoPersona, String nombre, String cargo, String Apellido, int edad) {
        super(tipo, tiempoSocio, codigoPersona, nombre, cargo, Apellido, edad);
        this.nombreAuspiciante = nombreAuspiciante;
        this.aportacion = aportacion;
        this.materiaDeportivo = materiaDeportivo;
    }

    public String getNombreAuspiciante() {
        return nombreAuspiciante;
    }

    public double getAportacion() {
        return aportacion;
    }

    public String getMateriaDeportivo() {
        return materiaDeportivo;
    }

    public void setNombreAuspiciante(String nombreAuspiciante) {
        this.nombreAuspiciante = nombreAuspiciante;
    }

    public void setAportacion(double aportacion) {
        this.aportacion = aportacion;
    }

    public void setMateriaDeportivo(String materiaDeportivo) {
        this.materiaDeportivo = materiaDeportivo;
    }

    @Override
    public String toString() {
        return super.toString()+ ", nombreAuspiciante=" + nombreAuspiciante + ", aportacion=" + aportacion + ", materiaDeportivo=" + materiaDeportivo + '}';
    }

    @Override
    public String estadio() {
        return "Nombre estadio";
    }

    @Override
    public String bolones() {
       return "Nombre balones" ;
    }

    @Override
    public String cuentas() {
        return "Gastos";
    }

}
