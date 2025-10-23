
package Ejemplo5;

import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
        
        int vec[]={1,2,3,4,5};       //se crea el vector con los datos
        int elementoBuscar=Integer.parseInt(JOptionPane.showInputDialog("Digite el dato a buscar: "));  //solicitud del dato a buscar
        int posicion= posElemento(vec,elementoBuscar,0);       //se crea la variable posicion y se llama al metodo posElemento y se le pasan los parametros
        if (posicion==-1){                           //elemento no esta en el vector
            System.out.println("El elemento no existe");
        }else{
            System.out.println("El elemento " + elementoBuscar + " se encuentra en la posicion " + posicion);
        }
        
    }
        
        public static int posElemento(int vec[], int elementoBuscar, int i){        //como parametro esta el vector, el elemento a buscar y el contador i 
            if (i==vec.length){                // cuando i == vec.length, significa que ya pasaste el último índice válido.
                return -1;
            }else if (vec[i]== elementoBuscar){   //si el vector en una posicion i es igual al elemento que ando buscando, que me devuelva esa posicion i
                return i;
            }else{                                 //sino que vaya al siguiente elemento a buscar 
                return posElemento(vec,elementoBuscar,i+1);
            }
        
        
        

    }
    
}
