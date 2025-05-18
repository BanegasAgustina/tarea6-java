package tarea6Punto2;

public class Prueba {
    public static void main(String[] args) {
        Equipo seleccionArgentina = new Equipo("Selección Argentina", 1893);

        Jugador messi = new Jugador("Lionel Messi", 36, "Delantero", 95.0);
        Jugador dibu = new Jugador("Emiliano Martínez", 31, "Arquero", 90.0);
        Jugador julian = new Jugador("Julián Álvarez", 24, "Delantero", 88.0);
        Jugador dePaul = new Jugador("Rodrigo De Paul", 30, "Mediocampista", 85.0);
        Jugador diMaria = new Jugador("Ángel Di María", 36, "Delantero", 89.0);

        seleccionArgentina.agregarJugador(messi);
        seleccionArgentina.agregarJugador(dibu);
        seleccionArgentina.agregarJugador(julian);
        seleccionArgentina.agregarJugador(dePaul);
        seleccionArgentina.agregarJugador(diMaria);

        System.out.println("Nombre del equipo: " + seleccionArgentina.getNombreEquipo());
        System.out.println("Cantidad de jugadores: " + seleccionArgentina.getCantidadJugadores());
        System.out.println("Promedio de edades: " + seleccionArgentina.PromedioEdades());
        System.out.println("Promedio mayores de edad: " + seleccionArgentina.promedioMayoresdEdad());
        System.out.println("Promedio menores de edad: " + seleccionArgentina.promedioMenoresdEdad());
        System.out.println("Efectividad total del equipo: " + seleccionArgentina.efectividadEquipo());
        System.out.println(seleccionArgentina.toString());
    }
}
