/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_double_linked_list;

/**
 *
 * @author oujeffu
 */
public class EVA2_3_DOUBLE_LINKED_LIST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Lista lista = new Lista();

        lista.agregar(10);
        lista.agregar(20);
        lista.agregar(30);
        lista.agregar(40);
        lista.agregar(50);
        ///////////////////////////////////////////////////////////////
        System.out.println(" normal:");
        lista.imprimir();
        ////////////////////////////////////////////////////////////////////
        System.out.println(" inversa:");
        lista.imprimirInverso();
        ////////////////////////////////////////////////////////////////////
        System.out.println("Insertar X numero en X posicion:");
        lista.insertar(25, 2);
        lista.imprimir();
        ///////////////////////////////////////////////////////////////////////
        System.out.println("Eliminar nodo en posición X posicion:");
        lista.borrarEn(3);
        lista.imprimir();
        //////////////////////////////////////////////////////////////////////////
        System.out.println("Valor en posición X: " + lista.buscarEn(2));
        System.out.println("Posición del valor X: " + lista.buscar(40));
        
    }
    
}
