
package relaciones.ej3cartas;
import entidad.Baraja;

public class RelacionesEj3Cartas {

   
    public static void main(String[] args) {
        System.out.println("Creamos la baraja.....");
        Baraja b =new Baraja ();       
        
             
        
        System.out.println("Mezclamos: ");
        
        System.out.println("La baraja quedo mezclada asi: ");
        b.barajar();
          System.out.println(b);
          
          
                  
          System.out.println("Disponibles: " + b.cartasDisponibles());
          System.out.println("REPARTIMOS....");
          b.darCartas();
          System.out.println("");
              System.out.println("");
          System.out.println("los montones queraron asi...");
          
          System.out.println("el mazo: ");
          b.mostrarBaraja();
          System.out.println("Las repartidas son: ");
          b.cartasMonton();
          
          
            
       
        
 
    }
    
}
