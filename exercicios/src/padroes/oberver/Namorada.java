package padroes.oberver;

public class Namorada implements ObservadorChegadaAniversariante {
	
	public void chegou(EventoChegadaAniversariante evento) {
		
		System.out.println("Avisar os convidados");
		System.out.println("Apaar as luzes");
		System.out.println("Esperar um pouco");
		System.out.println("..... SURPRESA!!!! \n");
		System.out.println(evento.getMomentoAcontecimento());
		
	}

}
