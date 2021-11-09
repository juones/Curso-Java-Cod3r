package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
	
	private Connection conexao;
	
	public int incluir(String sql, Object... atributos) { //Object... (é um ver Arg, um objeto de argumentos variáveis)
		try {
			PreparedStatement stmt = getConexao()
					.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS); //a autoGeneretedKey é o inteiro que será retornado no método
			adicionarAtributos(stmt, atributos);
			
			if(stmt.executeUpdate() > 0) {
				ResultSet resultado = stmt.getGeneratedKeys();
				
				if(resultado.next()) {
					return resultado.getInt(1); //index é a primeira coluna da tabela
				}
			}
			
			return -1;
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void close() {
		try {
			getConexao().close();
		} catch (SQLException e) {
		} finally {
			conexao = null;
		}
	}
	
	//Para setar cada um dos atributos que eu recebi como parametro desse statement
	private void adicionarAtributos (PreparedStatement stmt, 
			Object[] atributos) throws SQLException { //método vai receber um statement e um array de objetos
		
		int indice = 1; //criado para receber o indice do set do statement
		for(Object atributo: atributos) {
			if (atributo instanceof String) {
				stmt.setString(indice, (String) atributo);
			} else if (atributo instanceof Integer) {
				stmt.setInt(indice, (Integer) atributo);
			}
			
			indice++;
		}
		
	}
	
	private Connection getConexao() {
		try {
			if (conexao != null && !conexao.isClosed()) {
				return conexao;
			}
		} catch (SQLException e) {
		}
		conexao = FabricaConexao.getConexao();
		return conexao;
	}

}
