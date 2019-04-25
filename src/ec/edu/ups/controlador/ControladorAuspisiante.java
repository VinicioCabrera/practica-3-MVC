/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;
import ec.edu.ups.clases.Auspisiante;
import java.util.HashSet;
import java.util.Set;

 /*
* @version 2.0
 * @since 2019
 * @author Vinicio campoverde
 
*/
public class ControladorAuspisiante {
  private Set<Auspisiante> lista;
    int codigo;

    public ControladorAuspisiante() {
    
        lista=new HashSet<>();
        codigo=0;
    }
    
    public void cread(Auspisiante auspisiante){
    
        codigo++;
        auspisiante.setCodigoPersona(codigo);
        lista.add(auspisiante);
    }
    
    public Auspisiante read(int codigo){
    
        for (Auspisiante auspisiante : lista) {
            if (auspisiante.getCodigoPersona()==codigo){
            
                return auspisiante;
            }
        }
        return null;
    }
    
    public void update(Auspisiante auspisiante){
    
        if (lista.contains(auspisiante)){
        
            lista.remove(auspisiante);
            lista.add(auspisiante);
        }
    }
    
    public void remove(int codigo){
    
        for (Auspisiante auspisiante : lista) {
            
            if (auspisiante.getCodigoPersona()==codigo){
            
                lista.remove(auspisiante);
                break;
            }
        }
    }   
}
