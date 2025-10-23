
package sem4pilas3;

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
        Mascota mascota = new Mascota();
        mascota.setNombre(JOptionPane.showInputDialog("Ingrese el nombre:"));
        mascota.setTipo(JOptionPane.showInputDialog("Digite el tipo"));

        //pasamos el objeto dato al nodo
        Nodo nuevo = new Nodo();
        nuevo.setDato(mascota);

        if (vacia()) {
            cima = nuevo;
        } else {
            nuevo.setSiguiente(cima);
        }
        cima = nuevo;

    }

    public void desapilar() {

        if (!vacia()) {
            System.out.println("Elemento desapilado: " + cima.getDato().getNombre());
            cima = cima.getSiguiente();
            System.out.println("El elemento fue desapilado");
        } else {
            JOptionPane.showMessageDialog(null, "Error: no se puede extraer porque la pila esta vacia", "Pila Vacia", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void mostrar() {
        if (!vacia()) {
            String s = "";
            Nodo aux = cima;
            while (aux != null) {
                s += aux.getDato().getNombre() + " / " + aux.getDato().getTipo() + " \n(↓)\n";
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "La pila contiene:\n" + s, "Pila llena", JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Error: no se puede extraer porque la pila esta vacia", "Pila Vacia", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
