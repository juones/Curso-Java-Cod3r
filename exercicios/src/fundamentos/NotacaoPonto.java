package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");

		System.out.println(s);
		
		System.out.println("junior".toUpperCase());
		//ou
		String y = "Nivaldo".toUpperCase();
		System.out.println(y);
		
		
		String x = "Bom dia X".replace("X", "Gui").toUpperCase().concat("!!!");
		System.out.println(x);
	}

}
