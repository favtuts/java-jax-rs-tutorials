package com.favtuts.rest.crud.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.favtuts.rest.crud.model.CrudModel;

public class CrudService {
	Connection con;
	public CrudService() {
		
		try {
			String url = String.format("jdbc:mysql://localhost:3306/users");
			String uname = "root";
			String pwd = "";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, uname, pwd);
		} catch (Exception e) {
			System.out.println(e + "data insert unsuccess.");
		}
	}
	
	public CrudModel insertUser(CrudModel user) {
		String insert = "insert into person(name, age) values(?, ?)";
		
		try {
			PreparedStatement ps = con.prepareStatement(insert);			
			ps.setString(1, user.getName());
			ps.setLong(2, user.getAge());
			
			ps.execute();
		} catch (Exception e) {
			System.out.println(e + "data insert unsuccess.");
		}
		
		return user;
	}
	
	public ArrayList<CrudModel> getUser() throws SQLException {
		ArrayList<CrudModel> data = new ArrayList<CrudModel>();
		
		String select = "select * from person";
		PreparedStatement ps = con.prepareStatement(select);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			CrudModel model = new CrudModel();
			
			model.setId(rs.getInt("id"));
			model.setName(rs.getString("name")); // column name
			model.setAge(rs.getInt("age"));
			
			data.add(model);
		}
		
		return data;
	}
	
	public ArrayList<CrudModel> getUserById(int id) throws SQLException {
		
		ArrayList<CrudModel> data = new ArrayList<CrudModel>();		
		String select = "select * from person where id = ?";
		PreparedStatement ps = con.prepareStatement(select);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			CrudModel model = new CrudModel();
			
			model.setId(rs.getInt("id"));
			model.setName(rs.getString("name")); // column name
			model.setAge(rs.getInt("age"));
			
			data.add(model);
		}
		
		return data;
	}
	
	public CrudModel updateUser(CrudModel user) {
		String insert = "update person set name=?, age=? where id=?";
		
		try {
			PreparedStatement ps = con.prepareStatement(insert);			
			ps.setString(1, user.getName());
			ps.setLong(2, user.getAge());
			ps.setInt(3, user.getId());
			
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e + "data insert unsuccess.");
		}
		
		return user;
	}
	
	public int deletUser(int id) {
		String insert = "delete from person where id=?";
		
		try {
			PreparedStatement ps = con.prepareStatement(insert);			
			ps.setInt(1, id);
			
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e + "data insert unsuccess.");
		}
		
		return id;
	}
}
