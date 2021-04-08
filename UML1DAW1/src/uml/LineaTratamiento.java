package uml;

public class LineaTratamiento {
	//Atributos
	protected String concepto; //protected para que el hijo pueda ver este atributo
	
	//Metodo
	public float calculaImporte() {
		return 0;
	}

	//Constructores
	public LineaTratamiento(String concepto) {
		this.concepto = concepto;
	}
	
	public LineaTratamiento() { //Por defecto
		this.concepto="";
	}
	
	
	
}
