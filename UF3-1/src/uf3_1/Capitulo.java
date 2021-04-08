package uf3_1;

import java.util.ArrayList;

public class Capitulo {
	protected int duration;
	public final int DURATION=45;
	protected int num;
	protected Temporada temporada;
	protected ArrayList<Personaje> personajes;
	
	public Capitulo() {
		
	}
	
	public Capitulo(int duration) {
		
	}
	
	public Capitulo(int duration, Temporada temporada) {
		this.duration=duration;
		this.temporada=temporada;		
		
	}
	
	public String listaPersonajes() {
		StringBuffer sb=new StringBuffer();
		for(Personaje p: personajes) {
			sb.append(p);// teniendo definido el toString en personaje
		}
		return sb.toString();
	}

	@Override
	public String toString() {
		return "Capitulo [duration=" + duration + ", DURATION=" + DURATION + ", num=" + num + ", temporada=" + temporada
				+ ", personajes=" + personajes + "]";
	}
	
}
