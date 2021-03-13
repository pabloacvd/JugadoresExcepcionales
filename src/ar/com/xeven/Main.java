package ar.com.xeven;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Vamos a crear jugadores!");
        Juego j = new Juego();
        int op = 0;
        Scanner sc = new Scanner(System.in);
        do{
            j.crearJugador();
            System.out.print("¿Desea crear un nuevo jugador? 1=si, 0=no ");
            op = Integer.parseInt(sc.nextLine());
        }while(op!=0);

        for(Jugador jugador : j.getJugadores()){
            System.out.println(jugador.toString());
        }
    }
}
