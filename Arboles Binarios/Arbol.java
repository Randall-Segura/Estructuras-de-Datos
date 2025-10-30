package sem10arbolesbinarios;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Arbol {

    //atributos
    public Nodo raiz;

    //constructor vacio
    public Arbol() {
        this.raiz = null;
    }

    //metodos
    public boolean vacio() {
        return raiz == null;
    }

    /*
    private void crearNodo(Nodo raiz, Nodo nuevo):
    Nodo raiz: Es el nodo actual donde estamos parados en el arbol pero no es necesariamente la raiz del arbol completo, es el punto actual de
    comparacion.
    Nodo nuevo: Es el nodo que queremos insertar en el arbol. 
    */
    private void crearNodo(Nodo raiz, Nodo nuevo) {
        /*
        if (nuevo.getElemento().getNum() <= raiz.getElemento().getNum()):
        Aqui se compara el valor numero (getNum()) del nodo nuevo con el valor del nodo actual(raiz).
        Si el valor del nuevo nodo es menor o igual, debe ir a la izquierda, porque asi funcionan los arboles binarios. 
        */
        if (nuevo.getElemento().getNum() <= raiz.getElemento().getNum()) {
            /*
            if (raiz.getEnlaceIzq() == null):
            Si la rama izquierda esta vacia:
            */
            if (raiz.getEnlaceIzq() == null) {
                /*
                raiz.setEnlaceIzq(nuevo);
                Se coloca el nuevo nodo a la izquierda y esto crea el puntero de una vez.
                */
                raiz.setEnlaceIzq(nuevo);
            } else {
                /*
                crearNodo(raiz.getEnlaceIzq(), nuevo);
                Si ya hay un nodo en la izquierda, entonces se llama recursivamente a crearNodo() para intentar colocarlo mas abajo,
                dentro del subarbol izquierdo
                */
                crearNodo(raiz.getEnlaceIzq(), nuevo);
            }
        } else {
            /*
            if (raiz.getEnlaceDer() == null):
            Si la rama derecha esta vacia:
            */
            if (raiz.getEnlaceDer() == null) {
                /*
                raiz.setEnlaceDer(nuevo);
                Se coloca el nuevo nodo a la derecha y esto crea el puntero de una vez.
                */
                raiz.setEnlaceDer(nuevo);
            } else {
                /*
                crearNodo(raiz.getEnlaceDer(), nuevo);
                Si ya hay un nodo en la derecha, entonces se llama recursivamente a crearNodo() para intentar colocarlo mas abajo,
                dentro del subarbol izquierdo
                */
                crearNodo(raiz.getEnlaceDer(), nuevo);
            }
        }
    }

    public void crearRaiz() {
        
        Dato d = new Dato();
        d.setNum(Integer.parseInt(JOptionPane.showInputDialog("Digite un número: ")));

        Nodo nuevo = new Nodo();
        nuevo.setElemento(d);
        
        /*
        if (vacio()) {
            raiz = nuevo;
        Se revisa si el arbol esta vacio, es decir, si raiz==null.
        Si esta vacio, significa que este es el primer nodo del arbol, por lo tanto se convierte en raiz.
        */
        if (vacio()) {
            raiz = nuevo;
            
            /*
            else {
            crearNodo(raiz, nuevo);
            Si ya existe una raiz, enteonces el arbol ya tiene nodos.
            Se llama al metodo crearNodo, que se encarga de insertar el nuevo nodo en la posicion correcta del arbol.
            */
        } else {
            crearNodo(raiz, nuevo);
        }
    }
    
    
    
    /*
    private void mostrarNodo(Nodo n):
    Este metodo sirve para mostrar los elementos del arbol haciendo un recorrido inorden, es decir izquierda→ nodo → derecha, lo que
    imprime los numeros ordenados de menor a mayor. 
    */
    private void mostrarNodos(Nodo n) {
        /*
        if (n != null):
        Esta condicion evita errores, solo actua si el nodo existe.
        Cuando n==null, es decir si se llega a una rama vacia, el metodo no hace nada y se detiene.
        */
        if (n != null) {
            /*
            mostrarNodo(n.getEnlaceIzq());
            Llama recursivamente al subarbol izquierdo.
            Es decir, primero recorre todo lo que haya a la izquierda del nodo actual.
            */
            mostrarNodos(n.getEnlaceIzq());
            /*
            System.out.print(n.getElemento().getNum() + " ");
            Despues de recorrer la izquierda, muestra el valor del nodo actual, (imprime el numero en consola)
            */
            System.out.print(n.getElemento().getNum() + " ");
            /*
            mostrarNodo(n.getEnlaceDer());
            Por ultimo, recorre recursivamente el subarbol derecho del nodo.  
            */
            mostrarNodos(n.getEnlaceDer());
        }
    }

    public void mostrarRaiz() {
        /*
        if (!vacio()) {
            mostrarNodo(raiz);
        Si el arbol no esta vacio se llama a mostrarNodo y que muestre la raiz.
        */
        if (!vacio()) {
            mostrarNodos(raiz);
            /*
            Sino, el arbol esta vacio. 
            */
        } else {
            System.out.println("No se puede mostrar, árbol vacío");
        }
    }
    
    

    private String preorden(Nodo n) {
        /*
        if (n == null) {
            return "";
        Esta linea es la condicion base de la recursion.
        Si el nodo es null, no hay nada que agregar al recorrido, por lo que se devuelve un String vacio.
        Esto permite que la recursion se detenga correctamente, cuando llega al final de una rama del arbol.
        */
        if (n == null) {
            return "";
        }
        /*
        return n.getElemento().getNum() + " "
                + preorden(n.getEnlaceIzq())
                + preorden(n.getEnlaceDer());
        Aqui es donde ocurre todo, el orden de la preorden es el siguiente: nodo actual, subarbol izquierdo y subarbol derecho.
        Es decir siempre se visita el nodo donde estoy, despues la izquierda y despues la derecha.
        */
        return n.getElemento().getNum() + " "
                + preorden(n.getEnlaceIzq())
                + preorden(n.getEnlaceDer());
    }
    
   

    
    private String inorden(Nodo n) {
        /*
        if (n == null) {
            return "";
        Esta linea es la condicion base de la recursion.
        Si el nodo actual es null, significa que ya se llego al final de una rama, asi que no hay nada que procesar.
        Devuelve un String vacio. 
        */
        if (n == null) {
            return "";
        }
        /*
        return inorden(n.getEnlaceIzq())
                + n.getElemento().getNum() + " "
                + inorden(n.getEnlaceDer());
        Aqui es donde ocurre todo, el orden del inorden es el siguiente: izquierda, actual, derecha y de esta manera se recorre el arbol
        de manera ascendente. 
        */
        return inorden(n.getEnlaceIzq())
                + n.getElemento().getNum() + " "
                + inorden(n.getEnlaceDer());
    }
    
    
    

    private String postorden(Nodo n) {
        
        /*
        if (n == null) {
            return "";
        Este es el caso base, si n es null, retorna una cadena vacia y no hace nada. 
        */
        if (n == null) {
            return "";
        }
        /*
        return postorden(n.getEnlaceIzq())
                + postorden(n.getEnlaceDer())
                + n.getElemento().getNum() + " ";
        Aqui es donde ocurre todo, el orden del postorden es: izquierda, derecha, actual
        */
        return postorden(n.getEnlaceIzq())
                + postorden(n.getEnlaceDer())
                + n.getElemento().getNum() + " ";
    }

    
    /*
    Los siguientes metodos sirven para que se puedan llamar desde el main sin la necesidad de hacer algo mas complejo como:
    System.out.printlm(arbol.preorden(arbol.raiz)).
    La version publica que se crea sirve como un puente limpio y seguro entre el codigo externo y la logica interna del recorrido.
    */
    public String preorden() {
        return preorden(this.raiz);
    }

    public String inorden() {
        return inorden(this.raiz);
    }

    public String postorden() {
        return postorden(this.raiz);
    }
    
    
    
    
    
    public int calcularNivel(Nodo nodo, int valor, int nivel){
        /*
        if (nodo==null):
        Si el nodo es nulo, significa que llegamos a una rama vacia (no se encontro el valor en esa direccion).
        */
        if (nodo==null){
            //Retorna -1 como indicador de no encontrado.
            return -1;
        }
        
        /*
        if (nodo.getElemento().getNum()==valor):
        Si el numero del nodo actual es el que buscamos (valor).
        */
        if (nodo.getElemento().getNum()==valor){
            //Retorna el nivel actual. Se termina la busqueda porque ya encontramos el nodo. 
            return nivel; 
        }
        
        /*
        Buscar en el subarbol izquierdo:
        int nivelIzq= calcularNivel(nodo.getEnlaceIzq(),valor,nivel+1):
        Llama recursivamente al metodo para revisar el hijo izquierdo.
        
        */
        int nivelIzq= calcularNivel(nodo.getEnlaceIzq(),valor,nivel+1);
        /*
        if (nivelIzq!=-1){
        Si encuentra el valor en el subarbol izquierdo
        */
        if (nivelIzq!=-1){
            //Retorna el nivel inmediatamente.
            return nivelIzq;
        }
        
        /*
        return calcularNivel(nodo.getEnlaceDer(),valor,nivel+1);
        Si no se encontro en la izquierda, busca en el hijo derecho.
        Si no lo encuentra, la funcion devolvera -1.
        */
        return calcularNivel(nodo.getEnlaceDer(),valor,nivel+1);
        
    }
    
    
    
    public int obtenerAltura(Nodo raiz){
        /*
        if (raiz==null):
        Si la raiz esta vacia
        */
        if (raiz==null){
            //Retorna -1
            return -1;
        }
        
        /*
        int alturaIzq=obtenerAltura(raiz.getEnlaceIzq());
        Calcula la altura del subarbol izquierdo, aqui el metodo baja recursivamente hasta los nodos hoja. 
        */
        int alturaIzq=obtenerAltura(raiz.getEnlaceIzq());
        /*
        int alturaDer=obtenerAltura(raiz.getEnlaceDer());
        Calcula la altura del subarbol derecho, aqui el metodo baja recursivamente hasta los nodos hoja. 
        */
        int alturaDer=obtenerAltura(raiz.getEnlaceDer());
        
        /*
        return Math.max(alturaIzq, alturaDer)+1;
        Toma la mayor altura de los dos subarboles y le suma 1 para contar el nodo actual.
        */
        return Math.max(alturaIzq, alturaDer)+1;
    }
    
    
    

}
