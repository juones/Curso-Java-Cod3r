package streams;

public class Media {
	
	private double total;
	private int quantidade;
	
	
	//setanto o objeto Media como retorno, posso encadear vários adicionar no instanciamento
	public Media adicionar(double valor) {
		total += valor;
		quantidade++;
		return this;
	}
	
	public double getValor() {
		return total / quantidade;
	}
	
	//calcular a soma e média das médias
	public static Media combinar(Media m1, Media m2) {
		Media resultante = new Media();
		resultante.total = m1.total + m2.total;
		resultante.quantidade = m1.quantidade + m2.quantidade;
		return resultante;
	}
}
