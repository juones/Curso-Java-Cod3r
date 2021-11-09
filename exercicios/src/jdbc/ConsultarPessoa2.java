package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoa2 {
	
	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira o valor: ");
		
		String filtro = entrada.next();
		
		Connection conexao = FabricaConexao.getConexao();
		String sql = "SELECT * FROM pessoas WHERE nome LIKE ?";
		
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, "%" + filtro + "%");
		ResultSet resultado = stmt.executeQuery();
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		while(resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoa(codigo, nome));
		}
		
		for(Pessoa p: pessoas) {
			System.out.println(p.getCodigo() + " ==> " + p.getNome());
		}
		conexao.close();
		entrada.close();
	}
}
