
package clases;

public class PruebaCuadrilatero {
    
    public static void main(String[] args) {
        
    //declaración de variable ob1 de la clase Cuadrilátero
    Cuadrilatero ob1 = new Cuadrilatero();
    
    ob1.base   = 5;
    ob1.altura = 5;
   
    //si la base es igual a la altura, la figura es un cuadrado y sus medidas son diferentes es un rectángulo 
        
    if (ob1.base == ob1.altura){
        
        //impresión de área y perímetro del cuadrado 
        System.out.println("El perímetro del cuadrado es:" +ob1.peri_cuadrado());
        System.out.println("El área del cuadrado es:" +ob1.area_cuadrado());
        
    } else {
        //impresión de área y perímetro de un rectángulo
    System.out.println("El perímetro del cuadrilatero es:" +ob1.perimetro());
    System.out.println("El área del cuadrilatero es:" +ob1.area());
    }
    
    }
}

