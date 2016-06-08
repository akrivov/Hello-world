import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class JavaToMysql {
 
    // JDBC URL, username and password of MySQL server
    private static final String url = "jdbc:mysql://localhost:3306/students";
    private static final String user = "root";
    private static final String password = "9043011AR";
 
    // JDBC variables for opening and managing connection
    private static Connection con;
    private static Statement stmt;
    private static ResultSet result;
 

		static ArrayList<Students> getStudents() {
		ArrayList students = new ArrayList<Students>();
        String query = "select * from students";
        Students st;
        
        try {
        	DriverManager.registerDriver(new com.mysql.jdbc.Driver ());
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);
 
            // getting Statement object to execute query
            stmt = con.createStatement();
            // executing SELECT query
            result = stmt.executeQuery(query);
            
               	
        
            
            
            while (result.next()) {
            	st = new Students(
            			result.getInt("student_id"),
            			result.getString("surName"),
            			result.getString("firstName"),
            			result.getString("patronymic"),
            			result.getInt("group_id"),
            			result.getString("sex"),
            			result.getString("dateOfBirth"),
            			result.getInt("educationYear")
            			);
            students.add(st);	
			} 
 
			
			
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            //close connection ,stmt and resultset here
            try { con.close(); } catch(SQLException se) { /*can't do anything */ }
            try { stmt.close(); } catch(SQLException se) { /*can't do anything */ }
            try { result.close(); } catch(SQLException se) { /*can't do anything */ }
        
        }
        return students;
}
 
}