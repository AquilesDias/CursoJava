package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {

    public static void main(String[] args) throws SQLException {
	final String url = "jdbc:mysql://localhost:3306/curso_bd?verifyServerCertificate=false&useSSL=true";
	final String usuario = "root";
	final String senha = "admin";

	Connection conexao = DriverManager.getConnection(url, usuario, senha);

	System.out.println("Conectado com Sucesso!");
	conexao.close();
    }

}

//verifyServerCertificate=false&useSSL=true"; Não verifia o certificado do servidor, mas usa conexao segura entre aplicação java e aplicação mysql.
