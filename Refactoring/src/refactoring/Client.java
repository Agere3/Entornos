package refactoring;

import java.util.Vector;

public class Client {
	private String nif;
	private String nom;
	private String telefon;
	private Vector<Lloguer> lloguers;
	private static final double EUROS_PER_UNITAT_DE_COST = 30;
	
	public Client(String nif, String nom, String telefon) {
        this.nif = nif;
        this.nom = nom;
        this.telefon = telefon;
        this.lloguers = new Vector<Lloguer>();
    }

    public String getNif()     { return nif;     }
    public String getNom()     { return nom;     }
    public String getTelefon() { return telefon; }

    public void setNif(String nif) { this.nif = nif; }
    public void setNom(String nom) { this.nom = nom; }
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    public void afegeix(Lloguer lloguer) {
        if (! lloguers.contains(lloguer) ) {
            lloguers.add(lloguer);
        }
    }
    public void elimina(Lloguer lloguer) {
        if (lloguers.contains(lloguer) ) {
            lloguers.remove(lloguer);
        }
    }
    public boolean conte(Lloguer lloguer) {
        return lloguers.contains(lloguer);
    }

    
    public String informe() {
    	return composaCapsalera()+composaDetall()+composaPeu();
    }

	private String composaPeu() {
		// TODO Auto-generated method stub
		return "Import a pagar: " + importTotal() + "€\n" +
	            "Punts guanyats: " + bonificacionsTotals() + "\n";
	}

	private String composaDetall() {
		// TODO Auto-generated method stub
		String resultat = "";
		for (Lloguer lloguer: lloguers) {
            // composa els resultats d'aquest lloguer
            resultat += "\t" +
                lloguer.getVehicle().getMarca() +
                " " +
                lloguer.getVehicle().getModel() + ": " +
                (lloguer.ImportTotalAPagar() * EUROS_PER_UNITAT_DE_COST) + "€" + "\n";
        }
		return resultat;
	}

	private String composaCapsalera() {
		return "Informe de lloguers del client " +
	            getNom() +
	            " (" + getNif() + ")\n";
	}

	private int bonificacionsTotals() {
		int bonificacions = 0;
		for (Lloguer lloguer: lloguers) {
	        bonificacions += lloguer.bonificacions();

		}
		return bonificacions;
	}

	private int importTotal() {	
		int total = 0;
		for (Lloguer lloguer: lloguers) {
			total += lloguer.ImportTotalAPagar() * EUROS_PER_UNITAT_DE_COST;
		}
		return total;
	}
	
	private String informeHTML() {
		String codigoHTML="<h1>Informe de loguers</h1\n>"+
				"<p>Informe de lloguers del client <em>"+
				nom+" </em> (<strong>"+nif+"</strong>)</p>\n"+
				"<table>\n"+
				""
				;
		
		
		return codigoHTML;
	}
    
    

	
}

