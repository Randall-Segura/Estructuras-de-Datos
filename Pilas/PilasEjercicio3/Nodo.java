
package sem4pilas3;



public class Nodo {
    
    
    //atributos
    
    private Mascota dato;
    private Nodo siguiente;
    
    //constructor vacio
    
    public Nodo(){
        this.siguiente=null;
    }
    
    
    
    //getters and setters 

    public Mascota getDato() {
        return dato;
    }

    public void setDato(Mascota dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
    
}
