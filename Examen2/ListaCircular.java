/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoestudio2randallseguraj;

/**
 *
 * @author Randall Segura
 */
public class ListaCircular {

    //atributos
    private Nodo inicio;
    private Nodo fin;

    //constructor vacio
    public ListaCircular() {
        this.inicio = null;
        this.fin = null;
    }

    //metodos
    public boolean vacia() {
        return inicio == null;
    }

    public void agregarAlquiler(Alquiler a) {
        if (vacia()) {
            inicio = new Nodo(a);
            fin = inicio;
            fin.setSiguiente(inicio);
        } else if (a.getIdAlquiler() < inicio.getDato().getIdAlquiler()) {
            Nodo aux = new Nodo(a);
            aux.setSiguiente(inicio);
            inicio = aux;
            fin.setSiguiente(inicio);
        } else if (fin.getDato().getIdAlquiler() <= a.getIdAlquiler()) {
            fin.setSiguiente(new Nodo(a));
            fin = fin.getSiguiente();
            fin.setSiguiente(inicio);
        } else {
            Nodo aux = inicio;
            while (aux.getSiguiente().getDato().getIdAlquiler() < a.getIdAlquiler()) {
                aux = aux.getSiguiente();
            }
            Nodo temp = new Nodo(a);
            temp.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(temp);
            fin.setSiguiente(inicio);
        }
    }

    public void alquilerReciente() {
        if (vacia()) {
            System.out.println("De momento no se han registrado alquileres");
        }else{
            System.out.println( fin.getDato());
        }
            

    }
    
    
    @Override
    public String toString(){
        Nodo aux=inicio;
        String s= "Lista de Alquileres " + "\n----------\n";
        
        do{
            
            s+="ID Alquiler: " +aux.getDato().getIdAlquiler()+" / " 
                    +"Nombre Cliente: " + aux.getDato().getNombreCli() + " / " 
                    +"Marca Vehiculo: "+ aux.getDato().getMarcaVehiculo()+" / "
                    +"Fecha Alquiler: " + aux.getDato().getFechaAlquiler()+" / "
                    +"Fecha Devolucion: " + aux.getDato().getFechaDevolucion()+"\n";
            aux=aux.getSiguiente();
            
        }while(aux!=inicio);
        return s;
    }

}
