/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_qeuees;

/**
 *
 * @author aleja
 */
public class EVA2_4_qeuees {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Myqueue cola= new Myqueue();
        
        cola.push(100);
        cola.push(200);
        cola.push(300);
        cola.push(400);
        System.out.println(cola.peek());
        System.out.println(cola.pop());
        cola.imprimir();
    }
    
}
