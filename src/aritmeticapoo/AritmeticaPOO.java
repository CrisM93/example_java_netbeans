
package aritmeticapoo;

/**
 *
 * @author crizt
 */
public class AritmeticaPOO {
   
    public static void main(String[] args) {
        // TODO code application logic here
        Aritmetica aritmetica=new Aritmetica();
        aritmetica.a=10;
        aritmetica.b=5;
        
        aritmetica.suma();
        
        int resultado=aritmetica.sumarConRetorno();
        System.out.println("Resultado="+ resultado);
        
        
        int resultado1=aritmetica.sumarConArgumentos(5, 7);
        System.out.println("Resultado="+ resultado1);
        
    }
    
}
