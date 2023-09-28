package gestionPartidosDeFutbol;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Carlos Cordoba",35,"Arquero",1);
        Jugador jugador2 = new Jugador("Ivan Cortez",25,"Arquero",2);
        Jugador jugador3 = new Jugador("Sergio Ramos",26,"Defensa",3);
        Jugador jugador4 = new Jugador("Daniel Muñoz",28,"Defensa",4);
        Jugador jugador5 = new Jugador("Dani Alves",32,"Defensa",5);
        Jugador jugador6 = new Jugador("James Rodriguez",19,"Central",6);
        Jugador jugador7 = new Jugador("Casemiro",22,"Central",7);
        Jugador jugador8 = new Jugador("Toni Kross",33,"Central",8);
        Jugador jugador9 = new Jugador("Juan Quintero",23,"Central",9);
        Jugador jugador10 = new Jugador("Messi",31,"Delantero",10);
        Jugador jugador11 = new Jugador("Cristiano Ronaldo",35,"Delantero",11);
        Jugador jugador12 = new Jugador("Angel DiMaria",24,"Delantero",12);
        Jugador jugador13 = new Jugador("Pele",27,"Delantero",13);
        Jugador jugador14 = new Jugador("Maradona",30,"Delantero",14);
        Jugador jugador15 = new Jugador("Klose",20,"Delantero",15);
        Jugador jugador16 = new Jugador("Neymar",18,"Delantero",16);

        jugador1.agregarHabilidad("Velocidad");
        jugador2.agregarHabilidad("Regate");
        jugador3.agregarHabilidad("Disparo");
        jugador4.agregarHabilidad("Velocidad");
        jugador5.agregarHabilidad("Regate");
        jugador6.agregarHabilidad("Disparo");
        jugador7.agregarHabilidad("Velocidad");
        jugador8.agregarHabilidad("Regate");
        jugador9.agregarHabilidad("Disparo");
        jugador10.agregarHabilidad("Velocidad");
        jugador11.agregarHabilidad("Regate");
        jugador12.agregarHabilidad("Disparo");
        jugador13.agregarHabilidad("Velocidad");
        jugador14.agregarHabilidad("Regate");
        jugador15.agregarHabilidad("Disparo");
        jugador1.agregarHabilidad("Disparo");
        jugador2.agregarHabilidad("Disparo");

        Equipo equipo1 = new Equipo("Nacional", "Leonel Alvarez", "Atanasio Girardot");
        Equipo equipo2 = new Equipo("America", "Adrian Ramos", "Pascual Guerrero");
        Equipo equipo3 = new Equipo("Millonarios", "Gamero", "El Campín");

        equipo1.agregarJugador(jugador1);
        equipo1.agregarJugador(jugador2);
        equipo1.agregarJugador(jugador3);
        equipo1.agregarJugador(jugador4);
        equipo1.agregarJugador(jugador5);
        equipo1.agregarJugador(jugador6);
        equipo2.agregarJugador(jugador7);
        equipo2.agregarJugador(jugador8);
        equipo2.agregarJugador(jugador9);
        equipo2.agregarJugador(jugador10);
        equipo2.agregarJugador(jugador11);
        equipo3.agregarJugador(jugador12);
        equipo3.agregarJugador(jugador13);
        equipo3.agregarJugador(jugador14);
        equipo3.agregarJugador(jugador15);
        equipo3.agregarJugador(jugador16);

        System.out.println(equipo1);
        System.out.println(equipo2);
        System.out.println(equipo3);

        Partido partido1 = new Partido(equipo1, equipo2, new Date(122, Calendar.MAY,12,12,0,0));
        Partido partido2 = new Partido(equipo1, equipo3, new Date(122, Calendar.MAY,15,12,0,0));
        Partido partido3 = new Partido(equipo2, equipo3, new Date(122, Calendar.MAY,18,12,0,0));

        partido1.registrarResultado(1,0);
        partido2.registrarResultado(0,0);
        partido3.registrarResultado(2,1);

        System.out.println(partido1.calcularGanador());
        System.out.println(partido2.calcularGanador());
        System.out.println(partido3.calcularGanador());

    }
}
