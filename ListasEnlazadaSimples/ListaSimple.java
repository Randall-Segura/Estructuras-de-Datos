package sem8listasenlazadassimples;

import javax.swing.JOptionPane;

public class ListaSimple {

    //atributos
    private Nodo inicio;

    //constructor vacio
    public ListaSimple() {
        this.inicio = null;
    }

    //metodos
    public boolean vacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void agregar() {
        //se crea la instancia de vehiculo
        Vehiculo v = new Vehiculo();

        // se pide la marca del vehiculo
        v.setMarca(JOptionPane.showInputDialog("Ingrese la marca del vehiculo"));

        //se pide el modelo del vehiculo
        v.setModelo(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el modelo del vehiculo")));

        // se crea la instancia de nodo para agregar vehiculos
        Nodo nuevo = new Nodo();
        //al nodo se le inserta el vehiculo recien creado
        nuevo.setDato(v);

        //si la lista esta vacia, se inserta el vehiculo al inicio
        if (vacia()) {
            inicio = nuevo;

            /*v.getModelo() es el año del vehiculo que se va a insertar
            inicio.getDato().getModelo() es el año del vehiculo que esta en el primer nodo de la lista (inicio)
            Esto quiere decir que si el nuevo modelo (año) es menor, significa que tiene que ir antes del primero para mantener la lista ordenada de
            menor a mayor 
            
            nuevo.setSiguiente(): el nuevo nodo apunta hacia lo que era la cabeza actual de la lista
            inicio=nuevo: ahora el nuevo nodo se convierte en la nueva cabeza de la lista
          
             */
        } else if (v.getModelo() < inicio.getDato().getModelo()) {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;

            // si solo hay un nodo, el nuevo nodo se inserta a la derecha, ya se verifico que no fuera menor en la condicion anterior  
        } else if (inicio.getSiguiente() == null) {
            inicio.setSiguiente(nuevo);

            /*
            Se crea un puntero auxiliar aux que empieza en la cabeza de la lista
            aux sirve para recorrer toda la lista y encontrar donde insertar el nuevo nodo
            
            en la parte del while con los parametros, recorre toda la lista hasta encontrar el lugar donde:
            el siguiente nodo es mayor o igual
            o cuando se llega al final de la lista
            
            aux=aux.getSiguiente() avanza el aux al siguiente nodo
            asi se mueve nodo a nodo hasta encontrar el lugar correcto
            
            aux es el nodo que esta justo antes de donde se necesita insertar el nuevo nodo
            aux.setSiguiente(nuevo) es el nodo que va despues de aux  entonces:
            
            nuevo.setSiguiente(aux.getSiguiente()) hace que el nuevo nodo apunte al nodo que venia despues de aux
            aux.setSiguiente(nuevo) hace que el nodo aux apunte al nuevo nodo
             */
        } else {
            Nodo aux = inicio;
            while (aux.getSiguiente() != null && aux.getSiguiente().getDato().getModelo() < v.getModelo()) {
                aux = aux.getSiguiente();
            }
            nuevo.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nuevo);
        }
    }

