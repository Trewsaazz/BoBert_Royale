package Armas;

public class HachaPesada implements IArmas {

	@Override
	public String getNombre(){
		return "Hacha pesada";
	}
	
	@Override
	public int getDanio() {
		return 23;
	}
	
	@Override
	public int getPrecision() {
		return 65;
	}
	
	@Override
	public int getVelocidad() {
		return 2;
	}
	
	@Override
	public int getDefensa() {
		return 10;
	}
	
}
