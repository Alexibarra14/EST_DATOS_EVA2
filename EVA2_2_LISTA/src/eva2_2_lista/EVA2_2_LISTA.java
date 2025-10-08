/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_lista;


public class EVA2_2_LISTA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Lista milista= new Lista();
      
       
       milista.agregar(100);
        milista.agregar(200);
        milista.agregar(300);
        milista.agregar(400);
        milista.agregar(500);
        milista.imprimir();
        System.out.println(" nodos: "+milista.size());  
       
       milista.vaciarLista();
       milista.imprimir();
        System.out.println(" nodos: "+milista.size()); 
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
         milista.agregar(10);
        milista.agregar(20);
        milista.agregar(30);
        milista.agregar(40);
        milista.agregar(50);
        milista.imprimir();
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("*****************************************************************************   ");
        System.out.println(milista.size());  
        milista.insertar(40, 2);
        milista.imprimir();
        System.out.println(milista.size()); 
        
        milista.borrarEn(1);
        milista.imprimir();
          System.out.println(milista.size());
          System.out.println(+milista.buscar(25) );
          System.out.println(milista.buscarEn(2));
          milista.imprimirInverso();
          System.out.println("");
    }
    
    
    
    
}
