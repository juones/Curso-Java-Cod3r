package oo.heranca;

public class Jogador {
	
	public int vida = 100;
	public int x;
	public int y;
	
	//criando construtor explicito
	Jogador(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public boolean atacar(Jogador oponente) {
		//calcular a diferença
		//abs significa absoluto
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		
		// comparação se a diferença entre o x dos dois jogadores for 0 significa que eles estão
		// na mesma coluna, e a diferença do y é igual a 1, significar que eles estão lado a lado
		if(deltaX == 0 && deltaY == 1) {
			oponente.vida -= 10;
			return true;			
			//nessa com x = 1 e y = 0 significa que estão na mesma linha
		} else if(deltaX == 1 && deltaY == 0) {
			oponente.vida -= 10;
			return true;
		}
		return false;
	}
	
	//utilizando o exemplo criado do enum
	public boolean andar(Direcao direcao) {
		switch (direcao) {
		case NORTE:
			y--;
			break;
		case LESTE:
			x++;
			break;
		case SUL:
			y++;
			break;
		case OESTE:
			x--;
			break;
		}
		return true;
	}

}
