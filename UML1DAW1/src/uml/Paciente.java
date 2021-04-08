package uml;

import java.util.ArrayList;

public class Paciente {
	private String nif;
	private String nombre;
	private String direccion;
	
	ArrayList<Factura> facturas = new ArrayList<Factura>();

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public ArrayList<Factura> getFacturas() {
		return facturas;
	}

	public void setFacturas(ArrayList<Factura> facturas) {
		this.facturas = facturas;
	}
	
	//Metodos
	
	public float costeFacturas() {
		float coste=0;
		for(Factura f: facturas) {
			coste=coste+f.calculaImporteFactura();
		}
	}
	

}
