package sem4pilas1;

import java.util.Stack;

public class Principal {

    public static void main(String[] args) {

        Stack<Integer> pila = new Stack<>();          //creacion de la pila

        pila.push(10);                                //inserto de datos a la pila
        pila.push(20);
        pila.push(30);

        //diversos mensajes 
        System.out.println("Elemento en el tope: " + pila.peek());
        System.out.println("Contenido de la pila: " + pila);
        System.out.println("Eliminando elemento: " + pila.pop());
        System.out.println("Esta vacia?: " + pila.isEmpty());
        System.out.println("Tamano: " + pila.size());

        if (pila.isEmpty() == true) {
            System.out.println("La pila esta vacia");
        } else {
            System.out.println("La pila esta llena");
        }

    }
}