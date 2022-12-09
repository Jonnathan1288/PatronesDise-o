package api;

public class AvionApi {

    public void buscarVuelos(String fechaIda, String fechaVuelta, String origen, String destino) {
		
            System.out.println("=========AEROLINEAS=========");
            System.out.println("Aerolineas disponibles: ");
            System.out.println("1) LATAM");
            System.out.println("2) CopaAirlines");
            System.out.println("3) jetBlue");
            System.out.println("4) Avianca");
            System.out.println("");
            System.out.println("Para " + destino + " desde " + origen);
            System.out.println("Fecha IDA: " + fechaIda + " Fecha Vuelta " + fechaVuelta);
            System.out.println("===========================================================");
            System.out.println("");
	}
}