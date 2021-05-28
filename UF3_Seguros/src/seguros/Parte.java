package seguros;

public class Parte {
	private String descripcion;
	private String informe;
	private double costeIndemnizacion;
	private String fechaIncidencia;
	private Seguro seguro;
	private String fecha;
	
	public Parte(String descripcion, String informe, 
			double costeIndemnizacion, String fechaIncidencia, 
			Seguro seguro) {
		this.descripcion = descripcion;
		this.informe = informe;
		this.costeIndemnizacion = costeIndemnizacion;
		this.fechaIncidencia = fechaIncidencia;
		this.seguro = seguro;
	}
	
	public Parte() {}

	public String getFecha() {
		return fechaIncidencia;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public double getCosteIndemnizacion() {
		return costeIndemnizacion;
	}

	public void setCosteIndemnizacion(double costeIndemnizacion) {
		this.costeIndemnizacion = costeIndemnizacion;
	}
	
	
	
}