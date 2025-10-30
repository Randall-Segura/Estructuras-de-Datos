/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaEnlazadaSimple;

import Modelo.Medicamento;
import javax.swing.JOptionPane;

/**
 *
 * @author Randall Segura
 */
public class ListaSimple {
    
    //atributos
    
    private NodoLES inicio;
    
    //constructor vacio
    
    public ListaSimple(){
        this.inicio=null;
    }
    
    
    
    //metodos
    
    public void agregarMedicamento(int id, String nombre, int cantidad, String fechaCaducidad){
        
        Medicamento nuevoMedicamento = new Medicamento(id,nombre,cantidad,fechaCaducidad);
        
        NodoLES nuevoNodo = new NodoLES(nuevoMedicamento);
        
        
        if(inicio==null){
            inicio=nuevoNodo;
        }else{
            NodoLES aux=inicio;
            while(aux.getSiguiente()!=null){
                aux=aux.getSiguiente();
            }
            aux.setSiguiente(nuevoNodo);
        }
    }
    
    
    public Medicamento buscarMedicamento(String nombre){
        NodoLES actual=inicio;
        
        while(actual!=null){
            if(actual.getDato().getNombre().equalsIgnoreCase(nombre)){
                return actual.getDato();
            }
            actual=actual.getSiguiente();
        }
        return null;
    }
    
    
    
    public boolean eliminarMedicamento(String nombre){
        NodoLES actual=inicio;
        NodoLES anterior=null;
        
        while(actual!=null){
            if (actual.getDato().getNombre().equalsIgnoreCase(nombre)){
                if(anterior==null){
                    inicio=actual.getSiguiente();
                }else{
                    anterior.setSiguiente(actual.getSiguiente());
                }
                return true;
            }
            anterior=actual;
            actual=actual.getSiguiente();
        }
        return false;
    }
    
    
    public String mostrarMedicamento(){
        NodoLES actual=inicio;
        String resultado="Medicamentos en Inventario: \n\n";
        
        if(actual==null){
            
            return "No hay medicamentos en inventario";
        }
        
        while(actual!=null){
           Medicamento med= actual.getDato(); 
           resultado+="Nombre: " + med.getNombre()+
                   "\nId: " + med.getId()+
                   "\nCantidad: " + med.getCantidad()+
                   "\nFecha Caducidad: " + med.getFechaCaducidad()+"\n---------------------------------------------\n";
           actual=actual.getSiguiente();
        }
        return resultado;
    }
    
    //metodo para contar recursivamente cuantos medicamentos hay
    public int contarMedicamentos(){
        return contarMedicamentosRecursivo(inicio);
    }
    
    public int contarMedicamentosRecursivo(NodoLES n){
        if (n==null){
            return 0;
        }else{
            return 1+ contarMedicamentosRecursivo(n.getSiguiente());
        }
    }
    
}
