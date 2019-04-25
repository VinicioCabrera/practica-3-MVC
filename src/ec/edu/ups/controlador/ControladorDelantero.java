/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.clases.Delantero;
import java.util.HashMap;
import java.util.Map;

 /*
* @version 2.0
 * @since 2019
 * @author Vinicio campoverde
 * @see http://ups.edu.ec
*/
public class ControladorDelantero {
  private Map<Integer,Delantero> mapa;
    private int codigo;

    public ControladorDelantero() {
    
        codigo=0;
        mapa=new HashMap<>();
    }
    
    
    public void Creat(Delantero delantero){
    
        codigo++;
        delantero.setCodigoPersona(codigo);
        mapa.put(codigo, delantero);
        
    }
    
    public Delantero read(int codigo){
    
        for (Map.Entry<Integer, Delantero> bici : mapa.entrySet()) {
            
            if (bici.getKey()==codigo){
            
                System.out.println(bici);
            }
        }
        return null;
    }
    
    public void update(Delantero delantero,int codigo){
    
        if (mapa.containsKey(codigo)){
        
            mapa.remove(codigo,delantero);
            mapa.put(codigo, delantero);
        }
    
    }
    
    public void delete(int codigo){
    
         for (Map.Entry<Integer, Delantero> bici : mapa.entrySet()) {
            
            if (bici.getKey()==codigo){
            
               mapa.remove(codigo);
               break;
            }
        }
    }
    
    public void leerTodo(){
    
        for (Map.Entry<Integer, Delantero> delantero : mapa.entrySet()) {
           
            System.out.println("codigo: "+delantero.getKey()+" ==>  Informacion: "+delantero.getValue());
        }
        
    }   
}
