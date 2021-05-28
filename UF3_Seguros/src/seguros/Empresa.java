package seguros;

import java.util.ArrayList;

public abstract class Empresa {
	protected String fechaContrato;
	protected double cuotaAnualBase;
	protected double descuentoORecargo;
	protected Cliente cliente;
	protected Poliza poliza;
	protected ArrayList<Parte> partes = new ArrayList<Parte>();
	
	
	//Ejercicio 2
	public String listaPartesEntreFechas(String fechaInicio, 
			String fechaFinal) {
		String res="";
		for(Parte parte:partes) {
			if(Fecha.compareTo(fechaInicio,parte.getFecha())==-1 && 
					Fecha.compareTo(fechaFinal,parte.getFecha())==1) {
				res += parte;
			}
		}
		return res;
	}
	//Ejercicio 3
	public int numpartesEnAnyo(int anyo) {
		int res=0;
		for(Parte parte:partes) {
			if(Fecha.getAnyoDeFecha(parte.getFecha())==anyo) {
				res ++;
			}
		}
		return res;
	}

	public double costeIncidenciaEnAnyo(int anyo) {
		int res=0;
		for(Parte parte:partes) {
			if(Fecha.getAnyoDeFecha(parte.getFecha())==anyo) {
				//if fechaInicio< fecha concreta < fecha final
				res += parte.getCosteIndemnizacion();
			}
		}
		return res;
	}
	
	//Ejercicio 4
	public void actualizarDescuentoORecargo() {
		if(numpartesEnAnyo(Fecha.getAnyoDeFecha(Fecha.getFechaDeHoy())-1)==getN() ||
				costeIncidenciaEnAnyo(Fecha.getAnyoDeFecha(Fecha.getFechaDeHoy())-1)>getTOTIND()) {
				descuentoORecargo += getD1();
		}
		if(numpartesEnAnyo(Fecha.getAnyoDeFecha(Fecha.getFechaDeHoy())-1)==0) {
			descuentoORecargo -= getD2();
		}
		if(descuentoORecargo>25) descuentoORecargo=25;
		if(descuentoORecargo<-15) descuentoORecargo=-15;
		
	}
	
	public abstract int getN();
	public abstract double getTOTIND();
	public abstract int getD1();
	public abstract int getD2();
	
	
	public Seguro(String fechaContrato, double cuotaAnualBase, 
			double descuentoORecargo, Cliente cliente, Poliza poliza) {
		this.fechaContrato = fechaContrato;
		this.cuotaAnualBase = cuotaAnualBase;
		this.descuentoORecargo = descuentoORecargo;
		this.cliente = cliente;
		this.poliza = poliza;
	}
	public Empresa() {}
	
	
}