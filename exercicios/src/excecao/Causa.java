package excecao;

public class Causa {
	
	public static void main(String[] args) {
		
		//criei a exceção no método B, tratei e lancei uma nova o método A
		
		try {
			metodoA(null);
		} catch (IllegalArgumentException e) {
			if(e.getCause() != null) {
				System.out.println(e.getCause().getMessage());
			}
		}
		
	}

	static void metodoA(Aluno aluno) {
		try {
			metodoB(aluno);
		} catch (Exception causa) {
			throw new IllegalArgumentException(causa);
		}
	}

	static void metodoB(Aluno aluno) {
		if (aluno == null) {
			throw new NullPointerException("O aluno está NULO!");
		}
		
		System.out.println(aluno.nome);
	}
}
