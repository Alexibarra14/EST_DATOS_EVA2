/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_lista;

/**
 *
 * @author oujeffu
 */
public class EVA2_2_LISTA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Lista mylist= new Lista();
      
         
         
         /*  long ini, fin,inic,finn;
        int [] arreglo= new int [1000000];
        ini=System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            arreglo[i]= (int)(Math.random()*1000);
        }
        fin=System.nanoTime();
      Long  tiempo=fin-ini;
        
        System.out.println("tiempo arreglo: "+ tiempo);
        
        
        
        inic=System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
          mylist.agregar((int)(Math.random()*100));
        }
        finn=System.nanoTime();
      Long  time=finn-inic;
        
        System.out.println("tiempo lista: "+ time);*/
        
        
       
       mylist.agregar(100);
        mylist.agregar(200);
        mylist.agregar(300);
        mylist.agregar(400);
        mylist.agregar(500);
        mylist.print();
        
        
        System.out.println("Cantidad de nodos: "+mylist.size());  
       
       mylist.vaciarLista();
       mylist.print();
        System.out.println("Cantidad de nodos: "+mylist.size()); 
        
         mylist.agregar(100);
        mylist.agregar(200);
        mylist.agregar(300);
        mylist.agregar(400);
        mylist.agregar(500);
        mylist.print();
        System.out.println("    ");
        System.out.println("Cantidad de nodos: "+mylist.size());  
        mylist.insertarEn(34, 1);
        mylist.print();
        System.out.println("Cantidad de nodos: "+mylist.size()); 
    }
    
    
    
    
}
