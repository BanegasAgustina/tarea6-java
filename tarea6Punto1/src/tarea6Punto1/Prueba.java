package tarea6Punto1;

public class Prueba {

	public static void main(String[] args) {
		Motor m = new Motor("ks234_234",2500);
		Chasis ch = new Chasis("ch_234", 800);

		Automovil a = new Automovil("volkswagen", 2014, ch, m);

		System.out.println(a);
	}
}
