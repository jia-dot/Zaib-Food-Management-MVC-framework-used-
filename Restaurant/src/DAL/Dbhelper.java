package DAL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbhelper {
	public Connection getconnection() throws SQLException, ClassNotFoundException
	{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/reslogin?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
	return con;
	}
	public void closeconnection(Connection con) throws SQLException
	{
		con.close();
	}
}
