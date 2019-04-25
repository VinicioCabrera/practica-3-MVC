/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;



/**
 * @version 2.0
 * @since 2019
 * @author Vinicio campoverde
 
 */
public class Persona implements Comparable<Persona>{
 private int codigoPersona;
 private String nombre;
 private String cargo;
 private String Apellido;
 private int  edad; 

    public Persona() {
    }

    public Persona(int codigoPersona, String nombre, String cargo, String Apellido, int edad) {
        this.codigoPersona = codigoPersona;
        this.nombre = nombre;
        this.cargo = cargo;
        this.Apellido = Apellido;
        this.edad = edad;
    }
 
  
 
    public int getCodigoPersona() {
        return codigoPersona;
    }
    public String getNombre() {
        return nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public String getApellido() {
        return Apellido;
    }

    public int getEdad() {
        return edad;
    }
    public void setCodigoPersona(int codigoPersona) {
        this.codigoPersona = codigoPersona;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", cargo=" + cargo + ", Apellido=" + Apellido + ", edad=" + edad + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.codigoPersona;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.codigoPersona != other.codigoPersona) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Persona o) {
         if (nombre.compareTo(o.getNombre())>=1){
        
            return 1;
        }else if(nombre.compareTo(o.getNombre())<=1){
            return -1;
        }else {
        
            return 0;
        }
           
    }
 
}
