
package clases;


public class PruebaCubo {
    
    public static void main(String[] args) {
        
        //delación de variable ob1 tipo Cubo
        Cubo ob1= new Cubo();
        
        ob1.ancho = 3;
        ob1.alto  = 2;
        ob1.prof  = 6;
        
        
        System.out.println("El volúmen de la caja es: "+ob1.volumen());
        
        
    }
    
}