    public void insertar() {
        //se crea la instancia de vehiculo
        Vehiculo v = new Vehiculo();

        /*
        toma el texto escrito por el usuario en el campo de texto Menu.txtMarca y ese texto se usa para asignar la marca al objeto vehiculo
        recien creado
         */
        v.setMarca(Menu.txtMarca.getText());

        /*
        toma el texto escrito por el usuario en el campo de texto Menu.txtModelo y lo convierte a un entero y ese entero se usa para asignar el modelo
        al objeto vehiculo
         */
        v.setModelo(Integer.parseInt(Menu.txtModelo.getText()));

        // se crea la instancia de nodo para agregar vehiculos
        Nodo nuevo = new Nodo();
        // al nodo se le inserta el vehiculo recien creado
        nuevo.setDato(v);

        //si la lista esta vacia se inserta el vehiculo al inicio
        if (vacia()) {
            inicio = nuevo;

            /*v.getModelo() es el año del vehiculo que se va a insertar
            inicio.getDato().getModelo() es el año del vehiculo que esta en el primer nodo de la lista (inicio)
            Esto quiere decir que si el nuevo modelo (año) es menor, siginifca que tiene que ir antes del primero para mantener la lista ordenada de
            menor a mayor 
            
            nuevo.setSiguiente(): el nuevo nodo apunta hacia lo que era la cabeza actual de la lista
            inicio=nuevo: ahora el nuevo nodo se convierte en la nueva cabeza de la lista
          
             */
        } else if (v.getModelo() < inicio.getDato().getModelo()) {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;

            // si solo hay un nodo, el nuevo nodo se inserta a la derecha, ya se verifico que no fuera menor en la condicion anterior  
        } else if (inicio.getSiguiente() == null) {
            inicio.setSiguiente(nuevo);

            
            /*
            Se crea un puntero auxiliar aux que empieza en la cabeza de la lista
            aux sirve para recorrer toda la lista y encontrar donde insertar el nuevo nodo
            
            en la parte del while con los parametros, recorre toda la lista hasta encontrar el lugar donde:
            el siguiente nodo es mayor o igual
            o cuando se llega al final de la lista
            
            aux=aux.getSiguiente() avanza el aux al siguiente nodo
            asi se mueve nodo a nodo hasta encontrar el lugar correcto
            
            aux es el nodo que esta justo antes de donde se necesita insertar el nuevo nodo
            aux.setSiguiente(nuevo) es el nodo que va despues de aux  entonces:
            
            nuevo.setSiguiente(aux.getSiguiente()) hace que el nuevo nodo apunte al nodo que venia despues de aux
            aux.setSiguiente(nuevo) hace que el nodo aux apunte al nuevo nodo
             */
        } else {
            Nodo aux = inicio;
            while (aux.getSiguiente() != null && aux.getSiguiente().getDato().getModelo() < v.getModelo()) {
                aux = aux.getSiguiente();
            }

            nuevo.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nuevo);
        }

    }

    public void extraer() {
        //si la lista no esta vacia, imprime el dato en consola que se extrajo
        if (!vacia()) {
            System.out.println("Dato extraido: " + inicio.getDato().getMarca());
            //inicio se mueve al siguiente nodo y como resultado el primer nodo queda fuera de la lista
            inicio = inicio.getSiguiente();
            JOptionPane.showMessageDialog(null, "Dato extraido con exito");
        } else {
            JOptionPane.showMessageDialog(null, "No hay datos que extraer");
        }
    }

    public void mostrar() {
        // si la lista no esta vacia
        if (!vacia()) {
            // la variable s es donde se van a concatenar todos los nodos junto con su informacion
            String s = "";
            //nodo aux es la creacion de un puntero auxiliar que sirve para recorrer la lista 
            Nodo aux = inicio;
            
            //mientras que el puntero auxiliar tengo un siguiente nodo
            while (aux != null) {
                //se concatenan los nodos con su informacion
                s += aux.getDato().getMarca() + " / " + aux.getDato().getModelo() + " → ";
                aux = aux.getSiguiente();
                
            }
            //mensaje de impresion de la lista
            JOptionPane.showMessageDialog(null, "Contenido de la lista \n\n" + s);
            //mensaje en caso de que la lista este vacia
        } else {
            JOptionPane.showMessageDialog(null, "Error, la lista esta vacia");
        }
    }

    @Override
    public String toString() {
        // la variable s es donde se van a concatenar todos los nodos junto con su informacion 
        String s = "";
        //nodo aux es la creacion de un puntero auxiliar que sirve para recorrer la lista 
        Nodo aux = inicio;
        //si la lista no esta vacia
        if (!vacia()) { 
            //y mientras el puntero auxiliar tenga un siguiente nodo
            
            while (aux != null) {
                
                //se concatenan los nodos con su informacion
                s += aux.getDato().getMarca() + " / "
                        + aux.getDato().getModelo() + " → ";
                
                //aux=aux.getSiguiente() se usa para avanzar al siguiente nodo
                aux = aux.getSiguiente();
            }
        } else {
            //mensaje en caso de que la lista este vacia
            return "Imposible mostrar: Lista Vacía";
        }
        
        //se pone en el textArea la informacion que contienen los nodos
        return s;
    }
}
