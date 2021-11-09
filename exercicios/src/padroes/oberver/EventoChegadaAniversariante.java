package padroes.oberver;

import java.util.Date;

public class EventoChegadaAniversariante {
	
	//command + shit + T - abre a janela de tipos com os eventos disponiveis
	private final Date momentoAcontecimento;

	public EventoChegadaAniversariante(Date momentoAcontecimento) {
		this.momentoAcontecimento = momentoAcontecimento;
	}

	public Date getMomentoAcontecimento() {
		return momentoAcontecimento;
	}	
}
