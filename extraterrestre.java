package Laboratorio5_P2;

public abstract class extraterrestre extends Persona {

    public extraterrestre() {

    }

    public extraterrestre(String nombre, String poder, String debilidad, String heroe, String villano, int fuerza, int habilidad_mental, int habilidad_fisica, boolean tieneEscuadron) {
        super(nombre, poder, debilidad, heroe, villano, fuerza, habilidad_mental, habilidad_fisica, tieneEscuadron);
    }

    @Override
    public String toString() {
        return "extraterrestre{" +
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
