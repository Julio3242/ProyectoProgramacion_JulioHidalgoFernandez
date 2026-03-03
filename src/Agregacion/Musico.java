package Agregacion;

import java.util.List;
import java.util.ArrayList;
//Completo
public class Musico {
	private String nombre;
	private List<Instrumento> instrumentos;

	public Musico(String nombre) {
		this.nombre = nombre;
		this.instrumentos = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public List<Instrumento> getInstrumentos() {
		return instrumentos;
	}

	public void agregarInstrumento(Instrumento instrumento) {
		instrumentos.add(instrumento);
	}
}
