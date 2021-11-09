package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {
	
	public static void main(String[] args) throws SQLException {
		
		/*Passos
		 * 1 - Criar a conexão
		 * 2 - Criar o Scanner
		 * 3 - Close na conexão e no scanner
		 * 4 - Criar o PrepareteStatement
		 * 5 - Setar os dados scanneados no statement
		 */
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o cogido que deseja alterar");
		int codigo = entrada.nextInt();
		
		Connection conexao = FabricaConexao.getConexao();
		String deleteSQL = "DELETE FROM pessoas WHERE codigo = ?";
		
		PreparedStatement stmt = conexao.prepareStatement(deleteSQL);
		stmt.setInt(1, codigo);
		//não é necessário o .execute
		
		int contador = stmt.executeUpdate();
		
		//o execute update retorna a quantidade de linhas impactadas com o sql
		//se o retorno for 0 ele nem entra no if
		if(contador > 0) {
			System.out.println("Pessoa excluida com sucesso!");	
		} else {
			System.out.println("Nada feito!");
		}

		System.out.println("Quantidade de linhas afetadas: " + contador);
		
		conexao.close();
		entrada.close();
	}
}
