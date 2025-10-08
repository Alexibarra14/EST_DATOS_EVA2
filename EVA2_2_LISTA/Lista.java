/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_2_lista;

import javax.management.RuntimeErrorException;

/**
 *
 * @author oujeffu
 */
public class Lista {
    private NODO start;
    private NODO end;
    public Lista(){//lista vacia
        start=null;
        end=null;
        
    }
    
    
    public void agregar(int valor){//agregar nodo
        NODO nuevo= new NODO(valor);
        //conocer el estado de la lista
        //si hay nodos, movernos al final
        //verificar si la lista esta vacia 
        
        if(start== null){//lista vacia
            start= nuevo;
            end=start;
        }else{//hay muchos nodos
            //movernos al final de la lista
           /* NODO temp= start;
            while(temp.getSiguiente()!=null){//esto nos mueve al nodo final, sin necesidad de caer en el null
                temp=temp.getSiguiente();
            }
            temp.setSiguiente(nuevo);*/
           end.setSiguiente(nuevo);
           end=nuevo;
            
        }
        
    }
    
    public void print(){
        NODO temp= start;
            while(temp!=null){//esto nos mueve al nodo final, sin necesidad de caer en el null
                System.out.print("["+temp.getValor()+"]");
                temp=temp.getSiguiente();
            }
    }
    
    public int size(){
        int tama=0;
        NODO temp= start;
            while(temp!=null){//esto nos mueve al nodo final, sin necesidad de caer en el null
                tama+=1;
                temp=temp.getSiguiente();
            }
            return tama;
    }
    
    
    public void vaciarLista(){
        start= null;
        end= null;
    }
    
    
    
    public void insertarEn(int valor, int position){
        
        //verificar el estado de la lista
        //verificar la posicion
        //no podemos insertar nodos en una lista vacia
        
        if(start==null){
            throw new RuntimeException("Si la lista esta vacia, se node puede insertar un nodo");
        }else{//verificar la posicion
            int tama= size();
            if(position>=0&&position<tama){
                  NODO neww= new NODO(valor);
                if (position==0) {//piece of cake
                    neww.setSiguiente(start);
                    start=neww;
                }else{//dificil
                    //mover a temp
                    NODO temp= start;
                    int cont=0;
            while(cont<(position-1)){//esto nos mueve al nodo final, sin necesidad de caer en el null
                temp=temp.getSiguiente();
                cont++;
            }
            
            neww.setSiguiente(temp.getSiguiente());
            temp.setSiguiente(neww);
                }
            }else{
                throw new RuntimeException("Posicion Incorrecta");
            }
            
        }
        
    }
    
}
