
import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author oujeffu
 */
public class NODO implements Serializable {
    private int valor_x;
    private int valor_y;
    private NODO siguiente;
    private NODO previo;

    public NODO(int valor, int valor2) {// facilitar poner valores en la lista
        this.valor_x = valor;
        this. valor_y=valor2;
        this.siguiente = null;
        this.previo=null;
    }
    
    

    public NODO() {
        siguiente=null;//final de la lista
        previo=null;
    }
    
    public int getValorx() {
        return valor_x;
    }

    public void setValorx(int valor) {
        this.valor_x = valor;
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

    public int getValory() {
        return valor_y;
    }

    public void setValory(int valor) {
        this.valor_y = valor;
    }
    
    
}
