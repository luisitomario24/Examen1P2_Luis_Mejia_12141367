package Laboratorio5_P2;

import java.util.ArrayList;

public class Escuadron {

    String nombre,lugar,base;
    String persona;
    boolean HeroeoVillano;
    String lider;
    ArrayList<Persona>miembros=new ArrayList<>();

    public Escuadron(String nombre, String lugar, String base, String persona, boolean heroeoVillano, String lider, ArrayList<Persona> miembros) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.base = base;
        this.persona = persona;
        HeroeoVillano = heroeoVillano;
        this.lider = lider;
        this.miembros = miembros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public boolean isHeroeoVillano() {
        return HeroeoVillano;
    }

    public void setHeroeoVillano(boolean heroeoVillano) {
        HeroeoVillano = heroeoVillano;
    }

    public ArrayList<Persona> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<Persona> miembros) {
        this.miembros = miembros;
    }

    @Override
    public String toString() {
        return "Escuadron{" +
                "nombre='" + nombre + '\'' +
                ", lugar='" + lugar + '\'' +
                ", base='" + base + '\'' +
                ", persona='" + persona + '\'' +
                ", HeroeoVillano=" + HeroeoVillano +
                ", lider='" + lider + '\'' +
                ", miembros=" + miembros +
                '}';
    }
}
