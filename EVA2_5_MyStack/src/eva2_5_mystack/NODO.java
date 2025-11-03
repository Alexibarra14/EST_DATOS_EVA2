/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_5_mystack;

public class NODO {
    private int valor;
    private NODO siguiente;
    private NODO previo;

    public NODO(int valor) {
        this.valor = valor;
        this.siguiente = null;
        this.previo=null;
    }

    public NODO() {
        siguiente=null;//final de la lista
        previo=null;
    }
    
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NODO getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NODO siguiente) {
        this.siguiente = siguiente;
}

    public NODO getPrevio() {
        return previo;
    }

    public void setPrevio(NODO previo) {
        this.previo = previo;
    }
}
