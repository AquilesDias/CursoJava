package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {

    public static void main(String[] args) throws SQLException {

	Scanner sc = new Scanner(System.in);

	System.out.println("Informe o codigo a ser excluido: ");
	int codigo = sc.nextInt();

	Connection conexao = FabricaConexao.getConexao();
	String sql = "DELETE FROM PESSOAS where codigo = ? ";

	PreparedStatement ps = conexao.prepareStatement(sql);
	ps.setInt(1, codigo);

	if (ps.executeUpdate() > 0) {
	    System.out.println("EXCLUIDO COM SUCESSO :) ");
	} else {
	    System.out.println("Nada feito :( ");
	}

	conexao.close();
	sc.close();

    }
}
