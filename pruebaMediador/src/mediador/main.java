package mediador;

public class main {

	public static void main(String[] args) {

		// Crear el objeto centralizador de la comunicaci�n
		
		Mediador m = new Mediador();
		
		// Crear los objetos que participar�n en la comunicaci�n
		
		Colega cc1 = new ColegaConcreto1(m);
		
		Colega cc2 = new ColegaConcreto2(m);
		
		Colega cc3 = new ColegaConcreto3(m);
		
		// Agregarlos al objeto centralizador
		
		m.agregarColega(cc1);
		
		m.agregarColega(cc2);
		
		m.agregarColega(cc3);
		
		// Provocar un cambio en un uno de los elementos
		
		cc2.comunicar("ColegaConcreto2 ha cambiado!");

	}

}
