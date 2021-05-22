package uf3_1;

import java.util.ArrayList;

public class Serie {
	private String titulo;
	private ArrayList<Temporada> temporadas;
	
	
	
	///No refactoring
	public void duracionTotalSerie() {
		int duracion = 0;
		for(Temporada temporada: temporadas) {
				ArrayList<Capitulo> capitulos = temporada.getCapitulo();
				for(Capitulo capitulo: capitulos) {
					duracion += capitulo.getDuration();
				}
		}
		System.out.println("La duración de la serie es " + duracion);
	}
	
	///refactoring
	public void duracionTotalSerieCON() {
		int duracion = 0;
		for(Temporada temporada: temporadas) {
			duracion += temporada.getMinutosTemporada();
		}
		System.out.println("La duración de la serie es " + duracion);
	}
	
	public Serie() {
		this.titulo = "";
		this.temporadas = new ArrayList<Temporada>();;
	}
	
	public Serie(String titulo, ArrayList<Temporada> temporadas) {
		this.titulo = titulo;
		this.temporadas = new ArrayList<Temporada>();
	}
	
	public boolean addTemporada(Temporada temporada) {
		temporadas.add(temporada);
		temporada.setSerie(this);
		return true;
	}
	
	
	public String getTitulo() {
		// TODO Auto-generated method stub
		return null;
	}

}
