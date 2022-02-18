package Laboratorio5_P2;

public abstract class Persona {
    String  nombre,poder,debilidad,heroe,villano;
    int fuerza,habilidad_mental,habilidad_fisica;
    boolean tieneEscuadron;

    public Persona(){

    }
    public Persona(String nombre, String poder, String debilidad, String heroe, String villano, int fuerza, int habilidad_mental, int habilidad_fisica, boolean tieneEscuadron) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.heroe = heroe;
        this.villano = villano;
        this.fuerza = fuerza;
        this.habilidad_mental = habilidad_mental;
        this.habilidad_fisica = habilidad_fisica;
        this.tieneEscuadron = tieneEscuadron;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public String getHeroe() {
        return heroe;
    }

    public void setHeroe(String heroe) {
        this.heroe = heroe;
    }

    public String getVillano() {
        return villano;
    }

    public void setVillano(String villano) {
        this.villano = villano;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getHabilidad_mental() {
        return habilidad_mental;
    }

    public void setHabilidad_mental(int habilidad_mental) {
        this.habilidad_mental = habilidad_mental;
    }

    public int getHabilidad_fisica() {
        return habilidad_fisica;
    }

    public void setHabilidad_fisica(int habilidad_fisica) {
        this.habilidad_fisica = habilidad_fisica;
    }
    public boolean isTieneEscuadron() {
        return tieneEscuadron;
    }

    public void setTieneEscuadron(boolean tieneEscuadron) {
        this.tieneEscuadron = tieneEscuadron;
    }
    public abstract void finalChance();

    @Override
    public String toString() {
        return "Persona{" +
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
