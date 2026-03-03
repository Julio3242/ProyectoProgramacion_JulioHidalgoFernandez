package Agregacion;

import java.util.List;
import java.util.ArrayList;

public class Musico {
	private String nombre;
	private List<Instrumento> instrumentos;

	public Musico(String nombre) {
		this.nombre = nombre;
		this.instrumentos = new ArrayList<>();
	}
}
