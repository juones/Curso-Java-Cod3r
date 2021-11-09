package oo.heranca;

public class Heroi extends Jogador {
	
	//instanciando o objeto filho com o construtor padrao da classe pai
	public Heroi(int x, int y){
		super(x, y);
		}
	
	//para sobrescrever o método na herança, basta copiar o método e alterá-lo na classe filha
	
	
	// caso não queira copiar, é possível chamar o super que chama o método da classe superior ou a classe pai
	//o método abaixo dobra o valor de ataque pois ataca duas vezes
	public boolean atacar(Jogador oponente) {
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		boolean ataque3 = super.atacar(oponente);
		return ataque1 || ataque2 || ataque3;
	}
	
	
	
//	boolean atacar(Jogador oponente) {
//		//calcular a diferença
//		//abs significa absoluto
//		int deltaX = Math.abs(x - oponente.x);
//		int deltaY = Math.abs(y - oponente.y);
//		
//		// comparação se a diferença entre o x dos dois jogadores for 0 significa que eles estão
//		// na mesma coluna, e a diferença do y é igual a 1, significar que eles estão lado a lado
//		if(deltaX == 0 && deltaY == 1) {
//			oponente.vida -= 20;
//			return true;			
//			//nessa com x = 1 e y = 0 significa que estão na mesma linha
//		} else if(deltaX == 1 && deltaY == 0) {
//			oponente.vida -= 20;
//			return true;
//		}
//		return false;
//	}
	

}
