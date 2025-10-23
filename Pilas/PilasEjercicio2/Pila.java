
package sem4pilas2;

import javax.swing.JOptionPane;


public class Pila {

    //atributos
    private Nodo cima;

    //constructor vacio
    public Pila() {
        this.cima = null;
    }

    //metodos 
    public boolean vacia() {

        if (cima == null) {
            return true;
        } else {
            return false;
        }

    }

    public void apilar() {

        //creamos un objeto dato
        Dato d = new Dato();
        d.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite un valor")));

        //pasamos el objeto dato al nodo
        Nodo nuevo = new Nodo();
        nuevo.setElemento(d);

        //insertamos el dato (numero) en la pila
        if (vacia()) {
            cima = nuevo; //si la pila esta vacia, la cima es el nuevo dato
        } else {          // se crea el puntero al siguiente dato
            nuevo.setSiguiente(cima);  //colocamos el nodo en la cima
            cima = nuevo;
        }

    }

    public void desapilar() {

        if (!vacia()) {
            System.out.println("Elemento desapilado: " + cima.getElemento().getNumero());
            cima = cima.getSiguiente();   //saca el elemento (TOP- CIMA) de la pila
            System.out.println("El elemento fue desapilado");
        } else {
            JOptionPane.showMessageDialog(null, "Error: no se puede extraer porque la pila esta vacia", "Pila Vacia", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void mostrar() {
        if (!vacia()) {
            String s = "";  // en un String se concatenan todos los  numeros, para mostrarlos en un solo mensaje
            Nodo aux = cima; //para recorrer la pila, se crea un valor temporal llamado auxiliar
            while (aux != null) {
                s += aux.getElemento().getNumero() + " \n(↓)\n";
                aux = aux.getSiguiente(); //me lleva al siguiente dato a concatenar
            }
            JOptionPane.showMessageDialog(null, "La pila contiene:\n" + s, "Pila llena", JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Error: no se puede extraer porque la pila esta vacia", "Pila Vacia", JOptionPane.ERROR_MESSAGE);
        }
    }
}
