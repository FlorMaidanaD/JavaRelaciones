package entidad;

import java.util.ArrayList;
//import java.util.Scanner;

public class Juego {

    private ArrayList<Jugador> jugadores;
    private Revolver r;

    public Juego() {
    }

    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver r) {
        this.jugadores = jugadores;
        this.r = r;
    }

    public void ronda() {
        boolean repite;
        do {

            for (Jugador auxjugadores : jugadores) {
                Jugador j = auxjugadores;
                if (j.disparo(r)) {
                    System.out.println("El jugador que se mojo es: " + j.toString());
                    repite = true;
                    break;
                }
            }
        } while (repite = false);

    }

}
