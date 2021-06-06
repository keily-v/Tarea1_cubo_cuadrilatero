
package clases;

public class Cubo {
    
    //declaración de los atributos de la clase Cubo
    
    int ancho; //atributo ancho
    int alto; //atributo alto
    int prof; //atributo profundidad
    
    //Constructor vacío
    public Cubo() {   
        
    }
    
    //Constructor con 3 parámetros
    public Cubo(int a, int b, int c){
        
        //inicialización de las variables locales
        this.alto=a;
        this.alto=b;
        this.prof=c;
    }
    
    //método que calcula el volumen 
    public int volumen(){
    
        //fórmula para caultular el volumen
        int resultado= this.alto * this.ancho * this.prof ;
        return resultado;
        
    }
}
    
   