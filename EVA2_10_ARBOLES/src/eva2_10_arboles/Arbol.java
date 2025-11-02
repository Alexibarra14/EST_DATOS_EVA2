/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_10_arboles;

/**
 *
 * @author aleja
 */
public class Arbol {
    private int cont; // contador de nodos
    private NODO raiz;

    public Arbol() {
        raiz = null;
        cont = 0; // inicializamos el contador
    }

    public void agregar(int valor) {
        if (raiz == null) {
            NODO nuevo = new NODO(valor);
            raiz = nuevo;
            cont++; 
        } else {
            agregarRecursivo(valor, raiz);
        }
    }

    private void agregarRecursivo(int valor, NODO actual) {
        // Verificar a qué lado del nodo va
        if (valor < actual.getValor()) { // Va a la izquierda
            if (actual.getIzq() == null) { // vacío
                NODO nuevo = new NODO(valor);
                actual.setIzq(nuevo);
                cont++; // se agregó un nodo
            } else { // ocupado
                agregarRecursivo(valor, actual.getIzq());
            }
        } else if (valor > actual.getValor()) { // Va a la derecha
            if (actual.getDere() == null) { // vacío
                NODO nuevo = new NODO(valor);
                actual.setDere(nuevo);
                cont++; // se agregó un nodo
            } else { // ocupado
                agregarRecursivo(valor, actual.getDere());
            }
        } else {
           
        }
    }

    public int size() {
        return cont;
    }
    public void imprimirPreOrder(){
         imprimirPreOrdderRec(raiz);
    }
   private void imprimirPreOrdderRec(NODO actual) {
        if (actual != null) {
            System.out.print(actual.getValor()+ " "); // Visita el nodo
            imprimirPreOrdderRec(actual.getIzq());     //Izquierda
            imprimirPreOrdderRec(actual.getDere());    //Derecha
        }
    }
   private void imprimirInOrderRec(NODO actual) {
        if (actual != null) {
            imprimirInOrderRec(actual.getIzq());     // 1. Izquierda
            System.out.print(actual.getValor() + " "); // 2. Nodo actual
            imprimirInOrderRec(actual.getDere());    // 3. Derecha
        }
    }

    public void imprimirInOrder() {
        System.out.println("Recorrido en inorden:");
        imprimirInOrderRec(raiz);
        System.out.println();
    }
        private void imprimirPostOrderRec(NODO actual) {
        if (actual != null) {
            imprimirPostOrderRec(actual.getIzq());   // 1. Izquierda
            imprimirPostOrderRec(actual.getDere());  // 2. Derecha
            System.out.print(actual.getValor() + " "); // 3. Nodo actual
        }
    }

    public void imprimirPostOrder() {
        System.out.println("Recorrido en postorden:");
        imprimirPostOrderRec(raiz);
        System.out.println();
    }
   
   
}

