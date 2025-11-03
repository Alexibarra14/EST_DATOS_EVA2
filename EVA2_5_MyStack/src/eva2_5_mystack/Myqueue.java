/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_5_mystack;

public class Myqueue {
    private NODO inicio;
    private NODO fin;
    private int tama;

    public Myqueue() {
        inicio = null;
        fin = null;
        tama = 0;
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void agregar(int valor) {
        NODO nuevo = new NODO(valor);

        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            nuevo.setPrevio(fin);
            fin = nuevo;
        }
        tama++;
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
        return tama;
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

            if (posi == 0) {
                nuevo.setSiguiente(inicio);
                inicio.setPrevio(nuevo);
                inicio = nuevo;

            } else if (posi == tama) {
                fin.setSiguiente(nuevo);
                nuevo.setPrevio(fin);
                fin = nuevo;

            } else {
                NODO temp = inicio;
                for (int i = 0; i < posi - 1; i++) {
                    temp = temp.getSiguiente();
                }
                nuevo.setSiguiente(temp.getSiguiente());
                nuevo.setPrevio(temp);
                temp.getSiguiente().setPrevio(nuevo);
                temp.setSiguiente(nuevo);
            }
            tama++;
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
            if (tama == 1) {
                vaciarLista();
                return;
            }

            if (posi == 0) {
                inicio = inicio.getSiguiente();
                inicio.setPrevio(null);

            } else if (posi == tama - 1) {
                fin = fin.getPrevio();
                fin.setSiguiente(null);

            } else {
                NODO temp = inicio;
                for (int i = 0; i < posi; i++) {
                    temp = temp.getSiguiente();
                }
                temp.getPrevio().setSiguiente(temp.getSiguiente());
                temp.getSiguiente().setPrevio(temp.getPrevio());
            }

            tama--;
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

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    

    public void push(int valor) { // O(1)
        agregar(valor);
    }

    public int peek() { // O(1)
        if (fin == null)
            throw new RuntimeException("La pila está vacía");
        return fin.getValor(); // se lee el último elemento 
    }

    public int pop() { // O(1)
        if (fin == null)
            throw new RuntimeException("La pila está vacía");

        int valor = fin.getValor();

        if (fin == inicio) { // un solo elemento
            vaciarLista();
        } else {
            fin = fin.getPrevio();
            fin.setSiguiente(null);
            tama--;
        }
        return valor;
    }
}