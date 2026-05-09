package Armas;

public class Arco implements IArmas{
	
	@Override
	public String getNombre(){
		return "Arco";
	}
	
	@Override
	public int getDanio() {
		return 15;
	}
	
	@Override
	public int getPrecision() {
		return 90;
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
