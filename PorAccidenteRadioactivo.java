package Laboratorio5_P2;

public class PorAccidenteRadioactivo extends Persona {

    int edadAlmomentoAccidente;
    String tipoPersona;


    public PorAccidenteRadioactivo(String nombre, String poder, String debilidad,String HeroeoVillano, int fuerza, int habilidad_mental, int habilidad_fisica, boolean tieneEscuadron) {
        super(nombre, poder, debilidad,HeroeoVillano,fuerza, habilidad_mental, habilidad_fisica, tieneEscuadron);
    }

    @Override
    public void finalChance() {

    }

    @Override
    public String toString() {
        return "PorAccidenteRadioactivo{" +
                "nombre='" + nombre + '\'' +
                ", poder='" + poder + '\'' +
                ", debilidad='" + debilidad + '\'' +
                ", HeroeoVillano='" + HeroeoVillano + '\'' +
                ", tipo_persona='" + tipo_persona + '\'' +
                ", fuerza=" + fuerza +
                ", habilidad_mental=" + habilidad_mental +
                ", habilidad_fisica=" + habilidad_fisica +
                ", tieneEscuadron=" + tieneEscuadron +
                ", edadAlmomentoAccidente=" + edadAlmomentoAccidente +
                ", tipoPersona='" + tipoPersona + '\'' +
                '}';
    }
}
