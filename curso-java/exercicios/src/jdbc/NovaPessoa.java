package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class NovaPessoa {

    public static void main(String[] args) throws SQLException {

	Scanner sc = new Scanner(System.in);

	System.out.println("Informe seu nome: ");
	String nome = sc.nextLine();


	Connection conexao = FabricaConexao.getConexao();

	String sql = "INSERT INTO PESSOAS (nome) VALUES(?)";

	PreparedStatement stmt = conexao.prepareStatement(sql);
	stmt.setString(1, nome);
	stmt.execute();

	System.out.println("Pessoa incluida com Sucesso");
	sc.close();
    }
}
