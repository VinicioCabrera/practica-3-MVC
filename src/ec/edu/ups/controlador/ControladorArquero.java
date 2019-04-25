/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.clases.Arquero;
import java.util.SortedSet;
import java.util.TreeSet;

 /*
* @version 2.0
 * @since 2019
 * @author Vinicio campoverde
 
*/
public class ControladorArquero {
    private SortedSet<Arquero> lista;
    private int codigo;

    public ControladorArquero() {
    
        lista=new TreeSet<>();
        codigo =0;
    }
    
    
    public void cread(Arquero arquero){
    
        codigo++;
        arquero.setCodigoPersona(codigo);
        lista.add(arquero);
        
    }
    
    public Arquero read(int codigo){
    
        for (Arquero arquero : lista) {
            
            if (arquero.getCodigoPersona()==codigo){
            
                return arquero;
               
            }
        }
        return null;
    }
    
    public void update(Arquero arquero){
    
        if(lista.contains(arquero)){
        
            lista.remove(arquero);
            lista.add(arquero);
        }
    }
    
    public void delete(int codigo){
    
        for (Arquero arquero : lista) {
            if (arquero.getCodigoPersona()==codigo){
            
                lista.remove(arquero);
                break;
            }
        }
    }
    
    public void impTodo(){
    
        System.out.println("imprimiendo en orden");
        for (Arquero arquero : lista) {
            System.out.println(arquero);
        }
    
    } 
}
