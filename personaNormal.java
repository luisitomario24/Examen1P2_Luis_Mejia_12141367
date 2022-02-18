package Laboratorio5_P2;

public class personaNormal extends Persona{


    public personaNormal(String nombre, String poder, String debilidad, String heroe, String villano, int fuerza, int habilidad_mental, int habilidad_fisica, boolean tieneEscuadron) {
        super(nombre, poder, debilidad, heroe, villano, fuerza, habilidad_mental, habilidad_fisica, tieneEscuadron);
    }

    @Override
    public void finalChance() {

    }

    @Override
    public String toString() {
        return "personaNormal{" +
                "nombre='" + nombre + '\'' +
                ", poder='" + poder + '\'' +
                ", debilidad='" + debilidad + '\'' +
                ", heroe='" + heroe + '\'' +
                ", villano='" + villano + '\'' +
                ", fuerza=" + fuerza +
                ", habilidad_mental=" + habilidad_mental +
                ", habilidad_fisica=" + habilidad_fisica +
                ", tieneEscuadron=" + tieneEscuadron +
                '}';
    }
}
