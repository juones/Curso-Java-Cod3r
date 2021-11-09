package oo.composicao;

public class Carro {
	
	Motor motor = new Motor();
	Porta porta = new Porta();
	
	// para garantir uma maior segurança é possível incluir ifs nos metodos acelerar e frear
	void acelerar() {
		if (motor.fatorInjecao < 2.6 && porta.aberta == false) {
			motor.fatorInjecao += 0.4;
		}
	}
	
	void frear() {
		if (motor.fatorInjecao > 0.5) {
			motor.fatorInjecao -= 0.4;
		}
	}
	
	void ligar() {
		motor.ligado = true;
	}
	
	void desligar() {
		motor.ligado = false;
	}
	
	void abrirPorta() {
		porta.aberta = true;
	}
	
	void fecharPorta() {
		porta.aberta = false;
	}
	
	boolean estaAberta() {
		return porta.aberta;
	}
	
	boolean estaLigado() {
		return motor.ligado;
	}

}
