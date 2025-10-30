/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaCircular;

import Modelo.Medicamento;

/**
 *
 * @author Randall Segura
 */
public class ListaCircularMedicamentos {

    //atributos
    private NodoLC inicio;
    private NodoLC fin;
    private NodoLC cursor;

    //constructor vacio
    public ListaCircularMedicamentos() {
        this.inicio = null;
        this.fin = null;
        this.cursor = null;
    }

    //metodos
    public boolean vacia() {
        return inicio == null;
    }

    public void insertar(Medicamento med) {
        NodoLC nuevo = new NodoLC(med);

        if (vacia()) {
            inicio = nuevo;
            fin = nuevo;
            fin.setSiguiente(inicio);
            cursor = inicio;
        } else {
            nuevo.setSiguiente(inicio);
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
        if (cursor == null) {
            cursor = inicio;
        }
    }

    public Medicamento siguiente() {

        if (vacia()) {
            return null;
        } else {
            if (cursor == null) {
                cursor = inicio;

            }
            Medicamento actual = cursor.getDato();
            cursor = cursor.getSiguiente();
            return actual;
        }

    }

    public boolean eliminar(String nombre) {
        if (vacia()) {
            return false;
        }

        NodoLC actual = inicio;
        NodoLC anterior = fin;

        do {
            if (actual.getDato().getNombre().equals(nombre)) {
                if (actual == inicio && actual == fin) {
                    inicio = null;
                    fin = null;
                } else if (actual == inicio) {
                    inicio = inicio.getSiguiente();
                    fin.setSiguiente(inicio);
                } else if (actual == fin) {
                    fin = anterior;
                    fin.setSiguiente(inicio);
                } else {
                    anterior.setSiguiente(actual.getSiguiente());
                }
                return true;
            }
            anterior = actual;
            actual = actual.getSiguiente();
        } while (actual != inicio);
        return false;
    }

}
