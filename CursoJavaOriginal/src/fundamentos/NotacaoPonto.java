package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		String s = "Bom dia ?".toUpperCase()
								.replace("?", "Liz")
								.concat("!");
		System.out.println(s);
	}

}
