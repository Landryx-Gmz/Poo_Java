import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Videojuegos>arrayJuegos=new ArrayList<Videojuegos>();

        Videojuegos juego1 = new Videojuegos(1,"MarioKart","Nintendo64",60000,"Carreras");
        Videojuegos juego2 = new Videojuegos(2,"Fifa24","PS5",150000,"Deporte");
        Videojuegos juego3 = new Videojuegos(3,"Zelda","Nintendo64",170000,"Aventura");
        Videojuegos juego4 = new Videojuegos(4,"PokemonZ-A","NintendoSwitch",30000,"RPG");
        Videojuegos juego5 = new Videojuegos(5,"SonicAventure","Xbox one",60000,"Carreras");

        arrayJuegos.add(juego1);
        arrayJuegos.add(juego2);
        arrayJuegos.add(juego3);
        arrayJuegos.add(juego4);
        arrayJuegos.add(juego5);


        System.out.println("Los Juegos ,sus consolas y su numero de jugadores es: ");
        //Recorrido Foreach
//        for (Videojuegos minilist:arrayJuegos){
//            System.out.println("El juego: " + minilist.getTitulo() + " de la conosola " + minilist.getConsola() + " Tiene " + minilist.getCantJugadores() + " Jugadores" );
//        }
        for (int i = 0;i<arrayJuegos.size();i++) {
            System.out.println("El juego: " + arrayJuegos.get(i).getTitulo() + " de la conosola " + arrayJuegos.get(i).getConsola() +
                    " tiene " + arrayJuegos.get(i).getCantJugadores() + " Jugadores" );
        }

        juego2.setTitulo("Fifa23");
        juego2.setCantJugadores(50000);
        juego5.setTitulo("SonicAdventure2");
        juego5.setCantJugadores(80000);

        System.out.println("Los juegos que se han modificado son: " );
        System.out.println( juego2.toString());
        System.out.println( juego5.toString());


        System.out.println("Los juegos de Nintendo64 son: ");
        for (Videojuegos list64:arrayJuegos) {
            if (list64.getConsola().equals("Nintendo64")) {
                System.out.println(list64.toString());
            }
        }
    }



}
