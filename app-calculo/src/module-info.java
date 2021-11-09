/*open*/module app.calculo {
	
	requires transitive app.logging;
	exports br.com.cod3r.app.calculo;
	exports br.com.cod3r.app.calculo.interno to app.financeiro, app.logging;
	
	//também é possível abrir um pacote especifico ao inves do modulo todo
	//opens br.com.cod3r.app.calculo to app.financeiro;
	
	requires app.api;
	
	//o provides significar que o esse modulo prove uma 
	//implementação da interface Calculadora a partir de calculadoraImpl
	provides br.com.cod3r.app.Calculadora 
		with br.com.cod3r.app.calculo.CalculadoraImpl;
}