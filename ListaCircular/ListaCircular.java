/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem9listacircular;

import javax.swing.JOptionPane;

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
    
    
    public boolean vacia(){
        return inicio==null;
    }
    
    
    
    
    /*
    public void insertar(Persona p):
    Recibe como parametro Persona p que es el nombre de la variable temporal que dentro del metodo representa a esa persona.
    */
    public void insertar(Persona p){
        
        /*
        if (vacia()):
        Si la lista esta vacia:
        */
       if (vacia()){
           
           /*
           inicio= new Nodo(p);
           Se crea un nuevo objeto Nodo.
           Este nodo guarda la referencia a la Persona p.
           Inicio apunta a ese nuevo nodo.
           Este es el primer nodo de la lista.
           */
           inicio= new Nodo(p);
           /*
           fin=inicio:
           Ahora se dice:
           El primer nodo tambien es el ultimo.
           Como solo hay un nodo, inicio y fin apuntan al mismo objeto.
           */
           fin=inicio;
           /*
           fin.setSiguiente(inicio);
           Aqui se define la circularidad:
           fin es el ultimo nodo, entonces su siguiente debe apuntar al nodo inicio.
           */
           fin.setSiguiente(inicio);
           
           /*
           else if(p.getId() < inicio.getDato().getId()):
           Pregunta: el id de la nueva persona es menor al id del primer nodo?
           */
       } else if(p.getId() < inicio.getDato().getId()){
           /*
           Nodo aux= new Nodo(p);
           Se crea un nuevo nodo que guardara a la persona [.
           Este nodo no esta enlazado todavia.
           aux es un puntero temporal para manipularlo.
           */
           Nodo aux= new Nodo(p);
           /*
           aux.setSiguiente(inicio);
           Se conecta el nuevo nodo atras del actual primer nodo.
           aux apunta a inicio.
           */
           aux.setSiguiente(inicio);
           /*
           inicio=aux;
           Ahora se actualiza el inicio:
           Antes inicio era el nodo que le sigue a aux, despues inicio es aux.
           */
           inicio=aux;
           /*
           fin.setSiguiente(inicio);
           Muy importante en listas circulares:
           El fin (ultimo nodo) debe apunta al nuevo inicio.
           Si no se actualiza esto, el ciclo se rompe.
           */
           fin.setSiguiente(inicio);
           
           /*
           else if(fin.getDato().getId()<=p.getId()):
           Significa si el id del ultimo nodo es menor o igual al id que se va a insertar
           */
       }else if(fin.getDato().getId()<=p.getId()){
           /*
           fin.setSiguiente(new Nodo(p));
           Crea un nuevo nodo con la persona p
           Y de una vez lo enlaza como el siguiente del nodo que era el ultimo.
           
           */
           fin.setSiguiente(new Nodo(p));
           /*
           fin=fin.getSiguiente();
           Aqui se actualiza la referencia de fin para que apunte al nuevo ultimo nodo. 
           */
           fin=fin.getSiguiente();
           /*
           fin.setSiguiente(inicio);
           Aqui se define la circularidad:
           fin es el ultimo nodo, entonces su siguiente debe apuntar al nodo inicio.
           */
           fin.setSiguiente(inicio);
           
           /*
           El siguiente bloque se ejecuta solo si:
           La lista no esta vacia.
           Si no se inserto un nuevo nodo al inicio.
           Si no se inserto un nuevo nodo al final. 
           Esto quiere decir que el nuevo nodo debe ir en medio.
           */
       }else{
           /*
           Nodo aux=inicio;
           Se crea un puntero aux para recorrer la lista desde el inicio.
           Aux sera el nodo previo al lugar donde se insertara el nuevo nodo.
           */
           Nodo aux=inicio;
           /*
           while(aux.getSiguiente().getDato().getId() < p.getId()):
           Avanza mientras el id del siguiente nodo es menor que el id que se va a insertar.
           */
           while(aux.getSiguiente().getDato().getId() < p.getId()){
               
               /*
               aux=aux.getSiguiente();
               Avanza al siguiente nodo.
               */
               aux=aux.getSiguiente();
           }
           /*
           Nodo temp= new Nodo(p);
           Se crea un nuevo nodo temp con la persona p.
           */
           Nodo temp= new Nodo(p);
           /*
           temp.setSiguiente(aux.getSiguiente());
           Hace que temp apunte al nodo que anteriormente apuntaba aux.
           */
           temp.setSiguiente(aux.getSiguiente());
           /*
           aux.setSiguiente(temp);
           Ahora aux apunta a temp.
           */
           aux.setSiguiente(temp);
           /*
           fin.setSiguiente(inicio);
           Aqui se define la circularidad:
           fin es el ultimo nodo, entonces su siguiente debe apuntar al nodo inicio.
           */
           fin.setSiguiente(inicio);
       }
       
    }
    
    
    public void extraer(){
        
        /*
        if(!vacia()):
        Si la lista no esta vacia:
        */
        if(!vacia()){
            /*
            inicio=inicio.getSiguiente();
            Avanza el inicio al siguiente nodo.
            Basicamente saca el primer nodo desplazando inicio al nodo siguiente.
            */
            inicio=inicio.getSiguiente();
            /*
           fin.setSiguiente(inicio);
           Aqui se define la circularidad:
           fin es el ultimo nodo, entonces su siguiente debe apuntar al nodo inicio.
           */
            fin.setSiguiente(inicio);
            JOptionPane.showMessageDialog(null,"Elemento extraido " );
        }else{
            JOptionPane.showMessageDialog(null,"El elemento no se puede extraer");
        }
    }
    
    
    @Override
    /*
    public String toString()
    toString es un metodo especal en Java que sirve para devolver una representacion en texto de un objeto.
    */
    public String toString(){
        /*
        Nodo aux=inicio;
        Se crea un puntero auxiliar para recorrer la lista.
        */
        Nodo aux=inicio;
        
        /*
        String s= "Lista" + "\n-----\n";
        Se crea la variable lista para ir guardando la informacion de las personas. 
        */
        String s= "Lista" + "\n-----\n";
        
        /*
        do:
        Se pone do while porque se debe recorrer al menos un nodo, incluso si solo hay uno.
        Como es circular, regresa a inicio cuando termina
        */
        do{
            /*
            s+=aux.getDato().getId() + " " + aux.getDato().getNombre() + "\n";
            Se va concatenando en la variable la informacion de las personas.
            */
            s+=aux.getDato().getId() + " " + aux.getDato().getNombre() + "\n";
            /*
            aux=aux.getSiguiente();
            Se avanza al siguiente nodo. 
            */
            aux=aux.getSiguiente();
            /*
            while(aux!=inicio):
            La condicion detiene el bucle cuando se vuelve al primer nodo (inicio).
            Asi se recorren todos los nodos una unica vez.
            */
        }while(aux!=inicio);
        /*
        return s:
        Devuelve el String final con toda la informacion para luego imprimirla.
        */
        return s;
        
    }
    
    
}
