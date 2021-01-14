package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AtualizarPessoa {

    public static void main(String[] args) throws SQLException{


	Scanner sc = new Scanner(System.in);
	System.out.print("Informe o codigo para alterar o nome:");
	int codNome = sc.nextInt();

	Connection conexao = FabricaConexao.getConexao();
	String update = "UPDATE PESSOAS SET nome = ? WHERE codigo=?";
	String select = "SELECT codigo, nome FROM PESSOAS WHERE codigo=?";
	
	PreparedStatement stmt = conexao.prepareStatement(select);
	stmt.setInt(1, codNome);
        ResultSet rs = stmt.executeQuery();
        
	if (rs.next()) {
	    Pessoa pessoa = new Pessoa(rs.getInt(1), rs.getString(2));

	    System.out.println("Responsel do codigo: " + pessoa.getNome());
	    sc.nextLine();

	    System.out.print("Informe o novo nome: ");
	    String newNome = sc.nextLine();

	    stmt.close();

	    stmt = conexao.prepareStatement(update);

	    stmt.setString(1, newNome);
	    stmt.setInt(2, codNome);
	    stmt.execute();

	    System.out.println("ALTERADO COM SUCESSO!");
	} else {
	    System.out.println("Ops...Pessoa não encontada :(");
	}

	conexao.close();
	sc.close();
    }
}
