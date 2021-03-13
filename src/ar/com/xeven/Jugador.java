package ar.com.xeven;

import java.util.Scanner;

public class Jugador {
    private int dni;
    private String nombre;

    public Jugador(Integer dni, String nombre) throws DatosIncorrectosException {
        this.nombre = nombre;
        setDni(dni);
    }

    public void jugar(){
        System.out.printf("Soy %s y estoy jugando", nombre);
    }


    public void setDni(int dni) throws DatosIncorrectosException {
        if(String.valueOf(dni).length()!=8){
            throw new DatosIncorrectosException("El DNI debe tener 8 dígitos.");
        }else{
            this.dni = dni;
        }
    }

    public int getDni() {
        return dni;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
