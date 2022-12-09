package principal;

import facade.Fachada;

public class App {

    public static void main(String[] args) {
		
        Fachada cliente1 = new Fachada();
        cliente1.buscar("07/12/2022", "11/12/2022", "Cuenca", "Las Vegas");
		
        Fachada cliente2 = new Fachada();
        cliente2.buscar("20/12/2022", "22/12/2022", "Quito", "Madrid");

	}
}
