package facade;

import api.AvionApi;
import api.HotelApi;


public class Fachada {

        private AvionApi avionApi;
	private HotelApi hotelApi;	
	
	public Fachada() {
		avionApi = new AvionApi();
		hotelApi = new HotelApi();
	}
	
	public void buscar(String fechaIda, String fechaVuelta, String origen, String destino) {
		avionApi.buscarVuelos(fechaIda, fechaVuelta, origen, destino);
		hotelApi.buscarHoteles(fechaIda, fechaVuelta, origen, destino);
	}
       
}
