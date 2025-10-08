/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_3_double_linked_list;
public class Lista {
    private NODO inicio;
    private NODO fin;
    private int tama;

    public Lista() { // lista vacía
        inicio = null;
        fin = null;
        tama = 0;
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////     
    public void agregar(int valor) {
        NODO nuevo = new NODO(valor);

        if (inicio == null) { // lista vacía
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            nuevo.setPrevio(fin);
            fin = nuevo;
        }
        tama++; // aument
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
    public void imprimir() {
        NODO temp = inicio;
        while (temp != null) {
            System.out.print("[" + temp.getValor() + "]");
            temp = temp.getSiguiente();
        }
        System.out.println();
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////     
    public int size() {
        return tama; // O(1)
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
    public void vaciarLista() {
        inicio = null;
        fin = null;
        tama = 0;
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////     
    public void insertar(int valor, int posi) {
        if (inicio == null) {
            throw new RuntimeException("La lista está vacía, no se puede insertar.");
        } else if (posi < 0 || posi > tama) {
            throw new RuntimeException("Posición incorrecta.");
        } else {
            NODO nuevo = new NODO(valor);

            if (posi == 0) { //inicio
                nuevo.setSiguiente(inicio);
                inicio.setPrevio(nuevo);
                inicio = nuevo;

            } else if (posi == tama) { //  final
                fin.setSiguiente(nuevo);
                nuevo.setPrevio(fin);
                fin = nuevo;

            } else { // Enmedio
                NODO temp = inicio;
                for (int i = 0; i < posi - 1; i++) {
                    temp = temp.getSiguiente();
                }
                nuevo.setSiguiente(temp.getSiguiente());
                nuevo.setPrevio(temp);
                temp.getSiguiente().setPrevio(nuevo);
                temp.setSiguiente(nuevo);
            }
            tama++; // aumenta 
        }
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
    public boolean listaVacia() {
        return inicio == null;
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////         
    public void borrarEn(int posi) {
        if (inicio == null) {
            throw new RuntimeException("La lista está vacía, no se puede borrar.");
        } else if (posi < 0 || posi >= tama) {
            throw new RuntimeException("Posición errónea.");
        } else {
            if (tama == 1) { // un solo nodo
                vaciarLista();
                return;
            }

            if (posi == 0) { // borrar inicio
                inicio = inicio.getSiguiente();
                inicio.setPrevio(null);

            } else if (posi == tama - 1) { // borrar fin
                fin = fin.getPrevio();
                fin.setSiguiente(null);

            } else { // borrar en medio
                NODO temp = inicio;
                for (int i = 0; i < posi; i++) {
                    temp = temp.getSiguiente();
                }
                temp.getPrevio().setSiguiente(temp.getSiguiente());
                temp.getSiguiente().setPrevio(temp.getPrevio());
            }

            tama--; // reduce tamaño
        }
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
    public int buscar(int valor) {
        NODO temp = inicio;
        int contador = 0;
        while (temp != null) {
            if (temp.getValor() == valor) {
                return contador;
            }
            temp = temp.getSiguiente();
            contador++;
        }
        return -1;
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////      
    public int buscarEn(int posi) {
        if (posi < 0 || posi >= tama) {
            throw new RuntimeException("Posición fuera de rango");
        }

        NODO temp = inicio;
        for (int i = 0; i < posi; i++) {
            temp = temp.getSiguiente();
        }
        return temp.getValor();
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////      
    public void imprimirInverso() {
        NODO temp = fin;
        while (temp != null) {
            System.out.print("[" + temp.getValor() + "]");
            temp = temp.getPrevio();
        }
        System.out.println();
    }
}
