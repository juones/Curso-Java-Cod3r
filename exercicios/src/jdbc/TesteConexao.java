package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
	
	public static void main(String[] args) throws SQLException { //necessário declatar exception pelo método Connection
		
		
		
		//string que vai iniciar a conexão
		//se tivesse uma porta especifica poderia por com : apos localhost
		String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
		String usuario = "root";
		String senha = ",Juones161059";
		
		//Todos os imports serão feitos de java.sql
		Connection conexao = DriverManager
				.getConnection(url, usuario, senha);
		
		System.out.println("Conexão efetuada com sucesso!");
		
		conexao.close();
		
	}

}
