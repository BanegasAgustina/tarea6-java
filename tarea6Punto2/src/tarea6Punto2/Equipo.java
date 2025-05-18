package tarea6Punto2;

import java.util.ArrayList; //shift ctrl o 

public class Equipo {
private String nombreEquipo;
private int añoCreacion;
private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();


public Equipo(String nombreEquipo, int añoCreacion) {
	super();
	this.nombreEquipo = nombreEquipo;
	this.añoCreacion = añoCreacion;
}


public void agregarJugador(Jugador jugador) {
	this.jugadores.add(jugador);
}

public int getCantidadJugadores() {
	return this.jugadores.size();
}

public void eliminarJugador(Jugador jugador) {
	this.jugadores.remove(jugador);
}


public String getNombreEquipo() {
	return nombreEquipo;
}

public double PromedioEdades() {
	double suma=0;
	for(int i=0; i<this.jugadores.size();i++) {
		Jugador x=this.jugadores.get(i);
		suma+=x.getEdad();
	}
	return suma/this.getCantidadJugadores();
}

public double promedioMayoresdEdad() {
	double suma=0;
	double cant=0;
	for(int i=0; i<this.jugadores.size();i++) {
		Jugador x=this.jugadores.get(i);
		if(x.getEdad() >=18) {
			suma+=x.getEdad();
			cant++;
		}
	}
	return suma/cant;
}
public double promedioMenoresdEdad() {
	double suma=0;
	double cant=0;
	for(int i=0; i<this.jugadores.size();i++) {
		Jugador x=this.jugadores.get(i);
		if(x.getEdad()<=18) {
			suma+=x.getEdad();
			cant++;
		}
	}
	return suma/cant;
}

public double efectividadEquipo() {
	double suma=0;
	for(int i=0; i<this.jugadores.size();i++) {
		Jugador x=this.jugadores.get(i);
		suma+=x.getEfectividad();
	}
	
	return suma;
}


@Override
public String toString() {
	return "Equipo [nombreEquipo=" + nombreEquipo + ", añoCreacion=" + añoCreacion + ", jugadores=" + jugadores + "]";
}



}
