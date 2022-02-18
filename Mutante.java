package Laboratorio5_P2;

import java.util.ArrayList;

public class Mutante extends Persona {
    ArrayList<Persona>factoresmutantes = new ArrayList<Persona>();

    public Mutante(String nombre, String poder, String debilidad, String heroe, String villano, int fuerza, int habilidad_mental, int habilidad_fisica, boolean tieneEscuadron) {
        super(nombre, poder, debilidad, heroe, villano, fuerza, habilidad_mental, habilidad_fisica, tieneEscuadron);
    }


    @Override
    public void finalChance() {

    }
}
