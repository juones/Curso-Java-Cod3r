package fundamentos;


public class Wrappers {

	public static void main(String[] args) {

		// Wrappers são a versão objeto dos tipos primitivos!
		// Com eles é possível utilizar a notação ponto com primitivos
		Byte b = 100;
		Short s = 1000;
		
		//Integer i = Integer.parseInt(entrada.next());
		Integer i = 10000;
		
		//tanto long quanto float não são convertivos automaticamente, por isso é necessário especificá-lo na atribuição
		Long l = 100000L;
		Float f = 123.10F;
		
		Double d = 1234.5678;
		
		
		// o parse converte a string para boolean
		Boolean bo = Boolean.parseBoolean("true");
		
		Character c = '#';
		
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		System.out.println(f);
		System.out.println(d);
		System.out.println(bo);
		//convertendo o boolean para string novamente
		System.out.println(bo.toString().toUpperCase());		
		System.out.println(c.toString());
		
	}

}
