package Armas;

public class BastonDeMagia implements IArmas {
	
	@Override
	public String getNombre(){
		return "Baston de magia";
	}
	
	@Override
	public int getDanio() {
		return 28;
	}
	
	@Override
	public int getPrecision() {
		return 75;
	}
	
	@Override
	public int getVelocidad() {
		return 3;
	}
	
	@Override
	public int getDefensa() {
		return 1;
	}
	
}
