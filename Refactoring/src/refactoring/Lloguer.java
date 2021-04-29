package refactoring;

import java.util.Date;

public class Lloguer {
	private Date data;
	private int dies;
	//private ArrayList<Vehicle> vehicles;//=new ArrayList<Vehicle>();
	private Vehicle vehicle;
	private static final double VALOR_ALQUIER_CORTO_VEHICULO_BASICO = 3;
	private static final double VALOR_PRECIO_DIARIO_VEHICULO_BASICO= 1.5;
	private static final double LIMITE_DIAS_ALQUILER_CORTO_BASICO= 3;
	
	private static final double VALOR_ALQUIER_CORTO_VEHICULO_GENERAL = 4;
	private static final double VALOR_PRECIO_DIARIO_VEHICULO_GENERAL= 2.5;
	private static final double LIMITE_DIAS_ALQUILER_CORTO_GENERAL= 2;
	
	private static final double VALOR_PRECIO_DIARIO_VEHICULO_LUXE= 6;

	public Lloguer(Date data, int dies, Vehicle vehicleBasic) {
		// TODO Auto-generated constructor stub
		this.data=data;
		this.dies=dies;
		this.vehicle=vehicleBasic;
	}
	
	
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public int getDies() {
		return dies;
	}
	public void setDies(int dies) {
		this.dies = dies;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	
	
	public double ImportTotalAPagar() {
		double costTotalLloguers = 0;
        switch (getVehicle().getCategoria()) {
            case Vehicle.BASIC:
            	costTotalLloguers += VALOR_ALQUIER_CORTO_VEHICULO_BASICO;
                if (getDies() > LIMITE_DIAS_ALQUILER_CORTO_BASICO) {
                	costTotalLloguers += (getDies() - LIMITE_DIAS_ALQUILER_CORTO_BASICO) * VALOR_PRECIO_DIARIO_VEHICULO_BASICO;
                }
                break;
            case Vehicle.GENERAL:
            	costTotalLloguers += VALOR_ALQUIER_CORTO_VEHICULO_GENERAL;
                if (getDies() > LIMITE_DIAS_ALQUILER_CORTO_GENERAL) {
                	costTotalLloguers += (getDies() - LIMITE_DIAS_ALQUILER_CORTO_GENERAL) * VALOR_PRECIO_DIARIO_VEHICULO_GENERAL;
                }
                break;
            case Vehicle.LUXE:
            	costTotalLloguers += getDies() * VALOR_PRECIO_DIARIO_VEHICULO_LUXE;
                break;
        }
		return costTotalLloguers;
	}
	
	public int bonificacions() {
    	int bonificacions=1;
    	if (getVehicle().getCategoria() == Vehicle.LUXE &&
                getDies()>1 ) {
            bonificacions ++;
        }
    	return bonificacions;
    }

	
	
}
