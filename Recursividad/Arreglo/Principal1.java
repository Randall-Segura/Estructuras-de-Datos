
package sem3recursivo;

import java.util.List;


public class Principal1 {

    
    public static void main(String[] args) {
        
        List<Integer> lista = List.of(1,2,3,4,5);
        System.out.println("La suma de los elementos es: " + sumarLista(lista));
        System.out.println("El numero maximo en la lista es: " + encontrarMaximo(lista));
        System.out.println("La cantidad de elementos en la lista es de: " + contarElementos(lista));
        
        
    }
    
    
    public static int sumarLista(List<Integer> lista){     // se le pone como parametro la lista
        return sumarListaRecursivo(lista,0);               // retorna el metodo y tiene como parametro la lista y el indice que inicia en 0
        
    }
    
    
    
    private static int sumarListaRecursivo(List<Integer> lista, int indice){  //se pone como parametro la lista y se pone un indice
        if (indice==lista.size()){        //si la lista esta vacia, retorna un 0
            return 0;
        }else{                         
            return lista.get(indice) + sumarListaRecursivo(lista,indice+1);      //suma el elemento que este en cada una de las posiciones
        }
    }
    
    
    public static int encontrarMaximo(List<Integer> lista){    //se le pone como parametro la lista 
        return encontrarMaximoRecursivo(lista,0,0);  //retorna el metodo
        
    }
    
    private static int encontrarMaximoRecursivo(List<Integer> lista, int indice, int maximoActual){ //se le pone como parametro la lista, el indice y una variable
                                                                                                    // para guardar el numero mayor
        if (indice==lista.size()){       // si la lista esta vacia retorna la variable                                                             
            return maximoActual;
        }else{
            int nuevoMaximo= Math.max(maximoActual, lista.get(indice));   // si la lista esta llena procede a hacer el calculo, dentro de la variable
            return encontrarMaximoRecursivo(lista, indice + 1, nuevoMaximo);   //retorna el metodo y se le ponen todos los parametros
        }
    }
    
    
    public static int contarElementos(List<Integer> lista){
        return contarElementosRecursivos(lista,0);
        
    }
    
    
    
    private static int contarElementosRecursivos(List<Integer> lista, int indice){   // se le pone como parametro la lista y un indice
        if (indice==lista.size()){
            return 0;                                                                // si la lista esta vacia retorna 0
        }else{
            return 1 + contarElementosRecursivos(lista, indice +1); // si la lista tiene elementos, los cuenta
        }
        
    }
    
}
