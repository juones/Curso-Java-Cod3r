package oo.composicao;

public class Motor {
	
	boolean ligado = false;
	double fatorInjecao = 1;
	
	int giros() {
		if(!ligado) {
			return 0;
		} else {
		//como o valor é calculado com int
		//é necessário fazer o cast para int para arredontar o valor
		return (int) Math.round(fatorInjecao * 3000);
		}
	}

}
