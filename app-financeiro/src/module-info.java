module app.financeiro {
	
	requires java.base;
	//requires app.calculo;
	requires app.api; //com a implementacao da interface
	uses br.com.cod3r.app.Calculadora; //necessário para que o método seja executado
}