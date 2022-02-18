package Laboratorio5_P2;

import java.util.ArrayList;

public class Universo {
    String nombre;
    ArrayList<Escuadron> escuadrones=new ArrayList<Escuadron>();

    public Universo(String nombre, ArrayList<Escuadron> escuadrones) {
        this.nombre = nombre;
        this.escuadrones = escuadrones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Escuadron> getEscuadrones() {
        return escuadrones;
    }

    public void setEscuadrones(ArrayList<Escuadron> escuadrones) {
        this.escuadrones = escuadrones;
    }

    @Override
    public String toString() {
        return "Universo{" +
                "nombre='" + nombre + '\'' +
                ", escuadrones=" + escuadrones +
                '}';
    }
}
