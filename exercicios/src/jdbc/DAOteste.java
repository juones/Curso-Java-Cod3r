package jdbc;

public class DAOteste {
	
	public static void main(String[] args) {
		DAO dao = new DAO();
		
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		System.out.println(dao.incluir(sql, "Tania Mara Pereira")); // dentro do syso retorna o id
		System.out.println(dao.incluir(sql, "Nivaldo Silva da Costa"));
		
		dao.close();
	}
}
