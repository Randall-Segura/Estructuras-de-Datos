/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EnvioPaquetes;

import javax.swing.JOptionPane;

/**
 *
 * @author Randall Segura
 */
public class Pila {
    
    
    //atributos
    
    private Nodo cima;
    
    //constructor vacio
    
    public Pila(){
        this.cima=null;
    }
    
    
    
    //metodos
    
    //verifica si la pila esta vacia
    public boolean vacia(){
        if (cima==null){
            return true;
        }else{
            return false;
        }
    }
    
    //metodo insertar paquetes 
    public void insercion(){
        
        //se crea el objeto
        Paquete paquete= new Paquete();
        
        paquete.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite el id del paquete")));
        paquete.setDescripcion(JOptionPane.showInputDialog("Digite breve descripcion del paquete"));
        paquete.setPeso(Integer.parseInt(JOptionPane.showInputDialog("Digite el peso del paquete")));
        
        //se ingresa el objeto al nodo
        
        Nodo nuevo = new Nodo();
        nuevo.setDato(paquete);
        
        
        if (vacia()){
            cima=nuevo;
            
        }else{
            nuevo.setSiguiente(cima);
        }
        cima= nuevo;
        
    }
    
    
    public void eliminar(){
        
        if (!vacia()){
            System.out.println("Paquete eliminado: \n" + "ID: " + cima.getDato().getId()
            +"\nDescripcion: " + cima.getDato().getDescripcion()
            +"\nPeso: " + cima.getDato().getPeso());
            cima=cima.getSiguiente();
        }else{
            JOptionPane.showMessageDialog(null, "Error, no existen paquetes por el momento", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    public void mostrar(){
        if (!vacia()){
        Nodo aux=cima;
        String s="";
        int pesoTotal=0;
        while(aux!=null){
            s+= "id: " + aux.getDato().getId() + " / " + " Descripcion: " + aux.getDato().getDescripcion() + " / " 
                    +" Peso "+ aux.getDato().getPeso() + "\n↓\n";
            pesoTotal+= aux.getDato().getPeso();
            aux=aux.getSiguiente();
        }
        s+="Peso total de los paquetes: " + pesoTotal + " kg ";
        JOptionPane.showMessageDialog(null,"La pila de paquetes contiene: \n" + s, "Pila Paquetes", JOptionPane.PLAIN_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "De momento no hay paquetes para mostrar", "No hay paquetes", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    public void busqueda(){
        
        int idPaquete=Integer.parseInt(JOptionPane.showInputDialog("Digite un paquete a buscar por id"));
        Nodo aux=cima;
        boolean encontrado=false;
        while (aux!=null){
            if (idPaquete==aux.getDato().getId()){
                JOptionPane.showMessageDialog(null, "Paquete encontrado");
                encontrado=true;
                break;
            }
            aux=aux.getSiguiente();
    }
        if (!encontrado){
        JOptionPane.showMessageDialog(null,"El paquete que esta intentando buscar no existe","Error", JOptionPane.ERROR_MESSAGE);
        
        }
    }
    
    
   public void envio(){
       if (!vacia()){
           Nodo aux=cima;
           int costoEnvio=0;
           int precioKilo=5;
           while(aux!=null){
               int peso=aux.getDato().getPeso();
               costoEnvio+= peso*precioKilo;
               
               aux=aux.getSiguiente();
               
           }
           JOptionPane.showMessageDialog(null,"El total a pagar es de: " + costoEnvio + " dolares", "Total a pagar", JOptionPane.INFORMATION_MESSAGE);
           
       }else{
           JOptionPane.showMessageDialog(null,"De momento no hay paquetes para calcular el costo de envio", "Error", JOptionPane.ERROR_MESSAGE);
       }
   }
    
}
