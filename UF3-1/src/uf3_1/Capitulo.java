package uf3_1;

import java.util.ArrayList;

public class Capitulo {
	protected int duration;
	public final int DURATION=45;
	protected int num;
	protected Temporada temporada;
	protected ArrayList<Personaje> personajes;
	
	public Capitulo() {
		this.personajes = new ArrayList<Personaje>();
	}
	
	public Capitulo(int duration, int num) {
		this.duration = duration;
		this.num = num;
		this.personajes = new ArrayList<Personaje>();
	}
	
	public Capitulo(int num, Temporada temporada) {
		this.num = num;
		this.temporada = temporada;
	}
	
	public String listaPersonajes() {
		StringBuffer sb=new StringBuffer();
		for(Personaje p: personajes) {
			sb.append(p);// teniendo definido el toString en personaje
		}
		return sb.toString();
	}
	
	public int getDuration() { 
		return duration; 
	}
	
	public void setTemporada(Temporada temporada) {
		this.temporada = temporada;
	}
	
	public int getNum() { 
		return num; 
	}

	@Override
	public String toString() {
		return "Capitulo [duration=" + duration + ", DURATION=" + DURATION + ", num=" + num + ", temporada=" + temporada
				+ ", personajes=" + personajes + "]";
	}
	
}
