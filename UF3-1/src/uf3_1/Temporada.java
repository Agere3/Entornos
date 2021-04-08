package uf3_1;

import java.util.ArrayList;

public class Temporada {
	private int numero;
	private Serie serie;
	private ArrayList<Capitulo> capitulos;

	public String listaCapitulos() {
		StringBuffer sb=new StringBuffer();
		String titulo=serie.getTitulo();
		for(Capitulo p: capitulos) {
			sb.append(titulo+"T"+this.numero+"C"+p.getNum());// teniendo definido el toString en personaje
		}
		return sb.toString();
	}
	
	public Temporada() {
		capitulos=new ArrayList<Capitulo>();
	}
	
	public Temporada(int numero, Serie serie) {
		this.numero=numero;
		this.serie=serie;
		capitulos=new ArrayList<Capitulo>();
	}
	
	public boolean addCapitulo(Capitulo capitulo) {
		if(!capitulos.contains(capitulo)) {
			capitulos.add(capitulo);
			return true;
		}
		return false;
	}
}
