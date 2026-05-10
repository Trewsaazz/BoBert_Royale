package DinamicaJuego;

public class CalcDanio {
	
	private static CalcDanio instance;
	
	private CalcDanio() {
	}
	
	public static CalcDanio getInstance(){
		if(instance == null) {
			instance = new CalcDanio();
		}
		return instance;
	}
	
	public int calc(int atc, int def) {
		int ans;
		ans = atc - def;
		if(ans<0) {
			return 0;
		}else {
			return ans;
		}
		
	}
}
