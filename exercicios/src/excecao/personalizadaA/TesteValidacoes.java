package excecao.personalizadaA;

import excecao.Aluno;

public class TesteValidacoes {
	
	public static void main(String[] args) {
		
		try {
			Aluno a1 = new Aluno("Liz", 10);
			Validar.aluno(a1);
			Validar.aluno(null);
			//é possível usar um catch atrás do outro caso queira tratar mais de uma exceção
			// também é possível separá-los por pipe |
		} catch (StringVaziaException e) { // ou StringVaziaException | NumeroForaIntervaloException e, sem o segundo catch
			System.out.println(e.getMessage());
		} catch (NumeroForaIntervaloException | IllegalArgumentException e) { 
			System.out.println(e.getMessage());
		}
		System.out.println("Fim!");
	}
}