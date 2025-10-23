package sem4pilas2;

public class Nodo {

    //atributos
    private Dato elemento;
    private Nodo siguiente;

    //constructor vacio
    public Nodo() {
        this.siguiente = null;
    }

    //getter and setters
    public Dato getElemento() {
        return elemento;
    }

    public void setElemento(Dato elemento) {
        this.elemento = elemento;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}
