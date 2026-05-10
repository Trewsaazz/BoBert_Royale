package Personajes;

public class FabricaEspacial implements FabricaEnemigos{

	public Enemigo crearGuerrero(Tipo tipo) {
		 
		return new GuerreroEspacial(tipo);
	}
	
	public Enemigo crearHechicero(Tipo tipo) {
		
		return new Jedi(tipo);
	}
	
	public Enemigo crearMutante(Tipo tipo) {
		
		return new MutanteEspacial(tipo);
	}
	
}
