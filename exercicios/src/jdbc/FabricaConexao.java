package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexao {
	
	public static Connection getConexao() {
		try {
			Properties prop = getProperties(); //utilizando o método abaixo para tomar as informações do arquivo interno
			String url = prop.getProperty("banco.url");
			String usuario = prop.getProperty("banco.usuario");
			String senha = prop.getProperty("banco.senha");
			
			return DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException | IOException e) { //tratei o IOException também
			throw new RuntimeException(e);
		}
	}
	//método para ler o arquivo.properties (será utilizado no método getConexao())
	private static Properties getProperties() throws IOException {
		Properties prop = new Properties();
		String caminho = "/conexao.properties"; //path para o arquivo
		prop.load(FabricaConexao.class.getResourceAsStream(caminho)); //comando que vai ler o arquivo
		return prop;
	}
}
