package com.Example;

public class HelloWorld {
	
	private String name;
	

	public HelloWorld() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "HelloWorld [name=" + name + "]";
	}
	
	public void sayHello() {
		System.out.println("welcome to spring hello world.....!"+this.name);
	}
	
	

}
