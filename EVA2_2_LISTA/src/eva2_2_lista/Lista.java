/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_2_lista;

import javax.management.RuntimeErrorException;


public class Lista {
    private NODO inicio;
    private NODO fin;
    public Lista(){//lista vacia
        inicio=null;
        fin=null;
        
    }
    
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////     
    public void agregar(int valor){//agregar nodo
        NODO nuevo= new NODO(valor);
        
        
        if(inicio== null){//lista vacia
            inicio= nuevo;
            fin=inicio;
        }else{
           
           fin.setSiguiente(nuevo);
           fin=nuevo;
            
        }
        
    }
 //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
    public void imprimir(){
        NODO temp= inicio;
            while(temp!=null){//mover el nodo al final
                System.out.print("["+temp.getValor()+"]");
                temp=temp.getSiguiente();
            }
    }
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////     
    public int size(){
        int tama=0;
        NODO temp= inicio;
            while(temp!=null){
                tama+=1;
                temp=temp.getSiguiente();
            }
            return tama;
    }
    
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
    public void vaciarLista(){
        inicio= null;
        fin= null;
    }
    
    
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////     
    public void insertar(int valor, int posi){
        if(inicio==null){
            throw new RuntimeException("Si la lista esta vacia, se de puede insertar un nodo");
        }else{//verificar la posicion
            int tama= size();
            if(posi>=0&&posi<tama){
             NODO nuevo= new NODO(valor);
                if (posi==0) {
                    nuevo.setSiguiente(inicio);
                    inicio=nuevo;
                }else{
                    NODO temp= inicio;
                    int cont=0;
            while(cont<(posi-1)){
                temp=temp.getSiguiente();
                cont++;
            }
            
            nuevo.setSiguiente(temp.getSiguiente());
            temp.setSiguiente(nuevo);
                }
            }else{
                throw new RuntimeException("Posicion Incorrecta");
            }
            
        }
        
        
        
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
    //O(1)
    public  boolean listaVacia(){
            if (inicio==null){
                return true;
            }else{
                return false;
            }
                
                
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////         
}//O(N)
    public void borrarEn(int posi){
        if(inicio==null){
            throw new RuntimeException("Si la lista esta vacia, no se puede insertar el nodo");
        }else{
            int tama= size();
            if(posi>=0&&posi<tama){
                 
                if (posi==0) {
                   
                    if(tama==1){
                        vaciarLista();
                    }else{
                        inicio=inicio.getSiguiente();
                        
                    }
    
                  }
                else{
                    NODO temp= inicio;
                    int contador=0;
            while(contador<(posi-1)){
                temp=temp.getSiguiente();
                contador++;
            }
           temp.setSiguiente(temp.getSiguiente().getSiguiente());
            if(posi==(tama-1)){
                fin=temp;
            }
                }
            }else{
                throw new RuntimeException("Posicion erronea");
            }
        }
} //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
    //O(N)
    public int buscar(int valor){
       NODO temp= inicio;
       int contador=0;
        while(temp!=null){
            if(temp.getValor()==valor){
                break;
        }else{
            temp=temp.getSiguiente();
            contador++;
            }
        
    }
    return contador;
}
 //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////      
    public int buscarEn(int posi){
        NODO temp=inicio;
        int valor;
        int cont=0;
    while(temp!=null){
        if(cont==posi){
            break;
    }else{
         temp=temp.getSiguiente();
         cont++;
        }
            }
   valor=temp.getValor();
    return valor;
 
}
 //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////      
 public void imprimirInverso(){//O N2
     for (int i = size()-1; i >=0; i--) {
  System.out.print(buscarEn(i));
     }
 }
    
}