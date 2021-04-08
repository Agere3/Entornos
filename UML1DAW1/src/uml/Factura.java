package uml;

import java.sql.Date;
import java.util.ArrayList;

public class Factura {
	//Atributos
		private int numero;
		private String descripcion;
		private Date fecha;
		
		private Paciente paciente;
		private ArrayList<LineaTratamiento> lineas;
		
	//Metodos
		public float calculaImporteFactura() {
			float importe = 0;
			for(LineaTratamiento lt: lineas) {   	//forma de recorer con un foreach
				importe = importe + lt.calculaImporte();
			}
			
			/*for(int = 0; i < lineas.size(); i++) {	//forma de recorrer con un get(i)
				LineaTratamiento lt = lineas.get(i);
				importe = importe + lt.calculaImporte();
			}
			*/
			return 0;
		}
		
		
		
}
