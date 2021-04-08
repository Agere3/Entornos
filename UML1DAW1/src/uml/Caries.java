package uml;

public class Caries 
	extends LineaTratamiento {
	
	private int numDientesAfectados;

	//Constructores
	public Caries(String concepto, int numDientesAfectados) {
		super(concepto);
		this.numDientesAfectados = numDientesAfectados;
	}
	
	public Caries() { //Por defecto
		super();
		this.numDientesAfectados = 0;
	}
	
	

}
