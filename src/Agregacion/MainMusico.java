package Agregacion;

public class MainMusico {
	public static void main(String[] args) {
		Musico musico1 = new Musico("John");
		Instrumento guitarra = new Instrumento("Guitarra", 3230.14);
		Instrumento piano = new Instrumento("Piano", 32000.00);
		musico1.agregarInstrumento(guitarra);
		musico1.agregarInstrumento(piano);
		System.out.println("Instrumentos de " + musico1.getNombre() + ":");
		for (Instrumento instrumento : musico1.getInstrumentos()) {
			System.out.println(instrumento.tipo);
		}
	}
}