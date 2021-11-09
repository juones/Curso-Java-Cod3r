package br.com.cod3r.app.calculo;

import br.com.cod3r.app.Calculadora;
import br.com.cod3r.app.calculo.interno.OperacoesAritmeticas;
import br.com.cod3r.app.logging.Logger;

public class CalculadoraImpl implements Calculadora{
	
	private OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();

	//clicando com o direito > source > Generate delegate methods
	// se cria um método que chama o método do objeto instanciado
	public double soma(double... nums) {
		Logger.info("Somando...");
		return opAritmeticas.soma(nums);
	}
}
