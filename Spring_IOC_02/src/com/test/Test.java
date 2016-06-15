package com.test;

public class Test {
	
	private String  name;
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Test( String name) {
		this.name = name;
			
		System.out.println("test bean is created" +name);
	}

	
}
