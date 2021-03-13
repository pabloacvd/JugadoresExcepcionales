package ar.com.xeven;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Juego {

    private List<Jugador> jugadores = new LinkedList<>();

    public Juego(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Juego() {
    }

    public void agregarJugador(Jugador j){
        jugadores.add(j);
    }
    public void crearJugador(){
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.print("Ingrese dni: ");
        String elDNI = sc.nextLine();
        int dni;
        try {
            dni = Integer.parseInt(elDNI);
        }catch (NumberFormatException e){
            dni = 0;
        }
        System.out.println("");
        System.out.print("Ingrese nombre: ");
        String nombre = sc.nextLine();
        try {
            agregarJugador(new Jugador(dni, nombre));
        } catch (DatosIncorrectosException e) {
            System.out.println("No se pudo crear el jugador. Intente nuevamente.");
        }
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
}
