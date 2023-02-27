package com.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Joining_clause {

	public static void main(String[] args) {
		try(Connection conn=DatabaseConnection.getConnection())
		{
//			Statement st=conn.createStatement();
//			String create="create table course(c_id int primary key auto_increment,"
//					+ "course_name varchar(20),teacher_id int,"
//					+ "foreign key (teacher_id) references teacher(id))";
//			
//			int row=st.executeUpdate(create);
//			System.out.println(row  +"table created successfully");
//		
//			Statement st1=conn.createStatement();
//			String q="insert into course(course_name,teacher_id) values ('JAVA',101),"
//					+ "('MYSQL',102),('DOT NET',null)";
//			int row=st1.executeUpdate(q);
//			System.out.println(row1 +" Records inserted successfully!!");
	
		Statement st2=conn.createStatement();
			//equi join
//			String sql="select t.id,t.name,t.course_name from teacher t,course c"
//					+ "where t.id=c.teacher_id";
			
//			//inner join 
//			String sql1="select t.id,t.name,t.course_name from teacher t inner join course c"
//					+ "on t.id=c.teacher_id";
//			
			//left join
			String sql2="select t.id,t.name,t.course_name from teacher t left join course c"
					+ "on t.id=c.teacher_id";
			ResultSet rs=st2.executeQuery(sql2);
			while(rs.next())
			{
				System.out.println("Teacher ID: "+rs.getInt(1));
				System.out.println("Teacher Name: "+rs.getString("name"));
				System.out.println("Course name: "+rs.getString("course_name"));
				System.out.println("***********************************");
				
			}
		}
catch(SQLException e)
		{
	System.out.println(e.getMessage());
		}
	}

}
