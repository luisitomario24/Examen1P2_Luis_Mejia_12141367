package Laboratorio5_P2;

public class Superhumano extends Persona {

    String superpoder;

    public Superhumano(String nombre, String poder, String debilidad, String HeroeoVillano, int fuerza, int habilidad_mental, int habilidad_fisica, boolean tieneEscuadron) {
        super(nombre, poder, debilidad ,HeroeoVillano, fuerza, habilidad_mental, habilidad_fisica, tieneEscuadron);
    }


    @Override
    public void finalChance() {

    }

    @Override
    public String toString() {
        return "Superhumano{" +
                "nombre='" + nombre + '\'' +
                ", poder='" + poder + '\'' +
                ", debilidad='" + debilidad + '\'' +
                ", HeroeoVillano='" + HeroeoVillano + '\'' +
                ", tipo_persona='" + tipo_persona + '\'' +
                ", fuerza=" + fuerza +
                ", habilidad_mental=" + habilidad_mental +
                ", habilidad_fisica=" + habilidad_fisica +
                ", tieneEscuadron=" + tieneEscuadron +
                ", superpoder='" + superpoder + '\'' +
                '}';
    }
}
