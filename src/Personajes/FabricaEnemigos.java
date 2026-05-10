package Personajes;

public interface FabricaEnemigos {

	public Enemigo crearGuerrero(Tipo tipo);
	public Enemigo crearHechicero(Tipo tipo);
	public Enemigo crearMutante(Tipo tipo);
}
