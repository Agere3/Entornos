package seguros;

import java.util.ArrayList;

public class Cliente {
	protected String nif;
	protected String direccio;
	protected String telefono;
	protected String clienteDesde;
	protected ArrayList<Seguro> seguros = new ArrayList<Seguro>();
	
	public Cliente(String nif, String direccio, String telefono,
			String clienteDesde) {
		this.nif = nif;
		this.direccio = direccio;
		this.telefono = telefono;
		this.clienteDesde = clienteDesde;
	}
	
	public Cliente() {}
	
}