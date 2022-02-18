package Laboratorio5_P2;

public class PorAccidenteRadioactivo extends Persona {

    int edadAlmomentoAccidente;
    String tipoPersona;


    public PorAccidenteRadioactivo(String nombre, String poder, String debilidad, String heroe, String villano, int fuerza, int habilidad_mental, int habilidad_fisica, boolean tieneEscuadron) {
        super(nombre, poder, debilidad, heroe, villano, fuerza, habilidad_mental, habilidad_fisica, tieneEscuadron);
    }

    @Override
    public void finalChance() {

    }


}
