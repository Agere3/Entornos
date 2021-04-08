package uf3_1;

import java.util.ArrayList;

public class Serie {
	private String titulo;
	private List<Temporada> temporadas;
	
	
	
	///No refactoring
	public void duraciontotalSerie() {
		int duracion=0;
		for(Temporada temporada:temporadas) {
			ArrayList<Capitulo>capitulos=temporada.getCapitulo();
			for(Capitulo capitulo:capitulos) {
				duracion+=capitulo.getDuracion();
			}
		}
		System.out.println("La duracion de la serie es "+duracion);
	}
	
	///refactoring
	public void duraciontotalSerie2() {
		int duracion=0;
		for(Temporada temporada:temporadas) {
				duracion+=temporada.getMinutosTemporada();
			}
		System.out.println("La duracion de la serie es "+duracion);
		}
	
	public Serie(String titulo, ArrayList<Temporada>temporadas) {
		this.titulo=titulo;
		this.temporadas=temporadas;
	}
	
	
	public String getTitulo() {
		// TODO Auto-generated method stub
		return null;
	}

}
