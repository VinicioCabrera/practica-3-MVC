
package ec.edu.ups.controlador;

import ec.edu.ups.clases.Abonado;
import java.util.ArrayList;
import java.util.List;



public class ControladorAbonado {
private List<Abonado> lista;

    public ControladorAbonado() {
        lista=new ArrayList<>();
    }
    
    public void creat(Abonado abonado){
    
        lista.add(abonado);
    }
    
    public Abonado read(int codigo){
    
        for (Abonado abonado : lista) {
            if (abonado.getCodigoPersona()==codigo){
            return abonado;
            }
        }
        return null;
    }

    public void update(Abonado abonado){

        for (int i = 0; i < lista.size(); i++) {
            Abonado elemento=lista.get(i);
            if(elemento.getCodigoPersona()==abonado.getCodigoPersona()){
            
                lista.set(i, abonado);
                break;
            }
        }
    }
    
    
    public void delete(int codigo){
    
        for (int i = 0; i < lista.size(); i++) {
            Abonado elemento = lista.get(i);
            
            if(elemento.getCodigoPersona()==codigo){
            
                lista.remove(i);
                break;
            }
        }
    }    
}
