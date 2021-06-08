
package clases;


public class Cuadrilatero {
    
     //declaracion de los atributo de la clase Cuadrilatero
    int base;
    int altura;
    
    //Constructor vacío
    public Cuadrilatero(){
        System.out.println("------");
    }
    
    //Constructor con dos parámetros
    public Cuadrilatero(int arg1, int arg2){
        
        
        this.base   = arg1;
        this.altura = arg2;
    }
    
    //Constructor de un parámetro
    public Cuadrilatero(int arg1){
        
        //inicialización de las variables locales
        this.base = arg1;
     
    }

    //Método que calular el perímetro del Cuadrilatero
    public int perimetro(){
        
        //fórmula para calcular el perímetro
        int per =2 * this.base + 2*this.altura;
        return per;
    }
    
    //Método para calcular el área de un Cuadrilatero
    public int area(){
        
        //fórmula par calcular el área
        int area= this.base * this.altura;
        return area;
    }
    
    //Método para calcular el perímetro de un cuadrado
    public int peri_cuadrado(){
  
        //fórmula para calcular el perímetro
        int per = 4 * this.base;
        return per;
    }
    
    //Método para calcular el área de un cuadrado
    public int area_cuadrado(){
  
        //fórmula para calcular el perímetro
        int area =  this.base * this.base ;
        return area;
    }
    
    
}
