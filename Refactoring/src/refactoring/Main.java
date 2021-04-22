package refactoring;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
		// demostració de construcció d'un vehicle de categoria BASIC
		
		Vehicle vehicle1 = new Vehicle("Tata", "Vista", Vehicle.BASIC);
		Date date = dateFormat.parse("2/8/2013");
		Lloguer lloguer1 = new Lloguer(date, 1, vehicle1);
		
		Vehicle vehicle2 = new Vehicle("Tete","Vestal", Vehicle.GENERAL);
		Date date2 = dateFormat.parse("22/1/2018");
		Lloguer lloguer2 = new Lloguer(date, 2, vehicle2);
		
		Vehicle vehicle3 = new Vehicle("Titi","Vistil", Vehicle.LUXE);
		Date date3 = dateFormat.parse("3/3/2016");
		Lloguer lloguer3 = new Lloguer(date, 3, vehicle3);
		
		Client micliente = new Client("41424344","Dave","+34 612345789");
		micliente.afegeix(lloguer1);
		micliente.afegeix(lloguer2);
		micliente.afegeix(lloguer3);
		System.out.println(micliente.informe());

	}
	
	public static String GestorLloguersLite(Client client) {
		/*Client: «nom del client»
        «nif»
        «telèfon»
        Lloguers: «num de lloguers del client»
        1. vehicle: «marca del vehícle del primer lloguer» «model»
           data d'inici: «data d'inici del lloguer»
           dies llogats: «nombre de dies llogats»
        2. «... dades de la resta de lloguers del client»*/
		
		return client.informe();
	}
}
