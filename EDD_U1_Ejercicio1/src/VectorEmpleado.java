
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eduardo
 */
public class VectorEmpleado {
    private Empleado[] vector;
    private Empleado eliminado;
    
    public VectorEmpleado(){
        vector= new Empleado[10];
        
        for(int i=0; i<vector.length; i++){
            vector[i]= new Empleado();
        }
    }//VectorEmpleado
    
    public boolean insertar(Empleado data, int indice){
        
        if(indice>0 && indice<=9){
            vector[indice]= data;
            return true;
        }else{
            return false;
        }//else
    }//insertar
    
    public boolean guardarEnArchivo(){
        
        String cadenaDatos = "";
        
        for(int i=0;i<vector.length;i++){
            cadenaDatos+= vector[i].getNombre()+"&"+vector[i].getEdad()+
                    "$"+vector[i].getSueldo()+"!!";
        }
        
        try{
            OutputStreamWriter archivo = new OutputStreamWriter(new FileOutputStream("archivo.txt"));
            archivo.write(cadenaDatos);
            archivo.close();
            return true;
            
        }catch(Exception e){
            return false;
        }//catch
    }//guardar
    
    public boolean cargarDeArchivo(){
        
        
        try{
            BufferedReader archivo = new BufferedReader(new FileReader("archivo.txt"));
            
            String cadenaDatos= archivo.readLine();
            String temporal[]= cadenaDatos.split("!!");
            for(int i=0;i<vector.length;i++){
                Empleado e= new Empleado();
                String temporal2[]= temporal[i].split("&");
                e.setNombre(temporal2[0]);
                e.setEdad(Integer.parseInt(temporal2[1]));
                e.setSueldo(Float.parseFloat(temporal2[2]));
                vector[i]=e;
            }
            
            return true;
        }catch(Exception e){
           return false; 
        }
        
    }
    
    public boolean eliminar(int indice){
        if(indice>0 && indice<=9){
            eliminado= new Empleado();
            eliminado= vector[indice];
            vector[indice]= new Empleado();
           return true;
        }else{
            return false;
        }//else
    }//eliminar
    
    public Empleado mostrarEliminado(){
        return eliminado;
    }
    
    public Empleado buscar(int indice){
        
        if(indice>0 && indice<=9){
            return vector[indice];
        }else{
            return null;
        }//else
    }
}//class
