package tarea6Punto1;

public class Chasis {
private String nChasis;
private double peso;


public Chasis(String nChasis, double peso) {
	super();
	this.nChasis = nChasis;
	this.peso = peso;
}
public String getnChasis() {
	return nChasis;
}
public double getPeso() {
	return peso;
}
@Override
public String toString() {
	return "chasis [nChasis=" + nChasis + ", peso=" + peso + "]";
}


}
