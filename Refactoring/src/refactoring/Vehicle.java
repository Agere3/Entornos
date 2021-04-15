package refactoring;

public class Vehicle {
	
	public static final String BASIC = "BASIC";
	public static final String GENERAL = "GENERAL";
	public static final String LUXE = "LUXE";
	
	private String model;
	private String marca;
	private String categoria;
	
	public Vehicle(String marca, String model, String categoria) {
		// TODO Auto-generated constructor stub
		this.model=model;
		this.marca=marca;
		this.categoria=categoria;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public static String getBasic() {
		return BASIC;
	}
	
	
	
}
