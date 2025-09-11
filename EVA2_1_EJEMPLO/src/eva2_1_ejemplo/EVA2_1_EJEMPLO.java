/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_ejemplo;

/**
 *
 * @author aleja
 */
public class EVA2_1_EJEMPLO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ejemplo miObj=new ejemplo();
        miObj.valor=100;
        miObj.sig=new ejemplo();
        miObj.sig.valor=200;
        miObj.sig.sig=new ejemplo();
        miObj.sig.sig.valor=300;
        miObj.sig.sig.sig=new ejemplo();
        miObj.sig.sig.sig.valor=400;
        
                
               
        
        
        ejemplo temp= miObj;
        while(temp!=null){
               System.out.println("["+temp.valor+"]");
            temp= temp.sig;
        }
       
                
                
    }
    
}
class ejemplo{
    int valor;
   ejemplo sig;
   
    
}