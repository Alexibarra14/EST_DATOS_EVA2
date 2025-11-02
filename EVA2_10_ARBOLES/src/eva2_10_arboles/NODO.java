/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_10_arboles;

public class NODO {
    private int valor;
    private NODO izq;
    private NODO dere;

    public NODO(int valor) {
        this.valor = valor;
        this.izq = null;
        this.dere=null;
    }

    public NODO() {
        izq=null;//final de la lista
        dere=null;
    }

    public NODO getIzq() {
        return izq;
    }

    public void setIzq(NODO izq) {
        this.izq = izq;
    }

    public NODO getDere() {
        return dere;
    }

    public void setDere(NODO dere) {
        this.dere = dere;
    }
    
    public int getValor() {
        return valor;
    }

  
}
