/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem9listadoblecircular;

import javax.swing.JOptionPane;

/**
 *
 * @author Randall Segura
 */
public class ListaDC {
    
    
    //atributos
    
    private Nodo inicio;
    private Nodo fin;
    
    //constructor vacio

    public ListaDC() {
        this.inicio = null;
        this.fin = null;
    }
    
    
    
    //metodos
    
    public boolean vacia(){
        return inicio==null;
    }
    
    public void agregar(){
        Curso c= new Curso();
        c.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite el id: ")));
        c.setNombreCurso(JOptionPane.showInputDialog("Digite el nombre del curso"));
        
        Nodo nuevo= new Nodo();
        nuevo.setElemento(c);
        
        if(vacia()){
            inicio=nuevo;
            fin=nuevo;
            fin.setSiguiente(inicio);
            inicio.setSiguiente(fin);
        }else if (c.getId() < inicio.getElemento().getId()){
            nuevo.setSiguiente(inicio);
            inicio=nuevo;
            fin.setSiguiente(inicio);
            inicio.setAnterior(fin);
        }else if(c.getId() > fin.getElemento().getId()){
            fin.setSiguiente(nuevo);
            fin=fin.getSiguiente();
            fin.setSiguiente(inicio);
            inicio.setAnterior(fin);
        }else{
            Nodo aux= inicio;
            while(aux.getSiguiente().getElemento().getId() < c.getId()){
                aux=aux.getSiguiente();
            }
            nuevo.setSiguiente(aux.getSiguiente());
            nuevo.setAnterior(aux);
            aux.setSiguiente(nuevo);
            nuevo.getSiguiente().setAnterior(nuevo);
        }
        
    }
    
    
    public void extraer(){
        if(!vacia()){
            inicio=inicio.getSiguiente();
            fin.setSiguiente(inicio);
            inicio.setAnterior(fin);
            JOptionPane.showMessageDialog(null,"Elemento extraido");
        }else{
            JOptionPane.showMessageDialog(null,"Elemento no se puede extraer");
        }
    }
    
    public void mostrar(){
        String s="";
        Nodo aux=inicio;
        do{
            s+=aux.getElemento().getId() + "=" + aux.getElemento().getNombreCurso() + " ← →";
            aux=aux.getSiguiente();
            
        }while(aux!=inicio);
        JOptionPane.showMessageDialog(null, "Elemento de la lista: \n" + s);
    }
    
}
