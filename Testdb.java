import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Testdb {

	public static void main(String[] args) {
		try {
			Class .forName("oracle.jdbc.driver.oracleDriver");
			Connection cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","System","1234");
			Statement st = (Statement) cn.createStatement();
			String sql ="Select * from student11";
			ResultSet rs = ((java.sql.Statement) st).executeQuery(sql);
			while(rs.next())
				System.out.println(rs.getLong(1)+" "+ rs.getString(2)+" "+ rs.getString(3));
			cn.close();
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}		

	}

}
