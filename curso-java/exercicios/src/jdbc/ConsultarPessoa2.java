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

	Scanner sc = new Scanner(System.in);
	System.out.print("Informe um nome para pesquisa:");
	String nomePesquisa = sc.nextLine();

	Connection conexao = FabricaConexao.getConexao();
	String sql = "SELECT * FROM PESSOAS WHERE nome like ?";

	PreparedStatement ps = conexao.prepareStatement(sql);
	ps.setString(1, "%" + nomePesquisa + "%");
	ResultSet resultado = ps.executeQuery();

	List<Pessoa> p = new ArrayList<>();

	while (resultado.next()) {
	    int codigo = resultado.getInt("codigo");
	    String nome = resultado.getString("nome");
	    p.add(new Pessoa(codigo, nome));
	}

	for (Pessoa pessoa : p) {
	    System.out.println(pessoa.getNome());
	}

	conexao.close();
	sc.close();

    }

}
