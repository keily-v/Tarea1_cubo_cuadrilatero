
package clases;

public class PruebaCuadrilatero {
    
    public static void main(String[] args) {
        
    //declaración de variable ob1 de la clase Cuadrilátero
    Cuadrilatero ob1 = new Cuadrilatero();
    
    ob1.base   = 5;
    ob1.altura = 5;
   
    
    if (ob1.base == ob1.altura){
        
        System.out.println("El perímetro del cuadrado es:" +ob1.peri_cuadrado());
        System.out.println("El área del cuadrado es:" +ob1.area_cuadrado());
        
    } else {
    System.out.println("El perímetro del cuadrilatero es:" +ob1.perimetro());
    System.out.println("El área del cuadrilatero es:" +ob1.area());
    }
    
    }
}

