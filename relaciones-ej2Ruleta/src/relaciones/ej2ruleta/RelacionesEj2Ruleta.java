package relaciones.ej2ruleta;

import entidad.Juego;
import entidad.Jugador;
import entidad.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

public class RelacionesEj2Ruleta {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Revolver r = new Revolver();
        r.llenarRevolver();
        Juego j = new Juego();
        ArrayList<Jugador> jugadores = new ArrayList();
        System.out.print("ingrese cant de jugadores: ");
        int cantJugadores = leer.nextInt();

        if (cantJugadores > 6 || cantJugadores == 0) {
            cantJugadores = 6;
        }
        for (int i = 0; i < cantJugadores; i++) {
            jugadores.add(new Jugador(i + 1, ("Jugador " + (i + 1)), false));
        }
        System.out.println("");
        System.out.println("******************************");
        System.out.println("Los jugadores son: ");
        for (Jugador jugadore : jugadores) {
            System.out.println(jugadore);
        }
        System.out.println("");
        System.out.println("Pos. inicial: " + r.getPosActual() + "Pos Agua: " + r.getPosAgua());
        j.llenarJuego(jugadores, r);
        j.ronda();

    }

}
