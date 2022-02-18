package Laboratorio5_P2;

import Lab_Progra2.Animal;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static ArrayList<Persona> listapersonas =new ArrayList<Persona>();
    public static ArrayList<Escuadron>listaescuadrones=new ArrayList<Escuadron>();
    public static ArrayList<Universo>listauniversos=new ArrayList<Universo>();


    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        do{
            opciones( menu() );
        }while(true);}

    public static int menu(){
        Scanner leer=new Scanner (System.in);
        System.out.println("");
        System.out.println("");
        System.out.println("Bienvenido");
        System.out.println( "0.Salir\n"+
                "--Menu de Universo\n"+
                "1.Agregar Universo\n"+
                "1.Modificar Universo\n"+
                "2.Borrar Universo\n"+
                "3.Listar Universos\n"+
                "4.CrearUniverso\n" +

                "--Menu Escuadran" +
                "5.Crear Escuadrón " +
                "6.Modificar Escuadran" +
                "7.Borrar Escuadran" +
                "8.Listar Escuadran\n" +

                "--Menu personas" +
                "9.Crear persona" +
                "10.Modificar Persona" +
                "11.Eliminar Persona" +
                "12.Listar persona"
        );
        System.out.println("Porfavor ingrese una opcion ");
        return leer.nextInt();
    }
    public static void opciones(int opcion){
        if(opcion==0)
            System.exit(0);
        if(opcion==1)
            agregarUniverso();
        if(opcion ==2)
            modificarUniverso();
        if(opcion==3)
            borrarUniverso();
        if(opcion==4)
            System.out.println("h");
            listaruniverso();
        if(opcion==5)
            agregarescuadron();
        if(opcion==6)
            modificarEscuadron();
        if(opcion==7)
            borrarEscuadron();
        if(opcion==8)
            listarEscuadron();
        if(opcion==9)
            simularBatalla();
        if(opcion==10)
           agregarPersona();
        if(opcion==10)
            modificarpersona();
        if(opcion==11)
            borrarPersona();
        if(opcion==12)
            listarPersonas();


    }
    public static void agregarUniverso(){
        System.out.println("Ingrese el nombre del universo ");
        String nombre=leer.next();
        listauniversos.add(new Universo(nombre));
    }
    public static void modificarUniverso (){
        System.out.println("Ingrese la position ");
        int posicion=leer.nextInt();
        listauniversos.get(posicion).setNombre(leer.next());
    }
    public static  void borrarUniverso(){
        System.out.println("Ingrese la posicion del universo que desea eliminar" );
        int posicion=leer.nextInt();
        listauniversos.remove(posicion);
    }
    public static void listaruniverso(){
        for(Universo universos:listauniversos){
            System.out.println(universos);
        }
    }
    public static void agregarescuadron(){
        System.out.println("Ingrese el nombre del escuadron ");
        String nombre=leer.next();
        System.out.println("Ingrese el lugar del escuadron ");
        String lugar=leer.next();
        System.out.println("Ingrese el nombre de la base ");
        String base=leer.next();
        System.out.println("Escriba si ud es Heroe o Villano");
        String HeroeoVillano=leer.next();
        Escuadron escuadroncito=new Escuadron(nombre,lugar,base,HeroeoVillano);
        listaescuadrones.add(escuadroncito);

    }
    public static void modificarEscuadron (){
        System.out.println("Ingrese el escuadron es de heroe o villano ");
        String HeroeoVillano=leer.next();
        System.out.println("Ingrese la posicion de la persona en el escuadron");
        int posicion=leer.nextInt();
        if(listaescuadrones.get(posicion).getHeroeoVillano( ).equals(HeroeoVillano)){
            listaescuadrones.get(posicion).setHeroeoVillano("");
        }
        else if(1<0){
            System.out.println("XD");
        }


    }
    public static  void borrarEscuadron (){ //
        for(Escuadron escua:listaescuadrones){
            System.out.println(escua);
        }
    }
    public static void listarEscuadron(){

    }
    public static void simularBatalla(){

    }
    public static void agregarPersona(){
        System.out.println("Ingrese el nombre de la persona");
        String nombre=leer.next();
        System.out.println("Ingrese si es heroe o villano");
        String HeroeoVillano=leer.next();

        



    }
    public static void modificarpersona(){

    }
    public static void borrarPersona(){

    }
    public static void listarPersonas(){

    }


    }

