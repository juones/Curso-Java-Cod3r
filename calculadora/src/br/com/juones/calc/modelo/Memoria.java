package br.com.juones.calc.modelo;

import java.util.ArrayList;
import java.util.List;

public class Memoria {
	
	private enum TipoComando{
		ZERAR, SINAL, NUMERO, DIV, MULT, SUB, SOMA, IGUAL, VIRGULA;
	};
	
	//para evitar que uma classe seja instanciada mais de uma vez, 
	//basta que seu construtor seja privado
	
	private static final Memoria instancia = new Memoria();
	
	private List<MemoriaObservador> observadores = new ArrayList<>();
	
	private TipoComando ultimaOperacao = null; //vai receber a operção realizada
	private boolean substituir = false; //para saber quando parar de acumular os números no display (quando seleciono uma operação)
	private String textoAtual = "";
	private String textoBuffer = ""; //vai recceber os valores da memória
	
	private Memoria() {}
	
	public static Memoria getInstancia() {
		return instancia;
	}
	
	public void adicionarObservador(MemoriaObservador observador) {
		observadores.add(observador);
	}

	public String getTextoAtual() {
		//se o texto atual for vazio retorna 0, se não traz o texto atual
		return textoAtual.isEmpty() ? "0" : textoAtual;
	}
	
	//método que vai processar o novo texto do display
	public void processarComando(String texto) {
		
		TipoComando tipoComando = detectarTipoComando(texto);
		
		if(tipoComando == null) { //se o comando recebido for nulo, não faça nada
			return;
		} else if (tipoComando == TipoComando.ZERAR) {
			textoAtual = "";
			textoBuffer = "";
			substituir = false;
			ultimaOperacao = null;
		} else if (tipoComando == TipoComando.SINAL && textoAtual.contains("-")) {
			textoAtual = textoAtual.substring(1);
		} else if (tipoComando == TipoComando.SINAL && !textoAtual.contains("-")) {
			textoAtual = "-" + textoAtual;
		} else if (tipoComando == TipoComando.NUMERO || tipoComando == TipoComando.VIRGULA) {
			textoAtual = substituir ? texto : textoAtual + texto; //se substituir for verdadeiro ele vai correr logicas diferentes
			substituir = false;
		} else {
			substituir = true;
			textoAtual = obterResultadoOperacao();
			textoBuffer = textoAtual;
			ultimaOperacao = tipoComando;
		}
		
		observadores.forEach(o -> o.valorAlterado(getTextoAtual()));
	}

	private String obterResultadoOperacao() {
		if(ultimaOperacao == null || ultimaOperacao == TipoComando.IGUAL) {
			return textoAtual;
		}
		
		double numeroBuffer = Double.parseDouble(textoBuffer.replace(",", "."));
		double numeroAtual = Double.parseDouble(textoAtual.replace(",", "."));
		double resultado = 0;
		
		if(ultimaOperacao == TipoComando.SOMA) {
			resultado = numeroBuffer + numeroAtual;
		} else if(ultimaOperacao == TipoComando.SUB) {
			resultado = numeroBuffer - numeroAtual;
		} else if(ultimaOperacao == TipoComando.MULT) {
			resultado = numeroBuffer * numeroAtual;
		} else if(ultimaOperacao == TipoComando.DIV) {
			resultado = numeroBuffer / numeroAtual;
		}
		
		String texto = Double.toString(resultado).replace(".", ",");
		boolean inteiro = texto.endsWith(",0"); //para não retornar o ,0 caso o valor do resultado seja inteiro
		return inteiro ? texto.replace(",0", "") : texto;
	}

	private TipoComando detectarTipoComando(String texto) {
		//para evitar que se acumulem zeros quando o display estiver vazio
		if(textoAtual.isEmpty() && textoAtual.equalsIgnoreCase("0")) {
			return null;
		}
		
		try {
			//para verificar se o valor digitado pode ser convertido para inteiro
			Integer.parseInt(texto);
			return TipoComando.NUMERO;
		} catch (NumberFormatException e) {
			// Quando não for número
			if("AC".equalsIgnoreCase(texto)) {
				return TipoComando.ZERAR;
			} else if ("/".equalsIgnoreCase(texto)) {
				return TipoComando.DIV;
			} else if ("*".equalsIgnoreCase(texto)) {
				return TipoComando.MULT;
			} else if ("-".equalsIgnoreCase(texto)) {
				return TipoComando.SUB;
			} else if ("+".equalsIgnoreCase(texto)) {
				return TipoComando.SOMA;
			} else if ("=".equalsIgnoreCase(texto)) {
				return TipoComando.IGUAL;
			} else if("±".equalsIgnoreCase(texto)) {
				return TipoComando.SINAL;
			} else if (",".equalsIgnoreCase(texto) && !textoAtual.contains(",")) {
				return TipoComando.VIRGULA;
			}
		}		
		return null;
	}
}
