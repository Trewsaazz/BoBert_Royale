package Personajes;

public class FabricaMedieval implements FabricaEnemigos{

	public Enemigo crearGuerrero(Tipo tipo) {

		return new GuerreroMedieval(tipo);
	}
	
	public Enemigo crearHechicero(Tipo tipo) {
		
		return new HechiceroMedieval(tipo);
	}
	
	public Enemigo crearMutante(Tipo tipo) {
		
		return new MutanteMedieval(tipo);
	}
}
