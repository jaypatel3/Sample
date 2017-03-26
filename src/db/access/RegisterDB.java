package db.access;

import dao.RegisterDAO;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class RegisterDB {


	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost:8889/Banking";

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "root";
	   
	   Connection conn = null;
	   PreparedStatement preparedStatement = null;

	
	
	public void insert(RegisterDAO registerDAO) {
		
		try{
			
			 //STEP 2: Register JDBC driver
		      Class.forName(JDBC_DRIVER);

		      //STEP 3: Open a connection
		      System.out.println("Connecting to a selected database...");
		      conn = DriverManager.getConnection(DB_URL, USER, PASS);
		      
		      System.out.println("Connected database successfully...");
		      
		      //STEP 4: Execute a query
		      System.out.println("Inserting records into the table...");
		      
		      
		      String insertTableSQL = "INSERT INTO Registration"
						+ "(Username, Email, passowrd, Contactno) VALUES"
						+ "(?,?,?,?)";
		      
		      	preparedStatement = conn.prepareStatement(insertTableSQL);

				preparedStatement.setString(1, registerDAO.getUname());
				preparedStatement.setString(2, registerDAO.getEmail());
				preparedStatement.setString(3, registerDAO.getPassword());
				preparedStatement.setString(4, registerDAO.getContactNo());

				// execute insert SQL stetement
				preparedStatement.executeUpdate();

				System.out.println("Record is inserted into DBUSER table!");
		      
		}
		
		catch(Exception e){
			System.out.println("CATCH");
	      //Handle errors for Class.forName
	      e.printStackTrace();
	   }finally{
		   
		   
	      //finally block used to close resources
	      try{
	         if(preparedStatement!=null)
	            conn.close();
	      }catch(SQLException se){
	    	  
	    	  
	      }
	      try{
	         if(conn!=null)
	            conn.close();
	      }catch(SQLException se){
	         se.printStackTrace();
	      }
	   	}

		
		
		
		
	}

}
