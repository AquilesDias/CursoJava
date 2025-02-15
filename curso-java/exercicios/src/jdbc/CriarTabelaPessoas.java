package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaPessoas {

    public static void main(String[] args) throws SQLException {
	
	Connection conexao = FabricaConexao.getConexao();
	
	String sql = "CREATE TABLE IF NOT EXISTS PESSOAS("
		+ "codigo INT AUTO_INCREMENT PRIMARY KEY,"
		+ "nome VARCHAR(50) NOT NULL"
		+ ")";
			
	Statement stmt = conexao.createStatement();
	stmt.execute(sql);
	
	System.out.println("TABELA CRIADA COM SUCESSO!!!");
	conexao.close();
    }
}
