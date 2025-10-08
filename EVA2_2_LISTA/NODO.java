/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_2_lista;

/**
 *
 * @author oujeffu
 */
public class NODO {
    private int valor;
    private NODO siguiente;

    public NODO(int valor) {// facilitar poner valores en la lista
        this.valor = valor;
        this.siguiente = null;
    }

    public NODO() {
        siguiente=null;//final de la lista
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
    
    
}
