package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class fulltable
{
	public static void main(String[] args)throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select * from empdata2");
	while(rs.next())
	{
System.out.println("empid:"+rs.getInt(1)+"empname:"+rs.getString(2)+"empsal:"+rs.getInt(3)+"empemail:"+rs.getString(4)+"empphn:"+rs.getLong(5));
}
	con.close();
	}
}
