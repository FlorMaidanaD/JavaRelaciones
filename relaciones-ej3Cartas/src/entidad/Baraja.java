package entidad;

import Enum.Numero;
import Enum.Palo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Baraja {

    private List<Carta> cartas = new ArrayList();
    Scanner leer = new Scanner(System.in);

      ArrayList<Carta> repartidas = new ArrayList<>();

    public Baraja() {
        for (Numero numaux : Numero.values()) {
            for (Palo paloaux : Palo.values()) {
                cartas.add(new Carta(numaux, paloaux));
            }
        }
    }

    @Override
    public String toString() {
        return "Baraja: " + cartas;
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    public int cartasDisponibles() {
        int cant = 0;
        for (Carta carta : cartas) {
            cant = cant + 1;
        }
        return cant;
    }

    public Carta siguienteCarta() {
        Carta nextCard = this.cartas.get(0);
        System.out.println(this.cartas.get(0));

        cartas.remove(0);
        if (this.cartasDisponibles() == 0) {
            System.out.println("\n1 No hay más cartas.\n");
        }
        return nextCard;
    }
 

    
  
    public void darCartas() {
        System.out.println("Ingrese la cantidad de Cartas a dar: ");
        int cantidadCartas = leer.nextInt();

        if (cartasDisponibles() >= cantidadCartas) {        

            for (int i = 0; i < cantidadCartas; i++) {

                repartidas.add(this.siguienteCarta());
            }


        }else{
             System.out.println("\n2 No hay tantos naipes.");
        }

       
  
    }
    
    public void cartasMonton() {        
        Iterator it = repartidas.iterator();
        if (it.hasNext()) {
            while (it.hasNext()) {
                System.out.println(it.next() + " ");
            }
        } 
        else{
            System.out.println("3 Aun no re repartio ninguna carta....");
        }
    }
      public void mostrarBaraja() {        
        Iterator it = cartas.iterator();
        if (it.hasNext()) {
            while (it.hasNext()) {
                System.out.println(it.next() + " ");
            }
        } 
        else{
            System.out.println("4 ya no hay cartas en la baraja");
        }
    }
}
