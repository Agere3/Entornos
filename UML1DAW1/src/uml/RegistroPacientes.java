package uml;

import java.util.ArrayList;

public class RegistroPacientes {
	private ArrayList <Paciente> pacientes = new ArrayList<Paciente>();
	
	public float importeFacturas(String nif) {
		float coste = 0;
		for(Paciente p: pacientes) {
			if(p.getNif().contentEquals(nif)) {
				
			}
		}
		return coste;
	}
}
