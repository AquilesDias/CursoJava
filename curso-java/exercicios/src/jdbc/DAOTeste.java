package jdbc;

public class DAOTeste {

    public static void main(String[] args) {

	DAO dao = new DAO();
	String sql = "INSERT INTO PESSOAS (nome) values(?)";

	System.out.println(dao.incluir(sql, "Vanessa Braga"));
	System.out.println(dao.incluir(sql, "Barbara Alves"));
	System.out.println(dao.incluir(sql, "Lilia Gongalves"));
	System.out.println(dao.incluir(sql, "Heryca Brandao"));

	dao.close();
    }

}
