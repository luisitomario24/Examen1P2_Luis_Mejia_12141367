package Laboratorio5_P2;

public class personaNormal extends Persona{

    public personaNormal(String nombre, String poder, String debilidad, String HeroeoVillano, int fuerza, int habilidad_mental, int habilidad_fisica, boolean tieneEscuadron) {
        super(nombre, poder, debilidad, HeroeoVillano, fuerza, habilidad_mental, habilidad_fisica,tieneEscuadron);

    }

    public personaNormal(String nombre, String HeroeoVillano,String poder , int fuerza, int habilidad_mental, int habilidad_fisica) {
        super(nombre, HeroeoVillano,poder, fuerza, habilidad_mental, habilidad_fisica);
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
                ", fuerza=" + fuerza +
                ", habilidad_mental=" + habilidad_mental +
                ", habilidad_fisica=" + habilidad_fisica +
                ", tieneEscuadron=" + tieneEscuadron +
                '}';
    }
}
