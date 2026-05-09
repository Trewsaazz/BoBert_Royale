package Armas;

public class EspadaYEscudo implements IArmas{
	
	@Override
	public String getNombre(){
		return "Espada y escudo";
	}
	
	@Override
	public int getDanio() {
		return 15;
	}
	
	@Override
	public int getPrecision() {
		return 75;
	}
	
	@Override
	public int getVelocidad() {
		return 5;
	}
	
	@Override
	public int getDefensa() {
		return 12;
	}
	
}
