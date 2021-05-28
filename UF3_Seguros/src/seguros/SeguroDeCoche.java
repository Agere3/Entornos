package seguros;

public class SeguroDeCoche extends Seguro{
	private String gamaVehiculo;
	
	public SeguroDeCoche(String fechaContrato, 
			double cuotaAnualBase, double descuentoORecargo, 
			Cliente cliente,Poliza poliza,
			String vehiculo) {
		super(fechaContrato, cuotaAnualBase, descuentoORecargo, cliente, poliza);
		this.gamaVehiculo = gamaVehiculo;
	}
	
	public SeguroDeCoche() {
		super();
		
	}

	@Override
	public int getN() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public double getTOTIND() {
		// TODO Auto-generated method stub
		return 500;
	}

	@Override
	public int getD1() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public int getD2() {
		// TODO Auto-generated method stub
		return 1;
	} 
}