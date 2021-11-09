package padroes.oberver;

public class AniversarioSurpresa {
	
	public static void main(String[] args) {
		Namorada namorada = new Namorada();
		Porteiro porteiro = new Porteiro();
		
		porteiro.registrarObervador(namorada);
		//com interface funcional
		porteiro.registrarObervador(e -> {System.out.println("Surpresa via lambda");});
		
		porteiro.monitorar();
	}
}
