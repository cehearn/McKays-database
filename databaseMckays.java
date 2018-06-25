
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class databaseMckays extends mckaysNewAccount{

	public static void main(String[] args) {
		databaseMckays databaseConn = new databaseMckays();
		databaseConn.createConnection();

	}
	
	void createConnection(){
		try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/customerdata?verifyServerCertificate=false&useSSL=true","root","FNMR6RjSfkY74ih");
		System.out.println("Connection Successful");
		}
		catch(ClassNotFoundException ex){
			Logger.getLogger(databaseMckays.class.getName()).log(Level.SEVERE, null, ex);
		}
		catch(SQLException ex){
			Logger.getLogger(databaseMckays.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	
	//void addInput(java.awt.event.ActionEvent evt){
		
	//}
}
