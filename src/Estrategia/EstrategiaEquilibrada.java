package Estrategia;

import java.util.Random;

public class EstrategiaEquilibrada implements IEstrategia{
	
	
	
	public EAccion DecidirAccion() {
		Random r = new Random();
		if (r.nextFloat() < 0.5f)
		{
			return EAccion.ATACAR;
		}
		return EAccion.CURAR;
	}

}
