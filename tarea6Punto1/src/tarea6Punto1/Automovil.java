package tarea6Punto1;

public class Automovil {

private String marca;
private int modelo;
private double precio;
private Chasis chaSis;
private Motor motor;


public Automovil(String marca, int modelo, Chasis chaSis, Motor motor) {
	super();
	this.marca = marca;
	this.modelo = modelo;
	this.chaSis = chaSis;
	this.motor = motor;
}


public String getMarca() {
	return marca;
}


public int getModelo() {
	return modelo;
}


public double getPrecio() {
	return precio;
}


public Chasis getChaSis() {
	return chaSis;
}


public Motor getMoTor() {
	return motor;
}


@Override
public String toString() {
	return "automovil [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", chaSis=" + chaSis + ", moTor="
			+ motor + "]";
}

public double getCilindrada() {
	double resultado = this.motor.getCilindrada();
	return resultado;
	//return this.moTor.getCilindrada();
}

}
