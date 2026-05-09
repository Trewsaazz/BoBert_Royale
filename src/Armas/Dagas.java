package Armas;

public class Dagas implements IArmas{
	
	@Override
	public String getNombre(){
		return "Dagas";
	}
	
	@Override
	public int getDanio() {
		return 8;
	}
	
	@Override
	public int getPrecision() {
		return 95;
	}
	
	@Override
	public int getVelocidad() {
		return 12;
	}
	
	@Override
	public int getDefensa() {
		return 2;
	}
}
