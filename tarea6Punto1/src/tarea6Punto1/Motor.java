package tarea6Punto1;

public class Motor {
	private String nSerie;
	private double cilindrada;
	private String tipoCombustible;

	public Motor(String nSerie, double cilindrada) {
		super();
		this.nSerie = nSerie;
		this.cilindrada = cilindrada;
	}

	public String getnSerie() {
		return nSerie;
	}

	public double getCilindrada() {
		return cilindrada;
	}

	public String getTipoCombustible() {
		return tipoCombustible;
	}

	@Override
	public String toString() {
		return "motor [nSerie=" + nSerie + ", cilindrada=" + cilindrada + ", tipoCombustible=" + tipoCombustible + "]";
	}


}
