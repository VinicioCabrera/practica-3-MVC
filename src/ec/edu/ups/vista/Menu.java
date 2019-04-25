/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;


import ec.edu.ups.clases.*;
import ec.edu.ups.controlador.*;
import java.util.Scanner;

 /*

 * @since 2019
 * @author Vinicio campoverde
 * @see http://ups.edu.ec
*/
public class Menu {
  public static void main(String[] args) {
            Scanner x=new Scanner(System.in);
            ControladorAbonado CAbo=new ControladorAbonado();
            ControladorAuspisiante CAus= new ControladorAuspisiante();
            ControladorArquero CArq=new ControladorArquero();
            ControladorDelantero CDel=new ControladorDelantero();
           
    int sub; 
    boolean prin=true;
        do{
        System.out.print(
                  "         MENU          \n"
                + "1. CRUD Abonado        \n"
                + "2. CRUD Auspisiante    \n"
                + "3. CRUD Arquero        \n"
                + "4. CRUD Delantero      \n"
                + "5. Salir               \n"
                + "***********************\n"
                + "ingrese su opcion:");
        int o=x.nextInt();
        switch(o){
           
            
            case 1:
            
                boolean salir = true;
                do{
                    subMenu1();
                    sub=x.nextInt();
                    
                    switch(sub){
                        case 1:
                            double cos;
                            int nuAbo,codigo,eda,id;
                            String tipo,tiempoSocio,nombre,Apellido,cargo;
                            
                            System.out.println("IGRESAR COSTO");
                            cos=x.nextDouble();
                            System.out.println("INGRESAR NUMERO ABONADO");
                            nuAbo=x.nextInt();
                            System.out.println("INGRESAR ID DE ABONO");
                            id=x.nextInt();
                            System.out.println("INGRESAR CODIGO");
                            codigo=x.nextInt();
                            System.out.println("INGRESAR EDAD");
                            eda=x.nextInt();
                            System.out.println("INGRESAR TIPO");
                            tipo=x.next();
                            System.out.println("INGRESAR TIPO DE SOCIO");
                            tiempoSocio=x.next();
                            System.out.println("INGRESAR NOMBRE");
                            nombre=x.next();
                            System.out.println("INGRESAR CARGO");
                            cargo=x.next();
                            System.out.println("INGRESAR APELLIDO");
                            Apellido=x.next();
                            Abonado abo=new Abonado(cos, nuAbo, id, tipo, tiempoSocio, codigo, nombre, cargo, Apellido, eda);
                            CAbo.creat(abo);
                            break;
                            
                        case 2:
                            
                            System.out.println("INGRESAR CODIGO ");
                            codigo=x.nextInt();
                            System.out.println("DATOS ABONADO:\n"+CAbo.read(codigo));
                            
                            break;
                            
                            
                        case 3:
                           
                            
                            System.out.println("IGRESAR COSTO");
                            cos=x.nextDouble();
                            System.out.println("INGRESAR NUMERO ABONADO");
                            nuAbo=x.nextInt();
                            System.out.println("INGRESAR ID DE ABONO");
                            id=x.nextInt();
                            System.out.println("INGRESAR CODIGO");
                            codigo=x.nextInt();
                            System.out.println("INGRESAR EDAD");
                            eda=x.nextInt();
                            System.out.println("INGRESAR TIPO");
                            tipo=x.next();
                            System.out.println("INGRESAR TIPO DE SOCIO");
                            tiempoSocio=x.next();
                            System.out.println("INGRESAR NOMBRE");
                            nombre=x.next();
                            System.out.println("INGRESAR CARGO");
                            cargo=x.next();
                            System.out.println("INGRESAR APELLIDO");
                            Apellido=x.next();
                            abo=new Abonado(cos, nuAbo, id, tipo, tiempoSocio, codigo, nombre, cargo, Apellido, eda);
                            CAbo.update(abo);
                            break;
                            case 4:
                            System.out.println("INGRESAR CODIGO PARA ELIMINAR");
                            codigo=x.nextInt();
                            CAus.remove(codigo);
                            break;
                            
                            case 5:
                            salir=false;
                            System.out.println("SALIR");
                            break;
                            
                    }
                }while(salir==true);
            
           
                break;
                
            case 2:
               salir=true;
                do{
                subMenu1();
                sub=x.nextInt();
                
                switch(sub){
                        case 1:
                            String nombreAuspiciante,materiaDeportivo,tiempoSocio,nombre,cargo,Apellido,tipo;
                            int eda,codPer;
                            double aport;
                            System.out.println("INGRESAR NOMBRE AUSPISIANTE");
                            nombreAuspiciante=x.next();
                            System.out.println("INGRESAR MATERIAL DEPORTIVO");
                            materiaDeportivo=x.next();
                            System.out.println("INGRESAR TIEMPO DEL SOCIO");
                            tiempoSocio=x.next();
                            System.out.println("INGRESAR NOMBRE");
                            nombre=x.next();
                            System.out.println("INGRESAR CARGO");
                            cargo=x.next();
                            System.out.println("INGRESAR APELLIDO");
                            Apellido=x.next();
                            System.out.println("INGRESAR TIPO");
                            tipo=x.next();
                            System.out.println("INGRESAR APORTACION");
                            aport=x.nextDouble();
                            System.out.println("INGRESAR CODIGO PERSONA ");
                            codPer=x.nextInt();
                            System.out.println("INGRESAR EDAD");
                            eda=x.nextInt();
                            Auspisiante aus=new Auspisiante(nombreAuspiciante, aport, materiaDeportivo, tipo, tiempoSocio, codPer, nombre, cargo, Apellido, eda);
                            CAus.cread(aus);
                        case 2:
                            
                            System.out.println("INGRESAR CODIGO ");
                            codPer=x.nextInt();
                            System.out.println("DATOS ABONADO:\n"+CAus.read(codPer));
                            
                            break;
                        case 3:
                            
                            System.out.println("INGRESAR NOMBRE AUSPISIANTE");
                            nombreAuspiciante=x.next();
                            System.out.println("INGRESAR MATERIAL DEPORTIVO");
                            materiaDeportivo=x.next();
                            System.out.println("INGRESAR TIEMPO DEL SOCIO");
                            tiempoSocio=x.next();
                            System.out.println("INGRESAR NOMBRE");
                            nombre=x.next();
                            System.out.println("INGRESAR CARGO");
                            cargo=x.next();
                            System.out.println("INGRESAR APELLIDO");
                            Apellido=x.next();
                            System.out.println("INGRESAR TIPO");
                            tipo=x.next();
                            System.out.println("INGRESAR APORTACION");
                            aport=x.nextDouble();
                            System.out.println("INGRESAR CODIGO PERSONA ");
                            codPer=x.nextInt();
                            System.out.println("INGRESAR EDAD");
                            eda=x.nextInt();
                            aus=new Auspisiante(nombreAuspiciante, aport, materiaDeportivo, tipo, tiempoSocio, codPer, nombre, cargo, Apellido, eda);
                            CAus.update(aus);
                            
                            break;
                        case 4:
                            System.out.println("INGRESAR CODIGO PARA ELIMINAR ");
                            codPer=x.nextInt();
                            CAus.remove(codPer);
                            break;
                            
                        case 5:
                            salir=false;
                            System.out.println("SALIR");
                            break;
                            
                    }
                }while(salir==true);
                
                break;
                
                
                
            case 3:
                salir =true;
                do{
                subMenu2();
                sub=x.nextInt();
                
                switch(sub){
                
                    case 1: 
                        int porcentajeTapadas,guantes,codiPer,edad;
                        double tamaño;
                        String cedula,nombre,Apellido,cargo,Posicion;
                        System.out.println("INGRESAR PORCENTAJE DE TAPADAS");
                        porcentajeTapadas=x.nextInt();
                        System.out.println("INGRESAR SAQUE DE ARCO");
                        sub=x.nextInt();
                        System.out.println("INGRESAR GUANTES COLOCADOS EN PARTIDO");
                        guantes=x.nextInt();
                        System.out.println("INGRESAR CODIGO DE LA PERSONA");
                        codiPer=x.nextInt();
                        System.out.println("INGRESAR EDAD");
                        edad=x.nextInt();
                        System.out.println("INGRESAR TAMAÑO JUGADOR ");
                        tamaño=x.nextDouble();
                        System.out.println("INGRESAR CEDULA");
                        cedula=x.next();
                        System.out.println("INGRESAR POSICION");
                        Posicion=x.next();
                        System.out.println("INGRESAR NOMBRE");
                        nombre=x.next();
                        System.out.println("INGRESAR APELLIDO");
                        Apellido=x.next();
                        System.out.println("INGRESAR CARGO");
                        cargo=x.next();
                        Arquero arq=new Arquero(porcentajeTapadas, sub, guantes, tamaño, cedula, Posicion, codiPer, nombre, cargo, Apellido, edad);
                        CArq.cread(arq);
                        break;
                       
                    case 2:
                        System.out.println("INGRESAR CODIGO ");
                            codiPer=x.nextInt();
                            System.out.println("DATOS ARQUERO:\n"+CArq.read(codiPer));
                            break;
                            
                    case 3:
                       
                        System.out.println("INGRESAR PORCENTAJE DE TAPADAS");
                        porcentajeTapadas=x.nextInt();
                        System.out.println("INGRESAR SAQUE DE ARCO");
                        sub=x.nextInt();
                        System.out.println("INGRESAR GUANTES COLOCADOS EN PARTIDO");
                        guantes=x.nextInt();
                        System.out.println("INGRESAR CODIGO DE LA PERSONA");
                        codiPer=x.nextInt();
                        System.out.println("INGRESAR EDAD");
                        edad=x.nextInt();
                        System.out.println("INGRESAR TAMAÑO JUGADOR ");
                        tamaño=x.nextDouble();
                        System.out.println("INGRESAR CEDULA");
                        cedula=x.next();
                        System.out.println("INGRESAR POSICION");
                        Posicion=x.next();
                        System.out.println("INGRESAR NOMBRE");
                        nombre=x.next();
                        System.out.println("INGRESAR APELLIDO");
                        Apellido=x.next();
                        System.out.println("INGRESAR CARGO");
                        cargo=x.next();
                        arq=new Arquero(porcentajeTapadas, sub, guantes, tamaño, cedula, Posicion, codiPer, nombre, cargo, Apellido, edad);
                        CArq.update(arq);
                        break;
                        
                    case 4:
                        System.out.println("INGRESAR CODIGO PARA ELIMINAR ");
                            codiPer=x.nextInt();
                            CArq.delete(codiPer);
                            break;
                          
                    case 5:
                       System.out.println("DATOS ARQUERO ACTUALIZADOS: ");
                       CArq.impTodo();
                        break;
                        
                    case 6:
                        salir = false;
                        System.out.println("FIN");
                        
                }  
                   
                }while(salir !=false);
                
                break;
                
            case 4:
                salir=true;
                do{
                subMenu2();
                sub=x.nextInt();
                
                switch(sub){
                
                    case 1:
                        int pgoles,remates,pases,tEsquina,codP,edad;
                        String cedula,Posicion,nombre,cargo,Apellido;
                        System.out.println("INGRESAR PORSENTAJE DE GOLES");
                        pgoles=x.nextInt();
                        System.out.println("INGRESAR REMATES ");
                        remates=x.nextInt();
                        System.out.println("INGRESAR CANTIDAD DE PASES ");
                        pases=x.nextInt();
                        System.out.println("INGRESAR TIROS DE ESQUINA");
                        tEsquina=x.nextInt();
                        System.out.println("INGRESAR CEDULA");
                        cedula=x.next();
                        System.out.println("INGRESAR POSICION");
                        Posicion=x.next();
                        System.out.println("INGRESA CODIGO PERSONA ");
                        codP=x.nextInt();
                        System.out.println("INGRESAR NOMBRE");
                        nombre=x.next();
                        System.out.println("INGRESAR CARGO");
                        cargo=x.next();
                        System.out.println("INGRESAR APELLIDO");
                        Apellido=x.next();
                        System.out.println("INGRESAR EDAD");
                        edad=x.nextInt();
                        Delantero del=new Delantero(pgoles, remates, pases, tEsquina, cedula, Posicion,codP, nombre, cargo, Apellido, edad);
                        CDel.Creat(del);
                        break;
                        
                    case 2:
                            System.out.println("INGRESAR CODIGO ");
                            codP=x.nextInt();
                            System.out.println("DATOS DELANTERO:\n "+CDel.read(codP));
                            break;
                        
                    case 3:
                        System.out.println("INGRESAR PORSENTAJE DE GOLES");
                        pgoles=x.nextInt();
                        System.out.println("INGRESAR REMATES ");
                        remates=x.nextInt();
                        System.out.println("INGRESAR CANTIDAD DE PASES ");
                        pases=x.nextInt();
                        System.out.println("INGRESAR TIROS DE ESQUINA");
                        tEsquina=x.nextInt();
                        System.out.println("INGRESAR CEDULA");
                        cedula=x.next();
                        System.out.println("INGRESAR POSICION");
                        Posicion=x.next();
                        System.out.println("INGRESA CODIGO PERSONA ");
                        codP=x.nextInt();
                        System.out.println("INGRESAR NOMBRE");
                        nombre=x.next();
                        System.out.println("INGRESAR CARGO");
                        cargo=x.next();
                        System.out.println("INGRESAR APELLIDO");
                        Apellido=x.next();
                        System.out.println("INGRESAR EDAD");
                        edad=x.nextInt();
                        del=new Delantero(pgoles, remates, pases, tEsquina, cedula, Posicion,codP, nombre, cargo, Apellido, edad);
                        CDel.update(del, codP);
                        break;
                        
                    case 4:
                        System.out.println("INGRESAR CODIGO PARA ELIMINAR: ");
                            codP=x.nextInt();
                            CDel.delete(codP);
                            break;
                            
                    case 5:
                        System.out.println("DATOS DELANTERO ACTUALIZADOS");
                        CDel.leerTodo();
                        break;
                        
                    case 6:
                        System.out.println("FIN");
                        salir=false;
                }
                }while(salir==true);
                break;
                
            case 5:
                 System.out.println("lista de datos ingresados: ");
                CDel.leerTodo();
                
                break;
            case 6:
               prin=false;
                System.out.println("FIN");
                
            default:
                System.out.println("Ingresar solo desde el 1 al 5");
                        
        }
        
        }while(prin==true);
    }
    
    
    public static void subMenu1(){

        System.out.print(
                 "1. Create            \n"
                + "2. Read             \n"
                + "3. Update           \n"
                + "4. Delete           \n"
                + "5. Regresar         \n"
                + "                    \n"
                + "INGRESAR OPCION:");
    }
    
    public static void subMenu2(){

        System.out.print(
                  "1. Create           \n"
                + "2. Read             \n"
                + "3. Update           \n"
                + "4. Delete           \n"
                + "5. Imprimir         \n"
                + "6. Regresar         \n"
                + "                    \n"
                + "INGRESAR OPCION:");
    }  
}
