package pacote;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		String url = "jdbc:sqlite:C:\\Users\\Aluno\\Documents\\ExSQLite\\src\\db\\primeiro_db_sqlite.db";
		
		try {
			Connection con = DriverManager.getConnection(url);
			Statement stmt = con.createStatement();
			
			Scanner leitor = new Scanner(System.in);
			
			System.out.println("Informe o nome da pessoa");
			String nomeEntrada = leitor.nextLine();
			
			System.out.println("Informe o cpf da pessoa");
			String cpfEntrada = leitor.nextLine();
			
			System.out.println("Informe a data de nascimento da pessoa");
			String dataEntrada = leitor.nextLine();
		

			
			
			String queryInsert = "INSERT INTO pessoas( nome, CPF, dtanasc) VALUES ( '"+nomeEntrada+"', '"+cpfEntrada+"', '"+dataEntrada+"')";
			Statement stmtInsert = con.createStatement();
			stmtInsert.execute(queryInsert);
			
			
//			String queryUpdate = "UPDATE pessoas set nome = 'Carlos Silva' where id = 4";
//			Statement stmtUpdate = con.createStatement();
//			stmtUpdate.executeUpdate(queryUpdate);
//			
//			
//			String queryDelete = "delete from pessoas WHERE id = 2";
//			Statement stmtDelete = con.createStatement();
//			stmtDelete.execute(queryDelete);
			
			String querySelect = "select * from pessoas";
			Statement stmtSelect = con.createStatement();
			stmtSelect.executeQuery(querySelect);
			
			
			ResultSet resultado = stmt.executeQuery(querySelect);
			
//			stmt.execute("INSERT INTO pessoas( Nome, CPF, dtanasc) VALUES ( 'João', '567890', '2003/07/12')");
			
			
			while(resultado.next()){
				int id = resultado.getInt(1);
				String nome = resultado.getString(2);
				String cpf = resultado.getString(3);
				String dtanasc = resultado.getString(4);
				
				System.out.println("ID: " + id);
				System.out.println("Nome: " + nome);
				System.out.println("CPF: " + cpf);
				System.out.println("Nascimento: " + dtanasc);
				System.out.println("----------------------");
			
			}
			
			
			
		} catch (SQLException e) {
			System.out.println("-----------> ERRO: Falha na conexão com o banco de dados!");
			System.out.println(e.getMessage());
		//  e.printStackTrace();
		}
		
		
	}

}
