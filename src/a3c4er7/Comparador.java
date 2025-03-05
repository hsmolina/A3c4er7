
package a3c4er7;

public class Comparador {
    
    double a,b;
   
    public Comparador (double a, double b) {
       
        this.a = a;
        this.b = b;
       
    }
   
    //Método para calcular si A es mayor, menor o igual que B
    String comparadorAB() {
        if (a > b) {
            return "A es mayor que B";
        } else if (a == b) {
            return "A es igual a B";
        } else {
            return("A es menor que B");
        }
    }
      
}
