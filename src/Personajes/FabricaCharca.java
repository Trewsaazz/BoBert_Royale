package Personajes;

public class FabricaCharca implements FabricaEnemigos{

	public Enemigo crearGuerrero(Tipo tipo) {
		
		return new GuerreroChorreante(tipo);
	}
	
	public Enemigo crearHechicero(Tipo tipo) {
		
		return new HechiceroChorreante(tipo);
	}
	
	public Enemigo crearMutante(Tipo tipo) {
		
		return new MutanteChorreante(tipo);
	}
}
