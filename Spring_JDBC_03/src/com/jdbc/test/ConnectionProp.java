package com.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionProp {

	private String driver;
	private String url;
	private String userName;
	private String pwd;
	
	
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
	
	public void printConnection() throws Exception{
	
	Class.forName(driver);
	Connection con = DriverManager.getConnection(url,userName,pwd);
	System.out.println(con);
		
		
		
	}
	
}
