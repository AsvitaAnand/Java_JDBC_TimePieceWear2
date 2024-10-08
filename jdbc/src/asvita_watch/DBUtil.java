package asvita_watch;

import java.sql.DriverManager;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.DriverManager;

public class DBUtil {

	public Connection getDBConnection()

	{

		Connection con=null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root","");

		}

		catch(Exception e)

		{

			System.out.println(e);

		}

		return con;

	}



	public Connection getDBConnection1() {

		// TODO Auto-generated method stub

		return null;

	}



}


