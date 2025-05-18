package tarea6Punto2;

public class Jugador {
private String nombre;
private int edad;
private String posicion;
private double efectividad;

public Jugador(String nombre, int edad, String posicion, double efectividad) {
	super();
	this.nombre = nombre;
	this.edad = edad;
	this.posicion = posicion;
	this.efectividad = efectividad;
}

public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}

public String getPosicion() {
	return posicion;
}

public void setPosicion(String posicion) {
	this.posicion = posicion;
}

public double getEfectividad() {
	return efectividad;
}

public void setEfectividad(double efectividad) {
	this.efectividad = efectividad;
}

public String getNombre() {
	return nombre;
}

@Override
public String toString() {
	return "Jugador [nombre=" + nombre + ", edad=" + edad + ", posicion=" + posicion + ", efectividad=" + efectividad
			+ "]";
}


}
