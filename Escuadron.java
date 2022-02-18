package Laboratorio5_P2;

import java.util.ArrayList;

public class Escuadron {

    String nombre,lugar,base;

    String  HeroeoVillano;
    String lider;
    ArrayList<Persona>miembros=new ArrayList<>();

    public Escuadron(String nombre, String lugar, String base, String HeroeoVillano, String lider) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.base = base;
        this.HeroeoVillano = HeroeoVillano;
        this.lider = lider;

    }
    public Escuadron(String nombre,String lugar,String base,String HeroeoVillano){
        this.nombre = nombre;
        this.lugar = lugar;
        this.base = base;
        this.HeroeoVillano = HeroeoVillano;
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

    public String  getHeroeoVillano() {
        return HeroeoVillano;
    }

    public void setHeroeoVillano(String  heroeoVillano) {
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
                ", HeroeoVillano=" + HeroeoVillano +
                ", lider='" + lider + '\'' +
                ", miembros=" + miembros +
                '}';
    }
}
