package com.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Con2 implements InitializingBean, DisposableBean {

	private String driver;
	private String url;
	private String userName;
	private String pwd;
	
	Connection con;

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("test");
		Class.forName(driver);
		con = DriverManager.getConnection(url,userName,pwd);
		
	}
	
	public void save(){
		
		PreparedStatement ps;
		try {
			ps = con.prepareStatement("insert into LOGIN VALUES (?,?)");
			ps.setString(1,userName );
			ps.setString(2, pwd );
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	@Override
	public void destroy() throws Exception {
	
		con.close();
	}

}
