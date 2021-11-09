package br.com.coder.cm.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.coder.cm.excecao.ExplosaoException;

public class CampoTeste {
	
	private Campo campo;
	
	//o BeforeEach garante que o método seja executado antes dos testes
	@BeforeEach
	void iniciarCampo (){
		campo = new Campo(3, 3);
	}
	
	@Test
	void testeVizinhoDistancia1Esquerda() {
		Campo vizinho = new Campo(3, 2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertEquals(true, resultado);
	}
	
	@Test
	void testeVizinhoDistancia1Direita() {
		Campo vizinho = new Campo(3, 4);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertEquals(true, resultado);
	}
	
	@Test
	void testeVizinhoDistancia1EnCima() {
		Campo vizinho = new Campo(2, 3);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertEquals(true, resultado);
	}
	
	@Test
	void testeVizinhoDistancia1EmBaixo() {
		Campo vizinho = new Campo(4, 3);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertEquals(true, resultado);
	}

	@Test
	void testeVizinhoDistancia2CimaEsquerda() {
		Campo vizinho = new Campo(2, 2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoDistancia2CimaDireita() {
		Campo vizinho = new Campo(2, 4);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoDistancia2BaixoEsquerda() {
		Campo vizinho = new Campo(4, 2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoDistancia2BaixoDireita() {
		Campo vizinho = new Campo(4, 4);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	
	@Test
	void testeNaoVizinhoDistancia2() {
		Campo vizinho = new Campo(1, 1);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertFalse(resultado);
	}
	
	//primeiro testo se por padrão o campo marcado está falso
	@Test
	void testeValorPadraoAtributoMarcado() {
		assertFalse(campo.isMarcado());
	}
	
	//depois testo o método alternar para true
	@Test
	void testeAlternarMarcacao() {
		campo.alternatMarcacao();
		assertTrue(campo.isMarcado());
	}

	//no segundo método para testar se o valor volta para false
	//é necessário chamar o métodos duas vees pois por default ele volta pro valor inicial
	@Test
	void testeAlternarMarcacaoFalse() {
		campo.alternatMarcacao();
		campo.alternatMarcacao();
		assertFalse(campo.isMarcado());
	}
	
	@Test
	void testeAbrirNaoMinadoNaoMarcado() {
		assertTrue(campo.abrir());
	}
	
	@Test
	void testeAbrirNaoMinadoMarcado() {
		campo.alternatMarcacao();
		assertFalse(campo.abrir());
	}
	
	@Test
	void testeAbrirMinadoMarcado() {
		campo.alternatMarcacao();
		campo.minar();
		assertFalse(campo.abrir());
	}
	
	//para testar uma exceção esperada com lambda
	@Test
	void testeAbrirMinadoNaoMarcado() {
		campo.minar();
		
		assertThrows(ExplosaoException.class, () ->{
			campo.abrir();
		});
	}
	
	//testanto o método vizinhança segura
	@Test
	void testeAbrirComVizinhos1() {
		
		Campo campo11 = new Campo(1, 1);
		Campo campo22 = new Campo(2, 2);


		campo22.adicionarVizinho(campo11);
		
		campo.adicionarVizinho(campo22);
		
		campo.abrir();
		
		assertTrue(campo22.isAberto() && campo11.isAberto());
	}
	
	@Test
	void testeAbrirComVizinhos2() {
		
		Campo campo11 = new Campo(1, 1);
		Campo campo12 = new Campo(1, 2);
		campo12.minar();
		
		Campo campo22 = new Campo(2, 2);
		campo22.adicionarVizinho(campo11);
		campo22.adicionarVizinho(campo12);		
		
		campo.adicionarVizinho(campo22);
		
		campo.abrir();
		
		assertTrue(campo22.isAberto() && campo11.isFechado());
	}
	
	//Testes Desafio
	
	@Test
	void testeGetLinha() {
		assertEquals(3, campo.getLinha());
	}
	
	@Test
	void testeGetColuna() {
		assertEquals(3, campo.getColuna());
	}
	
	@Test
	void testeObjetivoAlcancadoDesvendado() {
		campo.abrir();
		assertTrue(campo.objetivoAlcancado());
	}
	
	@Test
	void testeObjetivoAlcancadoMinadoAberto() {
		campo.minar();
		
		assertThrows(ExplosaoException.class, () ->{
			campo.abrir();
		});

		assertFalse(campo.objetivoAlcancado());
	}
	
	@Test
	void testeObjetivoAlcancadoProtegido() {
		campo.minar();
		campo.alternatMarcacao();
		assertTrue(campo.objetivoAlcancado());
	}
	
	@Test
	void testeObjetivoAlcancadoMinado() {
		campo.minar();
		assertFalse(campo.objetivoAlcancado());
	}
	
	@Test
	void testeObjetivoAlcancadoMinadoNaoMarcado() {
		campo.minar();
		campo.alternatMarcacao();
		campo.alternatMarcacao();
		assertFalse(campo.objetivoAlcancado());
	}
	
	@Test
	void testeObjetivoAlcancadoMarcado() {
		campo.alternatMarcacao();
		assertFalse(campo.objetivoAlcancado());
	}
	
	@Test
	void testeMinasNaVizinhanca() {
		
		Campo campo22 = new Campo(2, 2);
		Campo campo23 = new Campo(2, 3);
		campo22.minar();
		campo23.minar();
			
		campo.adicionarVizinho(campo22);
		campo.adicionarVizinho(campo23);
		
		assertEquals(2, campo.minasNaVizinhanca());
		
	}
	
	@Test
	void testeMinado() {
		campo.minar();
		assertTrue(campo.isMinado());
	}
	
	@Test
	void testeReiniciar() {
		campo.reiniciar();
		assertFalse(campo.isAberto() && campo.isMarcado() && campo.isMinado());
	}
	
	//TESTE TOSTRING
	@Test
	void testeToStringMarcado() {
		campo.alternatMarcacao();
		assertEquals("x", campo.toString());
	}
	
	@Test
	void testeToStringAbertoMinado() {
		campo.minar();
		assertThrows(ExplosaoException.class, () ->{
			campo.abrir();
		});
		assertEquals("*", campo.toString());
	}
	
	@Test
	void testeToStringAbertoMinasNaVizinhanca() {
		
		Campo campo22 = new Campo(2, 2);
		campo22.minar();
		campo.adicionarVizinho(campo22);
		campo.abrir();
			
		assertEquals("1", campo.toString());
	}
	
	@Test
	void testeToStringAberto() {
		campo.abrir();
		assertEquals(" ", campo.toString());
	}
	
	@Test
	void testeToStringZerado() {
		assertEquals("?", campo.toString());
	}
	
	
}
